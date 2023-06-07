package pe.edu.upc.tfarquifutureengineers.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfarquifutureengineers.entities.Chats;
import pe.edu.upc.tfarquifutureengineers.repositories.IChatsRepository;
import pe.edu.upc.tfarquifutureengineers.services.IChatsService;

import java.util.List;

@Service
public class ChatsServiceImplement implements IChatsService {
    @Autowired
    private IChatsRepository cR;

    @Override
    public void insert(Chats chats) {
        cR.save(chats);


    }
    //LISTAR
    @Override
    public List<Chats> list() {
        return cR.findAll();
    }
    //delete
    @Override
    public void delete(int idChats) {
        cR.deleteById(idChats);
    }
    //MODIFICAR
    @Override
    public Chats listId(int idChats) {
        return cR.findById(idChats).orElse(new Chats());
    }

}
