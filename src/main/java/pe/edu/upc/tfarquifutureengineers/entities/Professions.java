package pe.edu.upc.tfarquifutureengineers.entities;

import javax.persistence.*;

@Entity
@Table(name="professions")
public class Professions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfessions;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name="información", length = 100, nullable = false)
    private String información;

    @Column(name="duracion", nullable = false)
    private Integer duracion;

    @Column(name="campo_laboral", length = 200, nullable = false)
    private String campo_laboral;

    @ManyToOne
    @JoinColumn(name="idSimulations")
    private Simulations simulation;

    @ManyToOne
    @JoinColumn(name="idTests")
    private Tests tests;

    public Professions() {
    }

    public Professions(int idProfessions, String nombre, String información, Integer duracion, String campo_laboral, Simulations simulation, Tests tests) {
        this.idProfessions = idProfessions;
        this.nombre = nombre;
        this.información = información;
        this.duracion = duracion;
        this.campo_laboral = campo_laboral;
        this.simulation = simulation;
        this.tests = tests;
    }

    public int getIdProfessions() {
        return idProfessions;
    }

    public void setIdProfessions(int idProfessions) {
        this.idProfessions = idProfessions;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInformación() {
        return información;
    }

    public void setInformación(String información) {
        this.información = información;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getCampo_laboral() {
        return campo_laboral;
    }

    public void setCampo_laboral(String campo_laboral) {
        this.campo_laboral = campo_laboral;
    }

    public Simulations getSimulation() {
        return simulation;
    }

    public void setSimulation(Simulations simulation) {
        this.simulation = simulation;
    }

    public Tests getTests() {
        return tests;
    }

    public void setTests(Tests tests) {
        this.tests = tests;
    }
}
