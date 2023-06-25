package pe.edu.upc.tfarquifutureengineers.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfarquifutureengineers.entities.Simulations;

import java.util.List;

@Repository
public interface ISimulationsRepository extends JpaRepository <Simulations, Integer> {
    @Query(value = "SELECT a.nombre,count(b.id_simulations) from simulations b \n" +
            "join professions a on  b.id_professions = a.id_professions \n" +
            "group by a.nombre ORDER BY COUNT(a.nombre) DESC", nativeQuery = true)
    List<String[]> getCountSimulationByProfessions();
}


