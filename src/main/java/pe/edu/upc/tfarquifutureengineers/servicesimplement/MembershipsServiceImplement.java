package pe.edu.upc.tfarquifutureengineers.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfarquifutureengineers.entities.Memberships;
import pe.edu.upc.tfarquifutureengineers.repositories.IMembershipsRepository;
import pe.edu.upc.tfarquifutureengineers.services.IMembershipsService;

import java.util.List;

@Service
public class MembershipsServiceImplement implements IMembershipsService {

    @Autowired
    private IMembershipsRepository mR;

    @Override
    public void insert(Memberships memberships) {
        mR.save(memberships);
    }

    @Override
    public List<Memberships> list() {
        return mR.findAll();
    }

    @Override
    public void delete(int idMemberships) {
    mR.deleteById(idMemberships);
    }

    @Override
    public Memberships listId(int idMemberships) {
        return mR.findById(idMemberships).orElse(new Memberships());
    }
}
