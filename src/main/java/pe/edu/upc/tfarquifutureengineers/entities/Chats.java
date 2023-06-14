package pe.edu.upc.tfarquifutureengineers.entities;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
@Entity
@Table(name = "chats")

public class Chats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idChats;
    @Column(name = "mensaje_estudiante", length = 60,nullable = false)
    private String mensaje_estudiante;
    @Column(name = "mensaje_tutor", length = 60,nullable = false)
    private String mensaje_tutor;
    @Column(name = "fecha_envio")
    private LocalDate fecha_envio; //SimpleDateFormat

    @Column(name = "fecha_recepcion")
    private LocalDate fecha_recepcion; //SimpleDateFormat

    public Chats() {
    }

    public Chats(int idChats, String mensaje_estudiante, String mensaje_tutor, LocalDate fecha_envio, LocalDate fecha_recepcion) {
        this.idChats = idChats;
        this.mensaje_estudiante = mensaje_estudiante;
        this.mensaje_tutor = mensaje_tutor;
        this.fecha_envio = fecha_envio;
        this.fecha_recepcion = fecha_recepcion;
    }

    public int getIdChats() {
        return idChats;
    }

    public void setIdChats(int idChats) {
        this.idChats = idChats;
    }

    public String getMensaje_estudiante() {
        return mensaje_estudiante;
    }

    public void setMensaje_estudiante(String mensaje_estudiante) {
        this.mensaje_estudiante = mensaje_estudiante;
    }

    public String getMensaje_tutor() {
        return mensaje_tutor;
    }

    public void setMensaje_tutor(String mensaje_tutor) {
        this.mensaje_tutor = mensaje_tutor;
    }

    public LocalDate getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(LocalDate fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public LocalDate getFecha_recepcion() {
        return fecha_recepcion;
    }

    public void setFecha_recepcion(LocalDate fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }
}
