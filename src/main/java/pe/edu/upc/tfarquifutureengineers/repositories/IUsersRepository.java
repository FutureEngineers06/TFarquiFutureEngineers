package pe.edu.upc.tfarquifutureengineers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.tfarquifutureengineers.entities.Users;
@Repository
public interface IUsersRepository extends JpaRepository<Users,Integer> {
    public Users findBynombre_completo(String nombre_completo);

    //BUSCAR POR NOMBRE
    @Query("select count(u.nombre_completo) from Users u where u.nombre_completo =:nombre_completo")
    public int buscarnombre_completo(@Param("nombre_completo") String nombre);


    //INSERTAR ROLES
    @Transactional
    @Modifying
    @Query(value = "insert into roles (rol, user_id) VALUES (:rol, :user_id)", nativeQuery = true)
    public void insRol(@Param("rol") String authority, @Param("idUsers") Long user_id);
    //public void insRol(@Param("rol") String authority, @Param("user_id") Long user_id);
//mirar si user_id da problemas-sino usar idUsers
}
