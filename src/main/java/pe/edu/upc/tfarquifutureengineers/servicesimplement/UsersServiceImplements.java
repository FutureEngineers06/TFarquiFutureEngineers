package pe.edu.upc.tfarquifutureengineers.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.tfarquifutureengineers.entities.Users;
import pe.edu.upc.tfarquifutureengineers.repositories.ISimulationsRepository;
import pe.edu.upc.tfarquifutureengineers.repositories.IUsersRepository;
import pe.edu.upc.tfarquifutureengineers.services.IUsersService;

import java.util.List;

public class UsersServiceImplements implements IUsersService {

    @Autowired
    private IUsersRepository uR;

    @Override
    public void insert(Users users) {
        uR.save(users);
    }

    @Override
    public List<Users> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int idUsers) {
        uR.deleteById(idUsers);
    }

    @Override
    public Users listid(int idUsers) {
        return uR.findById(idUsers).orElse(new Users());
    }
}
