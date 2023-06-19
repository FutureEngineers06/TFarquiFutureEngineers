package pe.edu.upc.tfarquifutureengineers.dtos;

import pe.edu.upc.tfarquifutureengineers.entities.Users;

public class TutorsDTO {

    private int idTutors;
    private String especializacion;
    private Users user;//FOREING KEY de USERS

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

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
