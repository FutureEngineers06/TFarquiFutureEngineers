package pe.edu.upc.tfarquifutureengineers.services;

import pe.edu.upc.tfarquifutureengineers.entities.Chats;

import java.util.List;

public interface IChatsService {
    public void insert(Chats chats);
    List<Chats> list()
}
