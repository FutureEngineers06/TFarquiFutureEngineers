package pe.edu.upc.tfarquifutureengineers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.tfarquifutureengineers.entities.Users;

public interface IUsersRepository extends JpaRepository<Users,Integer> {
}
