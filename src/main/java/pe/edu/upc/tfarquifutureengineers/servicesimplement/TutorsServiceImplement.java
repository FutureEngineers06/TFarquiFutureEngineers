package pe.edu.upc.tfarquifutureengineers.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfarquifutureengineers.entities.Student;
import pe.edu.upc.tfarquifutureengineers.entities.Tutors;
import pe.edu.upc.tfarquifutureengineers.repositories.ITutorsRepository;
import pe.edu.upc.tfarquifutureengineers.services.ITutorsService;

import java.util.List;
@Service
public class TutorsServiceImplement implements ITutorsService {

    @Autowired
    private ITutorsRepository tR;

    @Override
    public void insert(Tutors tutors) {
        tR.save(tutors);
    }

    @Override
    public List<Tutors> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int idTutor) {
        tR.deleteById(idTutor);
    }

    @Override
    public Tutors listId(int idTutor) {
        return tR.findById(idTutor).orElse(new Tutors());
    }
}
