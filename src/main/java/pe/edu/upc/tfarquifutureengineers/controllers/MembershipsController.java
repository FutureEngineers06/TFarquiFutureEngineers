package pe.edu.upc.tfarquifutureengineers.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfarquifutureengineers.dtos.MembershipsDTO;
import pe.edu.upc.tfarquifutureengineers.entities.Memberships;
import pe.edu.upc.tfarquifutureengineers.services.IMembershipsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/memberships")
public class MembershipsController {
    @Autowired
    private IMembershipsService mS;

    @PostMapping
    public void insert(@RequestBody MembershipsDTO dto){
        ModelMapper m= new ModelMapper();
        Memberships me= m.map(dto, Memberships.class);
        mS.insert(me);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<MembershipsDTO> list(){
        return mS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x, MembershipsDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        mS.delete(id);
    }

    @GetMapping("/{id}")
    public MembershipsDTO listId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        MembershipsDTO dto= m.map(mS.listId(id), MembershipsDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody MembershipsDTO dto){
        ModelMapper m= new ModelMapper();
        Memberships me= m.map(dto, Memberships.class);
        mS.insert(me);
    }

}
