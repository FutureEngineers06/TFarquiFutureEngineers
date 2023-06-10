package pe.edu.upc.tfarquifutureengineers.entities;

import javax.persistence.*;

@Entity
@Table(name="tests")
public class Tests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTests;

    @Column(name="preguntas", nullable = false)
    private String preguntas;

    @Column(name="respuestas", nullable = false)
    private String respuestas;

    @Column(name="resultado", nullable = false)
    private String resultado;

    @OneToOne
    @JoinColumn(name="idStudents")
    private Student students_id;

    // student_user_id


    public Tests() {
    }

    public Tests(int idTests, String preguntas, String respuestas, String resultado, Student students_id) {
        this.idTests = idTests;
        this.preguntas = preguntas;
        this.respuestas = respuestas;
        this.resultado = resultado;
        this.students_id = students_id;
    }

    public int getIdTests() {
        return idTests;
    }

    public void setIdTests(int idTests) {
        this.idTests = idTests;
    }

    public String getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(String preguntas) {
        this.preguntas = preguntas;
    }

    public String getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(String respuestas) {
        this.respuestas = respuestas;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Student getStudent() {
        return students_id;
    }

    public void setStudent(Student students_id) {
        this.students_id = students_id;
    }
}
