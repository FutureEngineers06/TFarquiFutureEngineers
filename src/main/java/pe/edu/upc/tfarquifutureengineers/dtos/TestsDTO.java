package pe.edu.upc.tfarquifutureengineers.dtos;

import pe.edu.upc.tfarquifutureengineers.entities.Student;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class TestsDTO {

    private int idTests;

    private String preguntas;

    private String respuestas;

    private String resultado;

    private Student students_id;

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
