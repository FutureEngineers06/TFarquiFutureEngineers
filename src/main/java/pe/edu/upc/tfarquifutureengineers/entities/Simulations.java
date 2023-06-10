package pe.edu.upc.tfarquifutureengineers.entities;

import javax.persistence.*;

@Entity
@Table(name="simulations")
public class Simulations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSimulations;

    @Column(name = "nameCurso", length = 50, nullable = false)
    private String nameCurso;

    @Column(name="planCurso", length = 100, nullable = false)
    private String planCurso;

    @Column(name="metodologiaCurso", length = 200, nullable = false)
    private String metodologiaCurso;

    @Column(name="duracionHoras", length = 2, nullable = false)
    private String duracionHoras;

    public Simulations(){}

    public Simulations(int idSimulations, String nameCurso, String planCurso, String metodologiaCurso, String duracionHoras) {
        this.idSimulations = idSimulations;
        this.nameCurso= nameCurso;
        this.planCurso= planCurso;
        this.metodologiaCurso=metodologiaCurso;
        this.duracionHoras= duracionHoras;
    }

    public int getIdSimulations() {
        return idSimulations;
    }

    public void setIdSimulations(int idSimulations) {
        this.idSimulations = idSimulations;
    }

    public String getNameCurso() {
        return nameCurso;
    }

    public void setNameCurso(String nameCurso) {
        this.nameCurso = nameCurso;
    }

    public String getPlanCurso() {
        return planCurso;
    }

    public void setPlanCurso(String planCurso) {
        this.planCurso = planCurso;
    }

    public String getMetodologiaCurso() {
        return metodologiaCurso;
    }

    public void setMetodologiaCurso(String metodologiaCurso) {
        this.metodologiaCurso = metodologiaCurso;
    }

    public String getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(String duracionHoras) {
        this.duracionHoras = duracionHoras;
    }
}
