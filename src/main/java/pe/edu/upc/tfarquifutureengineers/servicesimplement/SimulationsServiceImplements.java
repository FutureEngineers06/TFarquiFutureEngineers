package pe.edu.upc.tfarquifutureengineers.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfarquifutureengineers.entities.Simulations;
import pe.edu.upc.tfarquifutureengineers.repositories.ISimulationsRepository;
import pe.edu.upc.tfarquifutureengineers.services.ISimulationsService;

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
    public Simulations listId(int idSimulation) {

        return sR.findById(idSimulation).orElse(new Simulations());
    }
}
