package pe.edu.upc.tfarquifutureengineers.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfarquifutureengineers.dtos.TutorsDTO;
import pe.edu.upc.tfarquifutureengineers.entities.Tutors;
import pe.edu.upc.tfarquifutureengineers.services.ITutorsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tutors")
public class TutorsController {
    @Autowired
    private ITutorsService tS;

    @PostMapping
    public void insert(@RequestBody TutorsDTO dto){
        ModelMapper m= new ModelMapper();
        Tutors s= m.map(dto, Tutors.class);
        tS.insert(s);
    }

    @GetMapping
    public List<TutorsDTO> list(){
        return tS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x, TutorsDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        tS.delete(id);
    }

    @GetMapping("/{id}")
    public TutorsDTO listId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        TutorsDTO dto= m.map(tS.listId(id), TutorsDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody TutorsDTO dto){
        ModelMapper m= new ModelMapper();
        Tutors s= m.map(dto, Tutors.class);
        tS.insert(s);
    }

}
