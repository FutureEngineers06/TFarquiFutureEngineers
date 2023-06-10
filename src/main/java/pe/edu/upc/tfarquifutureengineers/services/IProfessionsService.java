package pe.edu.upc.tfarquifutureengineers.services;

import pe.edu.upc.tfarquifutureengineers.entities.Professions;

import java.util.List;

public interface IProfessionsService {
    public void insert(Professions professions);
    List<Professions> list();

    public void delete(int idProfessions);

    public Professions listId(int idProfessions);
}
