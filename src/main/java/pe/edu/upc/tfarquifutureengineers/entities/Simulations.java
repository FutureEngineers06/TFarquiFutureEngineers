package pe.edu.upc.tfarquifutureengineers.entities;

import javax.persistence.*;

@Entity
@Table(name="simulations")
public class Simulations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSimulations;

    @Column(name = "name_curso", length = 50, nullable = false)
    private String name_curso;

    @Column(name="plan_curso", length = 100, nullable = false)
    private String plan_curso;

    @Column(name="metodologia_curso", length = 200, nullable = false)
    private String metodologia_curso;

    @Column(name="duracion_horas", length = 2, nullable = false)
    private String duracion_horas;

    @ManyToOne
    @JoinColumn(name = "idProfessions")
    private Professions professions;//FOREING KEY

    public Simulations(){}

    public Simulations(int idSimulations, String name_curso, String plan_curso, String metodologia_curso, String duracion_horas, Professions professions) {
        this.idSimulations = idSimulations;
        this.name_curso = name_curso;
        this.plan_curso = plan_curso;
        this.metodologia_curso = metodologia_curso;
        this.duracion_horas = duracion_horas;
        this.professions = professions;
    }

    public Professions getProfessions() {
        return professions;
    }

    public void setProfessions(Professions professions) {
        this.professions = professions;
    }

    public int getIdSimulations() {
        return idSimulations;
    }

    public void setIdSimulations(int idSimulations) {
        this.idSimulations = idSimulations;
    }

    public String getName_curso() {
        return name_curso;
    }

    public void setName_curso(String name_curso) {
        this.name_curso = name_curso;
    }

    public String getPlan_curso() {
        return plan_curso;
    }

    public void setPlan_curso(String plan_curso) {
        this.plan_curso = plan_curso;
    }

    public String getMetodologia_curso() {
        return metodologia_curso;
    }

    public void setMetodologia_curso(String metodologia_curso) {
        this.metodologia_curso = metodologia_curso;
    }

    public String getDuracion_horas() {
        return duracion_horas;
    }

    public void setDuracion_horas(String duracion_horas) {
        this.duracion_horas = duracion_horas;
    }
}
