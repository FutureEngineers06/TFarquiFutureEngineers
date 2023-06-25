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
    @Column(name = "room_duration", nullable = false)
    private Integer room_duration;
    @ManyToOne
    @JoinColumn(name = "idTutors")
    private Tutors tutor;//FOREING KEY DE TUTORS

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idStudents")
    private Student student;//FOREING KEY de USERS
    //@Column(name = "status", nullable = false)
    //@Column(name = "status")
    //private boolean status;
    @ManyToOne
    @JoinColumn(name = "idChats")
    private Chats chat;//FOREING KEY DE CHATS

    public Rooms() {
    }

    public Rooms(Integer idRooms, Integer codigo, String nombre, Integer room_duration, Tutors tutor, Student student, Chats chat) {
        this.idRooms = idRooms;
        this.codigo = codigo;
        Nombre = nombre;
        this.room_duration = room_duration;
        this.tutor = tutor;
        this.student = student;
        this.chat = chat;
    }

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
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
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
    //    return status;
    //}

    //public void setStatus(boolean status) {
    //    this.status = status;
    //}


}
