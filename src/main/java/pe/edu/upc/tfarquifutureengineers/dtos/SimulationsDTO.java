package pe.edu.upc.tfarquifutureengineers.dtos;

import javax.persistence.Column;

public class SimulationsDTO {
    private int idSimulation;

    private String nameCurso;

    private String planCurso;

    private String metodologiaCurso;

    private String duracionHoras;

    public int getIdSimulation() {
        return idSimulation;
    }

    public void setIdSimulation(int idSimulation) {
        this.idSimulation = idSimulation;
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
