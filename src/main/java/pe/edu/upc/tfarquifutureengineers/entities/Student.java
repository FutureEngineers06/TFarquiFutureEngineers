package pe.edu.upc.tfarquifutureengineers.entities;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idStudents;
    @Column(name = "colegio", length = 60, nullable = false)
    private String colegio;
    @Column(name = "edad", nullable = false)
    private int edad;

    @ManyToOne
    @JoinColumn(name = "idMemberships")
    private Memberships memberships_id;

    public Student() {
    }

    public Student(int idStudents, String colegio, int edad, Memberships memberships_id) {
        this.idStudents = idStudents;
        this.colegio = colegio;
        this.edad = edad;
        this.memberships_id = memberships_id;
    }

    public int getIdStudents() {
        return idStudents;
    }

    public void setIdStudents(int idStudents) {
        this.idStudents = idStudents;
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

    public Memberships getMemberships() {
        return memberships_id;
    }

    public void setMemberships(Memberships memberships_id) {
        this.memberships_id = memberships_id;
    }
}
