package pe.edu.upc.tfarquifutureengineers.entities;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

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
    //@Column(name = "fecha_envio")
    //private SimpleDateFormat fecha_envio; //SimpleDateFormat

    //@Column(name = "fecha_recepcion")
    //private SimpleDateFormat fecha_recepcion; //SimpleDateFormat
    @Column(name = "fecha_envio")
    private Date fecha_envio;

    @Column(name = "fecha_recepcion")
    private Date fecha_recepcion;
    public Chats() {
    }

    public Chats(int idChats, String mensaje_estudiante, String mensaje_tutor, Date fecha_envio, Date fecha_recepcion) {
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

    public Date getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(Date fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public Date getFecha_recepcion() {
        return fecha_recepcion;
    }

    public void setFecha_recepcion(Date fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }

}
