package pe.edu.upc.tfarquifutureengineers.services;

import pe.edu.upc.tfarquifutureengineers.entities.Student;
import pe.edu.upc.tfarquifutureengineers.entities.Tutors;

import java.util.List;

public interface ITutorsService {
    public void insert(Tutors tutors);
    List<Student> list();
    public void delete(int idTutor);
    public Student listId(int idTutor);
}
