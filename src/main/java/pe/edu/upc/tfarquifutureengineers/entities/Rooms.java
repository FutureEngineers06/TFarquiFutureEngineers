package pe.edu.upc.tfarquifutureengineers.entities;

import javax.persistence.*;

@Entity
@Table(name="rooms")//el nombre de la base de datos
public class Rooms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRooms;//PRIMARY KEY
    private Integer codigo;
    @Column(name = "Nombre",length = 50, nullable = false)
    private String Nombre;
    @Column(name = "cantidad_alumnos", nullable = false)
    private Integer cantidad_alumnos;
    @ManyToOne
    @JoinColumn(name = "idTutor")
    private Tutors tutor;//FOREING KEY DE TUTORS
    //@ManyToOne
    //@JoinColumn(name = "idUsers")
    //private Users user;//FOREING KEY de USERS
    @Column(name = "status", nullable = false)
    private boolean status;
    @ManyToOne
    @JoinColumn(name = "idChats")
    private Chats chat;//FOREING KEY DE CHATS

    public Rooms() {
    }

    public Rooms(Integer idRooms, Integer codigo, String nombre, Integer cantidad_alumnos, Tutors tutor, Users user, boolean status, Chats chat) {
        this.idRooms = idRooms;
        this.codigo = codigo;
        Nombre = nombre;
        this.cantidad_alumnos = cantidad_alumnos;
        this.tutor = tutor;
        ////this.user = user;
        this.status = status;
        this.chat = chat;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
