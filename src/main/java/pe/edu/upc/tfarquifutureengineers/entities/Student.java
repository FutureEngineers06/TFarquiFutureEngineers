package pe.edu.upc.tfarquifutureengineers.entities;

public class Student {
    private int idStudent;
    private String colegio;
    private int edad;
    private int users_user_id;
    private int membresia_id;
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
}
