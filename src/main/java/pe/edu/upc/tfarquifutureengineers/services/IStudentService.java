package pe.edu.upc.tfarquifutureengineers.services;

import pe.edu.upc.tfarquifutureengineers.entities.Student;

import java.util.List;

public interface IStudentService {
    public void insert(Student student);
    List<Student> list();
    public void delete(int idStudent);
}
