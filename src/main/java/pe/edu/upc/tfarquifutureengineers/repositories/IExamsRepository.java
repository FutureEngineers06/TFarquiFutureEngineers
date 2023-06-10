package pe.edu.upc.tfarquifutureengineers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfarquifutureengineers.entities.Exams;

@Repository
public interface IExamsRepository extends JpaRepository<Exams,Integer> {

}
