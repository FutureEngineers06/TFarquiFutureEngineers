package pe.edu.upc.tfarquifutureengineers.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfarquifutureengineers.entities.Users;
import pe.edu.upc.tfarquifutureengineers.repositories.IUsersRepository;
import pe.edu.upc.tfarquifutureengineers.services.IUsersService;

import java.util.List;
@Service
public class UsersServiceImplement implements IUsersService {
    @Autowired
    private IUsersRepository sR;

    //@Override
    //public void insert(Users users) {
    //    sR.save(users);
    //}

    //@Override
    //public List<Users> list() {
    //    return sR.findAll();
    //}

    //@Override
    //public void delete(int idUsers){
    //    sR.deleteById(idUsers);
    //}

    //@Override
    //public Users listid(int idUsers) {
    //    return sR.findById(idUsers).orElse(new Users());
   // }

    //////////////////////////////
    @Override
    public Integer insert(Users user) {
        int rpta = sR.buscarUsername(user.getUsername());
        if (rpta == 0) {
            sR.save(user);
        }
        return rpta;
    }

    @Override
    public List<Users> list() {
        // TODO Auto-generated method stub
        return sR.findAll();
    }
    //////////////////////////////
}
