package pe.edu.upc.tfarquifutureengineers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfarquifutureengineers.entities.Exams;

import java.util.List;

@Repository
public interface IExamsRepository extends JpaRepository<Exams,Integer> {
    @Query(value = "SELECT a.name_curso,count(b.id_exams) from exams b \n" +
            "join simulations a on  b.id_simulations = a.id_simulations \n" +
            "group by a.name_curso ORDER BY COUNT(a.name_curso) DESC", nativeQuery = true)
    List<String[]> getCountExamsBySimulations();
}
