package pe.edu.upc.tfarquifutureengineers.services;

import pe.edu.upc.tfarquifutureengineers.entities.Tests;

import java.util.List;

public interface ITestsService {
    public void insert(Tests tests);

    List<Tests> list();

    public void delete(int idTests);

    public Tests listId(int idTests);
}
