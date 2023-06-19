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
    private Tutors tutor;//FOREING KEY DE TUTORS
    private Users user;//FOREING KEY de USERS
    private boolean status;
    private Chats chat;//FOREING KEY DE CHATS

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

    public Tutors getTutor() {
        return tutor;
    }

    public void setTutor(Tutors tutor) {
        this.tutor = tutor;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Chats getChat() {
        return chat;
    }

    public void setChat(Chats chat) {
        this.chat = chat;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
