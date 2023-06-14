package pe.edu.upc.tfarquifutureengineers.services;

import pe.edu.upc.tfarquifutureengineers.entities.Rooms;

import java.util.List;

public interface IRoomsService {
    public void insert(Rooms rooms);
    List<Rooms> list();
    public void delete(int idRooms);
    public Rooms listId(int idRooms);
}
