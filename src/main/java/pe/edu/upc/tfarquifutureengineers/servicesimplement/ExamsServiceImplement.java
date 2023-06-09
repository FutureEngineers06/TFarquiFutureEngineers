package pe.edu.upc.tfarquifutureengineers.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.tfarquifutureengineers.entities.Exams;
import pe.edu.upc.tfarquifutureengineers.entities.Simulations;
import pe.edu.upc.tfarquifutureengineers.repositories.IExamsRepository;
import pe.edu.upc.tfarquifutureengineers.services.IExamsService;

import java.util.List;

public class ExamsServiceImplement implements IExamsService {

    @Autowired
    private IExamsRepository eR;

    @Override
    public void insertar(Exams exams) {
        eR.save(exams);
    }

    @Override
    public List<Exams> listar() {
        return eR.findAll();
    }

    @Override
    public void delete(int idExams) {
        eR.deleteById(idExams);
    }

    @Override
    public Exams listId(int idExams) {
        return eR.findById(idExams).orElse(new Exams());
    }
}
