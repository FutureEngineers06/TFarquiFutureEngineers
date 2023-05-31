package pe.edu.upc.tfarquifutureengineers.services;

import pe.edu.upc.tfarquifutureengineers.entities.Memberships;

import java.util.List;

public interface IMembershipsService {

    public void insert(Memberships memberships);
    List<Memberships> list();

    public void delete(int idMemberships);

    public Memberships listId(int idMemberships);
}
