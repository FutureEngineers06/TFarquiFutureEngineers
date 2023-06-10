package pe.edu.upc.tfarquifutureengineers.services;

import pe.edu.upc.tfarquifutureengineers.entities.Chats;
import pe.edu.upc.tfarquifutureengineers.entities.Exams;

import java.time.LocalDate;
import java.util.List;

public interface IExamsService {
    public void insertar(Exams exams);

    List<Exams> listar();

    public void delete(int idExams);

    //MODIFICAR
    public Exams listId(int idExams);
}
