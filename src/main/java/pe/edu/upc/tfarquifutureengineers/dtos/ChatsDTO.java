package pe.edu.upc.tfarquifutureengineers.dtos;

import javax.persistence.Column;
import java.time.LocalDate;

public class ChatsDTO {
    private int idChats;
    private String mensaje_estudiante;

    private String mensaje_tutor;

    private LocalDate fecha_envio;

    private LocalDate fecha_recepcion;

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
