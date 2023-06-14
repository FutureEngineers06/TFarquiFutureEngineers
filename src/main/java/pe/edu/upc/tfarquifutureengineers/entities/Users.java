package pe.edu.upc.tfarquifutureengineers.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "users")
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUsers;
    @Column(name = "rol", length = 20,nullable = false)
    private String rol;
    //@Column(name = "nombre_completo", length = 100,nullable = false)
    @Column(name = "username", length = 100,unique = true)
    private String username;//username
    @Column(name = "correo_electronico", length = 100,nullable = false)
    private String correo_electronico;
    @Column(name = "password", length = 150,nullable = false)
    private String password;//password

    /////
    private Boolean enabled;

    //@JoinColumn(name = "user_id")//mirar si user_id da problemas-sino usar idUsers
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")//mirar si idUsers da problemas-sino usar user_id
    private List<Role> roles;
    /////

    public Users() {

    }

    public Users(long idUsers, String rol, String username, String correo_electronico, String password, Boolean enabled, List<Role> roles) {
        this.idUsers = idUsers;
        this.rol = rol;
        this.username = username;
        this.correo_electronico = correo_electronico;
        this.password = password;
        this.enabled = enabled;
        this.roles = roles;
    }

    public long getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(long idUsers) {
        this.idUsers = idUsers;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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
}
