package pe.edu.upc.tfarquifutureengineers.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.tfarquifutureengineers.entities.Professions;
import pe.edu.upc.tfarquifutureengineers.repositories.IProfessionsRepository;
import pe.edu.upc.tfarquifutureengineers.services.IProfessionsService;

import java.util.List;

public class IProfessionsServiceImplement implements IProfessionsService {

    @Autowired
    private IProfessionsRepository pR;

    @Override
    public void insert(Professions professions) {
        pR.save(professions);
    }

    @Override
    public List<Professions> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idProfessions) {
        pR.deleteById(idProfessions);
    }

    @Override
    public Professions listId(int idProfessions) {

        return pR.findById(idProfessions).orElse(new Professions());
    }

}
