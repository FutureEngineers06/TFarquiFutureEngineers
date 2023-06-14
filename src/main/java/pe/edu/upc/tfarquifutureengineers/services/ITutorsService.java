package pe.edu.upc.tfarquifutureengineers.services;
import pe.edu.upc.tfarquifutureengineers.entities.Tutors;

import java.util.List;

public interface ITutorsService {
    public void insert(Tutors tutors);
    List<Tutors> list();
    public void delete(int idTutor);
    public Tutors listId(int idTutor);

}
