package pe.edu.upc.tfarquifutureengineers.entities;


import javax.persistence.*;

@Entity
@Table(name = "tutors")
public class Tutors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTutors;
    @Column(name = "especializacion",length = 60,nullable = false)
    private String especializacion;

    @Column(name = "nombre_completo", length = 100)
    private String nombre_completo;

    //@Column(name = "correo_electronico", length = 100,nullable = false)
    @Column(name = "correo_electronico", length = 100)
    private String correo_electronico;

    //@ManyToOne
    //@JoinColumn(name = "idUsers")
    //private Users user;//FOREING KEY de USERS

    public Tutors() {

    }

    public Tutors(int idTutors, String especializacion, String nombre_completo, String correo_electronico) {
        this.idTutors = idTutors;
        this.especializacion = especializacion;
        this.nombre_completo = nombre_completo;
        this.correo_electronico = correo_electronico;
    }

    public int getIdTutors() {
        return idTutors;
    }

    public void setIdTutors(int idTutors) {
        this.idTutors = idTutors;
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

    //public Users getUser() {
    //    return user;
    //}

    //public void setUser(Users user) {
    //    this.user = user;
    //}



    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }
}
