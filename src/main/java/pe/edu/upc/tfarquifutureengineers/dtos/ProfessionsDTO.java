package pe.edu.upc.tfarquifutureengineers.dtos;

import pe.edu.upc.tfarquifutureengineers.entities.Simulations;
import pe.edu.upc.tfarquifutureengineers.entities.Tests;


public class ProfessionsDTO {
    private int idProfessions;

    private String nombre;

    private String informacion;

    private Integer duracion;

    private String campo_laboral;



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
