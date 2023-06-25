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

    //@Column(name = "nombre_completo", length = 100,nullable = false)
    @Column(name = "nombre_completo", length = 100)
    private String nombre_completo;

    //@Column(name = "correo_electronico", length = 100,nullable = false)
    @Column(name = "correo_electronico", length = 100)
    private String correo_electronico;

    @ManyToOne
    @JoinColumn(name = "idMemberships")
    private Memberships memberships;

    public Student() {
    }

    public Student(int idStudents, String colegio, int edad, String nombre_completo, String correo_electronico, Memberships memberships) {
        this.idStudents = idStudents;
        this.colegio = colegio;
        this.edad = edad;
        this.nombre_completo = nombre_completo;
        this.correo_electronico = correo_electronico;
        this.memberships = memberships;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public Memberships getMemberships() {
        return memberships;
    }

    public void setMemberships(Memberships memberships) {
        this.memberships = memberships;
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


}
