package pe.edu.upc.tfarquifutureengineers.dtos;

import pe.edu.upc.tfarquifutureengineers.entities.Chats;
import pe.edu.upc.tfarquifutureengineers.entities.Tutors;
import pe.edu.upc.tfarquifutureengineers.entities.Users;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class RoomsDTO {
    private Integer idRooms;//PRIMARY KEY
    private Integer codigo;
    private String Nombre;
    private Integer cantidad_alumnos;
    private Tutors Tutores_id;//FOREING KEY DE TUTORS
    private Users Tutores_Users_user_id;//FOREING KEY de USERS
    private boolean status;
    private Chats Chats_id;//FOREING KEY DE CHATS

    public Integer getIdRooms() {
        return idRooms;
    }

    public void setIdRooms(Integer idRooms) {
        this.idRooms = idRooms;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getCantidad_alumnos() {
        return cantidad_alumnos;
    }

    public void setCantidad_alumnos(Integer cantidad_alumnos) {
        this.cantidad_alumnos = cantidad_alumnos;
    }

    public Tutors getTutores_id() {
        return Tutores_id;
    }

    public void setTutores_id(Tutors tutores_id) {
        Tutores_id = tutores_id;
    }

    public Users getTutores_Users_user_id() {
        return Tutores_Users_user_id;
    }

    public void setTutores_Users_user_id(Users tutores_Users_user_id) {
        Tutores_Users_user_id = tutores_Users_user_id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Chats getChats_id() {
        return Chats_id;
    }

    public void setChats_id(Chats chats_id) {
        Chats_id = chats_id;
    }
}
