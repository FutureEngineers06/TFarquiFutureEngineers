package pe.edu.upc.tfarquifutureengineers.services;

import pe.edu.upc.tfarquifutureengineers.entities.Users;

import java.util.List;

public interface IUsersService {

    //public void insert(Users users);
    /////////////////
    public Integer insert(Users user);
    /////////////////
    List<Users> list();
    public void delete(int idUsers);
    public Users listid(int idUsers);
}
