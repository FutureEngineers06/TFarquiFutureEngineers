package pe.edu.upc.tfarquifutureengineers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfarquifutureengineers.entities.Student;

import java.util.List;

@Repository
public interface IStudentRepository extends JpaRepository<Student,Integer> {

    @Query(value = "SELECT a.beneficios,count(b.id_students) from students b\n" +
            "join memberships a on  b.id_memberships = a.id_memberships\n" +
            "group by a.beneficios ORDER BY COUNT(a.beneficios) DESC", nativeQuery = true)
    List<String[]> getCountStudentsByMemberships();
}
