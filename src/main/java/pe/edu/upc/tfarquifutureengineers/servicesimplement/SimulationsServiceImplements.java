package pe.edu.upc.tfarquifutureengineers.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfarquifutureengineers.dtos.ProfessionsSimulationsDTO;
import pe.edu.upc.tfarquifutureengineers.entities.Simulations;
import pe.edu.upc.tfarquifutureengineers.repositories.ISimulationsRepository;
import pe.edu.upc.tfarquifutureengineers.services.ISimulationsService;

import java.util.ArrayList;
import java.util.List;

@Service
public class SimulationsServiceImplements implements ISimulationsService {

    @Autowired
    private ISimulationsRepository sR;

    @Override
    public void insert(Simulations simulations) {
        sR.save(simulations);
    }

    @Override
    public List<Simulations> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int idSimulation) {
        sR.deleteById(idSimulation);
    }

    @Override
    public Simulations listId(int idSimulations) {

        return sR.findById(idSimulations).orElse(new Simulations());
    }

    @Override
    public List<ProfessionsSimulationsDTO> reporte01() {
        List<String[]> countSimulationByProfession = sR.getCountSimulationByProfessions();
        List<ProfessionsSimulationsDTO> professionsSimulationsDTOS = new ArrayList<>();

        for (String[] data : countSimulationByProfession) {
            ProfessionsSimulationsDTO dto = new ProfessionsSimulationsDTO();
            dto.setNombre(data[0]);
            dto.setSimulationCount(Integer.parseInt(data[1]));
            professionsSimulationsDTOS.add(dto);
        }

        return professionsSimulationsDTOS;

    }
}
