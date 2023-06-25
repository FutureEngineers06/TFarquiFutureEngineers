package pe.edu.upc.tfarquifutureengineers.services;


import pe.edu.upc.tfarquifutureengineers.dtos.ProfessionsSimulationsDTO;
import pe.edu.upc.tfarquifutureengineers.entities.Simulations;

import java.util.List;

public interface ISimulationsService {
    public void insert(Simulations simulations);
    List<Simulations> list();

    public void delete(int idSimulations);

    public Simulations listId(int idSimulations);

    public List<ProfessionsSimulationsDTO> reporte01();
}
