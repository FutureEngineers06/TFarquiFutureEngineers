package pe.edu.upc.tfarquifutureengineers.dtos;

import pe.edu.upc.tfarquifutureengineers.entities.Simulations;
import pe.edu.upc.tfarquifutureengineers.entities.Tests;


public class ProfessionsDTO {
    private int idProfessions;

    private String nombre;

    private String información;

    private Integer duracion;

    private String campo_laboral;

    private Simulations simulation;

    private Tests tests;

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
