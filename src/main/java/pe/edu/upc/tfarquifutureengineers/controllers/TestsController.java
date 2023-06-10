package pe.edu.upc.tfarquifutureengineers.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfarquifutureengineers.dtos.TestsDTO;
import pe.edu.upc.tfarquifutureengineers.entities.Tests;
import pe.edu.upc.tfarquifutureengineers.services.ITestsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tests")
public class TestsController {

    @Autowired
    private ITestsService tS;

    @PostMapping
    public void insert(@RequestBody TestsDTO dto){
        ModelMapper m= new ModelMapper();
        Tests t= m.map(dto, Tests.class);
        tS.insert(t);
    }

    @GetMapping
    public List<TestsDTO> list(){
        return tS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x, TestsDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        tS.delete(id);
    }

    @GetMapping("/{id}")
    public TestsDTO listId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        TestsDTO dto= m.map(tS.listId(id), TestsDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody TestsDTO dto){
        ModelMapper m= new ModelMapper();
        Tests t= m.map(dto, Tests.class);
        tS.insert(t);
    }
}
