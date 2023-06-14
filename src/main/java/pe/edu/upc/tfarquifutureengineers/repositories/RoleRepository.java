package pe.edu.upc.tfarquifutureengineers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.tfarquifutureengineers.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}