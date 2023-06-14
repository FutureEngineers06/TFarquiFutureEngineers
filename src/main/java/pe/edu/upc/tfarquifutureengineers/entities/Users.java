package pe.edu.upc.tfarquifutureengineers.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsers;
    @Column(name = "rol", length = 20,nullable = false)
    private String rol;
    //@Column(name = "nombre_completo", length = 100,nullable = false)
    @Column(name = "nombre_completo", length = 100,unique = true)
    private String nombre_completo;//username
    @Column(name = "correo_electronico", length = 100,nullable = false)
    private String correo_electronico;
    @Column(name = "contraseña", length = 150,nullable = false)
    private String contraseña;//password

    /////
    private Boolean enabled;

    //@JoinColumn(name = "user_id")//mirar si user_id da problemas-sino usar idUsers
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "idUsers")//mirar si idUsers da problemas-sino usar user_id
    private List<Role> roles;
    /////

    public Users() {

    }

    public Users(int idUsers, String rol, String nombre_completo, String correo_electronico, String contraseña) {
        this.idUsers = idUsers;
        this.rol = rol;
        this.nombre_completo = nombre_completo;
        this.correo_electronico = correo_electronico;
        this.contraseña = contraseña;
    }

    public int getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(int idUsers) {
        this.idUsers = idUsers;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

////////////
public Boolean getEnabled() {
    return enabled;
}

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
    ////////////////////
}
