package pe.edu.upc.tfarquifutureengineers.services;


import pe.edu.upc.tfarquifutureengineers.entities.Simulations;

import java.util.List;

public interface ISimulationsService {
    public void insert(Simulations simulations);
    List<Simulations> list();
}
