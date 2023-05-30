package pe.edu.upc.tfarquifutureengineers.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfarquifutureengineers.dtos.StudentDTO;
import pe.edu.upc.tfarquifutureengineers.entities.Student;
import pe.edu.upc.tfarquifutureengineers.services.IStudentService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private IStudentService sS;
@PostMapping
    public void insert(@RequestBody StudentDTO dto){
    ModelMapper m = new ModelMapper();
    Student s = m.map(dto,Student.class);
    sS.insert(s);
    }
@GetMapping
    public List<StudentDTO> list(){
    return sS.list().stream().map(x->{
        ModelMapper m = new ModelMapper();
        return m.map(x,StudentDTO.class);
    }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
    sS.delete(id);
    }
    @GetMapping("/{id}")
    public StudentDTO lisId(@PathVariable("id") Integer id){
    ModelMapper m = new ModelMapper();
    StudentDTO dto = m.map(sS.listId(id),StudentDTO.class);
    return dto;
    }
}
