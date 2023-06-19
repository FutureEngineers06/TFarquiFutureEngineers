package pe.edu.upc.tfarquifutureengineers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfarquifutureengineers.entities.Chats;

@Repository
public interface IChatsRepository extends JpaRepository<Chats,Integer> {//order by///////////////////////////
}
