package pe.edu.upc.tfarquifutureengineers.dtos;

import pe.edu.upc.tfarquifutureengineers.entities.Chats;
import pe.edu.upc.tfarquifutureengineers.entities.Student;
import pe.edu.upc.tfarquifutureengineers.entities.Tutors;
import pe.edu.upc.tfarquifutureengineers.entities.Users;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class RoomsDTO {
    private Integer idRooms;//PRIMARY KEY
    private Integer codigo;
    private String nombre;
    private Integer room_duration;
    private Tutors tutor;//FOREING KEY DE TUTORS
    private Student student;//FOREING KEY de USERS
    //private Users user;//FOREING KEY de USERS
    //private boolean status;
    private Chats chat;//FOREING KEY DE CHATS

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

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
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getRoom_duration() {
        return room_duration;
    }

    public void setRoom_duration(Integer room_duration) {
        this.room_duration = room_duration;
    }

    public Tutors getTutor() {
        return tutor;
    }

    public void setTutor(Tutors tutor) {
        this.tutor = tutor;
    }

    //public Users getUser() {
    //    return user;
    //}

    //public void setUser(Users user) {
    //    this.user = user;
    //}

    public Chats getChat() {
        return chat;
    }

    public void setChat(Chats chat) {
        this.chat = chat;
    }

    //public boolean isStatus() {
    //   return status;
    //}

    //public void setStatus(boolean status) {
    //    this.status = status;
    //}


}
