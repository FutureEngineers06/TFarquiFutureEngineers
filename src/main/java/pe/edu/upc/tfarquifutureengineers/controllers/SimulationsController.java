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
        Simulations a= m.map(dto, Simulations.class);
        sS.insert(a);
    }

    @GetMapping
    public List<SimulationsDTO> list(){
        return sS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x, SimulationsDTO.class);
        }).collect(Collectors.toList());
    }

}
