package pe.edu.upc.tfarquifutureengineers.dtos;


import pe.edu.upc.tfarquifutureengineers.entities.Role;

import java.util.List;

public class UsersDTO {

    private Long idUsers;
    private String rol;
    private String username;
    private String correo_electronico;
    private String password;

    private Boolean enabled;

    private List<Role> roles;
}
