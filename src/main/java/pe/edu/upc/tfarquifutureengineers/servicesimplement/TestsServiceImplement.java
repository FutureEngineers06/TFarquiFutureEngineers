package pe.edu.upc.tfarquifutureengineers.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfarquifutureengineers.entities.Tests;
import pe.edu.upc.tfarquifutureengineers.repositories.ITestsRepository;
import pe.edu.upc.tfarquifutureengineers.services.ITestsService;

import java.util.List;

@Service
public class TestsServiceImplement implements ITestsService {

    @Autowired
    private ITestsRepository tR;

    @Override
    public void insert(Tests tests) {
        tR.save(tests);
    }

    @Override
    public List<Tests> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int idTests) {
        tR.deleteById(idTests);
    }

    @Override
    public Tests listId(int idTests) {

        return tR.findById(idTests).orElse(new Tests());
    }
}
