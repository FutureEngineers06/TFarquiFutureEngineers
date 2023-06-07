package pe.edu.upc.tfarquifutureengineers.entities;

import javax.persistence.*;

@Entity
@Table(name="Rooms")//el nombre de la base de datos
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
    @JoinColumn(name = "Tutores_id")
    private Tutors Tutores_id;//FOREING KEY DE TUTORS
    @ManyToOne
    @JoinColumn(name = "Tutores_Users_user_id")
    private Users Tutores_Users_user_id;//FOREING KEY de USERS
    @Column(name = "status", nullable = false)
    private boolean status;
    @ManyToOne
    @JoinColumn(name = "Chats_id")
    private Chats Chats_id;//FOREING KEY DE CHATS

    public Rooms() {
    }

    public Rooms(Integer idRooms, Integer codigo, String nombre, Integer cantidad_alumnos, Tutors tutores_id, Users tutores_Users_user_id, boolean status, Chats chats_id) {
        this.idRooms = idRooms;
        this.codigo = codigo;
        Nombre = nombre;
        this.cantidad_alumnos = cantidad_alumnos;
        Tutores_id = tutores_id;
        Tutores_Users_user_id = tutores_Users_user_id;
        this.status = status;
        Chats_id = chats_id;
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
