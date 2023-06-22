package pe.edu.upc.tfarquifutureengineers.dtos;

import pe.edu.upc.tfarquifutureengineers.entities.Users;

import javax.persistence.Column;

public class TutorsDTO {

    private int idTutors;
    private String especializacion;
    //private Users user;//FOREING KEY de USERS
    private String nombre_completo;

    private String correo_electronico;

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

    public int getIdTutors() {
        return idTutors;
    }

    public void setIdTutors(int idTutors) {
        this.idTutors = idTutors;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    //public Users getUser() {
    //    return user;
    //}

    //public void setUser(Users user) {
    //    this.user = user;
    //}
}
