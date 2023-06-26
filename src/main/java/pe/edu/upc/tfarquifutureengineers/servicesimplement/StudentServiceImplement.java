package pe.edu.upc.tfarquifutureengineers.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfarquifutureengineers.dtos.RoomsTutotsDTO;
import pe.edu.upc.tfarquifutureengineers.dtos.StudentMembershipDTO;
import pe.edu.upc.tfarquifutureengineers.entities.Student;
import pe.edu.upc.tfarquifutureengineers.repositories.IStudentRepository;
import pe.edu.upc.tfarquifutureengineers.services.IStudentService;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImplement implements IStudentService {
    @Autowired
    private IStudentRepository sR;

    @Override
    public void insert(Student student) {
        sR.save(student);
    }

    @Override
    public List<Student> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int idStudent) {
        sR.deleteById(idStudent);
    }

    @Override
    public Student listId(int idStudent) {
        return sR.findById(idStudent).orElse(new Student());
    }

    @Override
    public List<StudentMembershipDTO> reporte04() {
        List<String[]> countStudentsByMemberships = sR.getCountStudentsByMemberships();
        List<StudentMembershipDTO> StudentMembershipsDTOS = new ArrayList<>();

        for (String[] data : countStudentsByMemberships) {
            StudentMembershipDTO dto = new StudentMembershipDTO();
            dto.setBeneficios(data[0]);
            dto.setStudentCount(Integer.parseInt(data[1]));
            StudentMembershipsDTOS.add(dto);
        }

        return StudentMembershipsDTOS;
    }
}
