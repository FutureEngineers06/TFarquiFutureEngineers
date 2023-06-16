package pe.edu.upc.tfarquifutureengineers.entities;


import javax.persistence.*;

@Entity
@Table(name = "tutors")
public class Tutors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTutor;
    @Column(name = "especializacion",length = 60,nullable = false)
    private String especializacion;

    @ManyToOne
    @JoinColumn(name = "id_users")
    private Users Users_user_id;//FOREING KEY de USERS

    public Tutors() {

    }

    public Tutors(int idTutor, String especializacion, Users users_user_id) {
        this.idTutor = idTutor;
        this.especializacion = especializacion;
        Users_user_id = users_user_id;
    }

    public Users getUsers_user_id() {
        return Users_user_id;
    }

    public void setUsers_user_id(Users users_user_id) {
        Users_user_id = users_user_id;
    }

    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }
}
