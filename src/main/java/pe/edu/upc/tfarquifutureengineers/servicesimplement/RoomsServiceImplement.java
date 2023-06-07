package pe.edu.upc.tfarquifutureengineers.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfarquifutureengineers.entities.Rooms;
import pe.edu.upc.tfarquifutureengineers.repositories.IRoomsRepository;
import pe.edu.upc.tfarquifutureengineers.services.IRoomsService;

import java.util.List;
@Service
public class RoomsServiceImplement implements IRoomsService {
    @Autowired
    private IRoomsRepository rR;

    @Override
    public void insert(Rooms rooms) {
        rR.save(rooms);
    }

    @Override
    public List<Rooms> list() {
        return rR.findAll();
    }
}
