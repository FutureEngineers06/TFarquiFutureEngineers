package pe.edu.upc.tfarquifutureengineers.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfarquifutureengineers.dtos.SimulationsDTO;
import pe.edu.upc.tfarquifutureengineers.entities.Simulations;
import pe.edu.upc.tfarquifutureengineers.services.ISimulationsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/simulations")
public class SimulationsController {

    @Autowired
    private ISimulationsService sS;

    @PostMapping
    public void insert(@RequestBody SimulationsDTO dto){
        ModelMapper m= new ModelMapper();
        Simulations s= m.map(dto, Simulations.class);
        sS.insert(s);
    }

    @GetMapping
    public List<SimulationsDTO> list(){
        return sS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x, SimulationsDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        sS.delete(id);
    }

    @GetMapping("/{id}")
    public SimulationsDTO listId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        SimulationsDTO dto= m.map(sS.listId(id), SimulationsDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody SimulationsDTO dto){
        ModelMapper m= new ModelMapper();
        Simulations s= m.map(dto, Simulations.class);
        sS.insert(s);
    }

    @GetMapping("/simulation-count")
    public List<> get() {
        List<>  = sS.reporte01();
        return ;
    }
}
