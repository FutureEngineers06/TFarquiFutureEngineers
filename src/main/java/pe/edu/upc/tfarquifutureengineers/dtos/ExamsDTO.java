package pe.edu.upc.tfarquifutureengineers.dtos;

import pe.edu.upc.tfarquifutureengineers.entities.Simulations;

public class ExamsDTO {
    private int idExams;
    private Integer cantidadPreguntas;

    private String preguntaExam;

    private String respuestaExam;

    private String calificacion;

    private Simulations simulation;

    public int getIdExam() {
        return idExams;
    }

    public void setIdExam(int idExams) {
        this.idExams = idExams;
    }

    public Integer getCantidadPreguntas() {
        return cantidadPreguntas;
    }

    public void setCantidadPreguntas(Integer cantidadPreguntas) {
        this.cantidadPreguntas = cantidadPreguntas;
    }

    public String getPreguntaExam() {
        return preguntaExam;
    }

    public void setPreguntaExam(String preguntaExam) {
        this.preguntaExam = preguntaExam;
    }

    public String getRespuestaExam() {
        return respuestaExam;
    }

    public void setRespuestaExam(String respuestaExam) {
        this.respuestaExam = respuestaExam;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public Simulations getSimulation() {
        return simulation;
    }

    public void setSimulation(Simulations simulation) {
        this.simulation = simulation;
    }
}
