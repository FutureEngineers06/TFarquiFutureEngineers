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
    private String informacion;

    @Column(name="duracion", nullable = false)
    private Integer duracion;

    @Column(name="campo_laboral", length = 200, nullable = false)
    private String campo_laboral;

    //@ManyToOne//
    //@JoinColumn(name="idSimulations")
    //private Simulations simulation;

    //@ManyToOne
    //@JoinColumn(name="idTests")
    //private Tests tests;

    public Professions() {
    }

    public Professions(int idProfessions, String nombre, String informacion, Integer duracion, String campo_laboral) {
        this.idProfessions = idProfessions;
        this.nombre = nombre;
        this.informacion = informacion;
        this.duracion = duracion;
        this.campo_laboral = campo_laboral;
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

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
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


}
