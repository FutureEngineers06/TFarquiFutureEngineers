package pe.edu.upc.tfarquifutureengineers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.tfarquifutureengineers.entities.Tutors;

public interface ITutorsRepository extends JpaRepository<Tutors, Integer> {
}
