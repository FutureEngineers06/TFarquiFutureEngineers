package pe.edu.upc.tfarquifutureengineers.dtos;

import pe.edu.upc.tfarquifutureengineers.entities.Professions;

import javax.persistence.Column;

public class SimulationsDTO {
    private int idSimulations;

    private String name_curso;

    private String plan_curso;

    private String metodologia_curso;

    private String duracion_horas;

    private Professions professions;

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
