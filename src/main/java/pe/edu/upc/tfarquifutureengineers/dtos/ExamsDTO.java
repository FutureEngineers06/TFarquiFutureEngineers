package pe.edu.upc.tfarquifutureengineers.dtos;

import pe.edu.upc.tfarquifutureengineers.entities.Simulations;

public class ExamsDTO {
    private int idExams;
    private Integer cantidad_preguntas;

    private String pregunta_exam;

    private String respuesta_exam;

    private String calificacion_exam;

    private Simulations simulation;

    public int getIdExam() {
        return idExams;
    }

    public void setIdExam(int idExams) {
        this.idExams = idExams;
    }

    public int getIdExams() {
        return idExams;
    }

    public void setIdExams(int idExams) {
        this.idExams = idExams;
    }

    public Integer getCantidad_preguntas() {
        return cantidad_preguntas;
    }

    public void setCantidad_preguntas(Integer cantidad_preguntas) {
        this.cantidad_preguntas = cantidad_preguntas;
    }

    public String getPregunta_exam() {
        return pregunta_exam;
    }

    public void setPregunta_exam(String pregunta_exam) {
        this.pregunta_exam = pregunta_exam;
    }

    public String getRespuesta_exam() {
        return respuesta_exam;
    }

    public void setRespuesta_exam(String respuesta_exam) {
        this.respuesta_exam = respuesta_exam;
    }

    public String getCalificacion_exam() {
        return calificacion_exam;
    }

    public void setCalificacion_exam(String calificacion_exam) {
        this.calificacion_exam = calificacion_exam;
    }

    public Simulations getSimulation() {
        return simulation;
    }

    public void setSimulation(Simulations simulation) {
        this.simulation = simulation;
    }
}
