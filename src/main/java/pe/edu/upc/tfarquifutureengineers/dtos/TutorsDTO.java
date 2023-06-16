package pe.edu.upc.tfarquifutureengineers.dtos;

import pe.edu.upc.tfarquifutureengineers.entities.Users;

public class TutorsDTO {

    private int idTutors;
    private String especializacion;
    private Users Users_user_id;//FOREING KEY de USERS

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

    public Users getUsers_user_id() {
        return Users_user_id;
    }

    public void setUsers_user_id(Users users_user_id) {
        Users_user_id = users_user_id;
    }
}
