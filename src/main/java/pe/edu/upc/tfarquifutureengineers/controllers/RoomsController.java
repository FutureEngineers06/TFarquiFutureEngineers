package pe.edu.upc.tfarquifutureengineers.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfarquifutureengineers.dtos.ProfessionsDTO;
import pe.edu.upc.tfarquifutureengineers.dtos.RoomsDTO;
import pe.edu.upc.tfarquifutureengineers.entities.Professions;
import pe.edu.upc.tfarquifutureengineers.entities.Rooms;
import pe.edu.upc.tfarquifutureengineers.services.IRoomsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rooms")
public class RoomsController {
    @Autowired
    private IRoomsService rS;
    @PostMapping
    public void  insert(@RequestBody RoomsDTO dto){
        ModelMapper m = new ModelMapper();
        Rooms c = m.map(dto, Rooms.class);
        rS.insert(c);
    }
    //LISTAR
    @GetMapping
    public List<RoomsDTO> list(){
        return rS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x,RoomsDTO.class);
        }).collect(Collectors.toList());//retorna un conjunto de elementos dtos
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        rS.delete(id);
    }

    @GetMapping("/{id}")
    public RoomsDTO listId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        RoomsDTO dto= m.map(rS.listId(id), RoomsDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody RoomsDTO dto){
        ModelMapper m= new ModelMapper();
       Rooms p= m.map(dto, Rooms.class);
        rS.insert(p);
    }
}
