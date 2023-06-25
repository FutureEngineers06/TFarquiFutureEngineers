package pe.edu.upc.tfarquifutureengineers.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfarquifutureengineers.dtos.ExamsDTO;
import pe.edu.upc.tfarquifutureengineers.dtos.SimulationsDTO;
import pe.edu.upc.tfarquifutureengineers.entities.Exams;
import pe.edu.upc.tfarquifutureengineers.services.IExamsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/exams")
public class ExamsController {
    @Autowired
    private IExamsService eS;


    @PostMapping
    public void registrar(@RequestBody ExamsDTO dto){
        ModelMapper m= new ModelMapper();
        Exams e= m.map(dto, Exams.class);
        eS.insertar(e);
    }

    @GetMapping
    public List<ExamsDTO> list(){
        return eS.listar().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x, ExamsDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        eS.delete(id);
    }

    @GetMapping("/{id}")
    public ExamsDTO listId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        ExamsDTO dto= m.map(eS.listId(id), ExamsDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody ExamsDTO dto){
        ModelMapper m= new ModelMapper();
        Exams e= m.map(dto, Exams.class);
        eS.insertar(e);
    }
}
