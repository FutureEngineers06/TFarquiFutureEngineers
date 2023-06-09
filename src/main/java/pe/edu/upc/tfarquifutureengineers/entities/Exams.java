package pe.edu.upc.tfarquifutureengineers.entities;

import javax.persistence.*;

@Entity
@Table(name="exams")
public class Exams {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExams;

    @Column(name="cantidadPreguntas", nullable = false)
    private Integer cantidadPreguntas;

    @Column(name="preguntaExam", nullable = false)
    private String preguntaExam;

    @Column(name="respuestaExam", nullable = false)
    private String respuestaExam;

    @Column(name="calificacionExam", nullable = false)
    private String calificacion;

    @ManyToOne
    @JoinColumn(name="idSimulations")
    private Simulations simulation;

    public Exams() {
    }

    public Exams(int idExams, Integer cantidadPreguntas, String preguntaExam, String respuestaExam, String calificacion, Simulations simulation) {
        this.idExams = idExams;
        this.cantidadPreguntas = cantidadPreguntas;
        this.preguntaExam = preguntaExam;
        this.respuestaExam = respuestaExam;
        this.calificacion = calificacion;
        this.simulation = simulation;
    }

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
