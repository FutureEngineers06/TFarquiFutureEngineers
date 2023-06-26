package pe.edu.upc.tfarquifutureengineers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfarquifutureengineers.entities.Rooms;

import java.util.List;

@Repository
public interface IRoomsRepository extends JpaRepository<Rooms,Integer> {
    @Query(value = "SELECT a.nombre_completo,count(b.id_rooms) from rooms b \n" +
            "join tutors a on  b.id_tutors = a.id_tutors \n" +
            "group by a.nombre_completo ORDER BY COUNT(a.nombre_completo) DESC", nativeQuery = true)
    List<String[]> getCountRoomsByTutors();
}
