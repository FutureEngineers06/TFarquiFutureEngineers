package pe.edu.upc.tfarquifutureengineers.entities;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idStudent;
    @Column(name = "colegio",length = 60,nullable = false)
    private String colegio;
    @Column(name = "edad", nullable = false)
    private int edad;
    @Column(name = "users_user_id",nullable = false)
    private int users_user_id;
    @Column(name = "membresia_id",nullable = false)
    private int membresia_id;
    @Column(name="sala_id",nullable = false)
    private int sala_id;

    public Student() {
    }

    public Student(int idStudent, String colegio, int edad, int users_user_id, int membresia_id, int sala_id) {
        this.idStudent = idStudent;
        this.colegio = colegio;
        this.edad = edad;
        this.users_user_id = users_user_id;
        this.membresia_id = membresia_id;
        this.sala_id = sala_id;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getUsers_user_id() {
        return users_user_id;
    }

    public void setUsers_user_id(int users_user_id) {
        this.users_user_id = users_user_id;
    }

    public int getMembresia_id() {
        return membresia_id;
    }

    public void setMembresia_id(int membresia_id) {
        this.membresia_id = membresia_id;
    }

    public int getSala_id() {
        return sala_id;
    }

    public void setSala_id(int sala_id) {
        this.sala_id = sala_id;
    }
}
