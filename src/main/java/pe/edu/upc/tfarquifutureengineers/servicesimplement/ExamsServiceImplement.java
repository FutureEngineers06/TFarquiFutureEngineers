package pe.edu.upc.tfarquifutureengineers.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfarquifutureengineers.dtos.ExamsSimulationsDTO;
import pe.edu.upc.tfarquifutureengineers.entities.Exams;
import pe.edu.upc.tfarquifutureengineers.entities.Simulations;
import pe.edu.upc.tfarquifutureengineers.repositories.IExamsRepository;
import pe.edu.upc.tfarquifutureengineers.services.IExamsService;

import java.util.ArrayList;
import java.util.List;

@Service
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

    @Override
    public List<ExamsSimulationsDTO> reporte02() {

        List<String[]> countExamsBySimulations = eR.getCountExamsBySimulations();
        List<ExamsSimulationsDTO> examsSimulationsDTOS = new ArrayList<>();

        for (String[] data : countExamsBySimulations) {
            ExamsSimulationsDTO dto = new ExamsSimulationsDTO();
            dto.setName_curso(data[0]);
            dto.setExamsCount(Integer.parseInt(data[1]));
            examsSimulationsDTOS.add(dto);
        }

        return examsSimulationsDTOS;
    }
}
