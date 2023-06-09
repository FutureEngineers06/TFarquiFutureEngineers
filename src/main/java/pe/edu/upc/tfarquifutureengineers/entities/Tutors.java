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

    public Tutors() {

    }

    public Tutors(int idTutor, String especializacion) {
        this.idTutor = idTutor;
        this.especializacion = especializacion;
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
