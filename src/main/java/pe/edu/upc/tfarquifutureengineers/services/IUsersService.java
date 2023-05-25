package pe.edu.upc.tfarquifutureengineers.services;

import pe.edu.upc.tfarquifutureengineers.entities.Users;

import java.util.List;

public interface IUsersService {

    public void insert(Users users);
    List<Users> list();
}
