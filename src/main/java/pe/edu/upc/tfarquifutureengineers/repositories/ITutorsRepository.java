package pe.edu.upc.tfarquifutureengineers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfarquifutureengineers.entities.Tutors;
@Repository
public interface ITutorsRepository extends JpaRepository<Tutors, Integer> {

}
