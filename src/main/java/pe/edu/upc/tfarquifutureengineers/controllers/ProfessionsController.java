package pe.edu.upc.tfarquifutureengineers.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfarquifutureengineers.dtos.ProfessionsDTO;
import pe.edu.upc.tfarquifutureengineers.entities.Professions;
import pe.edu.upc.tfarquifutureengineers.services.IProfessionsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/professions")
public class ProfessionsController {
    @Autowired
    private IProfessionsService pS;

    @PostMapping
    public void insert(@RequestBody ProfessionsDTO dto){
        ModelMapper m= new ModelMapper();
        Professions p= m.map(dto, Professions.class);
        pS.insert(p);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<ProfessionsDTO> list(){
        return pS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x, ProfessionsDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        pS.delete(id);
    }

    @GetMapping("/{id}")
    public ProfessionsDTO listId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        ProfessionsDTO dto= m.map(pS.listId(id), ProfessionsDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody ProfessionsDTO dto){
        ModelMapper m= new ModelMapper();
        Professions p= m.map(dto, Professions.class);
        pS.insert(p);
    }
}
