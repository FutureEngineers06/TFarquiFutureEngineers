package pe.edu.upc.tfarquifutureengineers.entities;

import javax.persistence.*;

@Entity
@Table(name="exams")
public class Exams {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExams;

    @Column(name="cantidad_preguntas", nullable = false)
    private Integer cantidad_preguntas;

    @Column(name="pregunta_exam",length = 100, nullable = false)
    private String pregunta_exam;

    @Column(name="respuesta_exam",length = 50, nullable = false)
    private String respuesta_exam;

    @Column(name="calificacion_exam",length = 50, nullable = false)
    private String calificacion_exam;

    @ManyToOne
    @JoinColumn(name="idSimulations")
    private Simulations simulation;

    public Exams() {
    }

    public Exams(int idExams, Integer cantidad_preguntas, String pregunta_exam, String respuesta_exam, String calificacion_exam, Simulations simulation) {
        this.idExams = idExams;
        this.cantidad_preguntas = cantidad_preguntas;
        this.pregunta_exam = pregunta_exam;
        this.respuesta_exam = respuesta_exam;
        this.calificacion_exam = calificacion_exam;
        this.simulation = simulation;
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
