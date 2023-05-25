package pe.edu.upc.tfarquifutureengineers.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfarquifutureengineers.dtos.UsersDTO;
import pe.edu.upc.tfarquifutureengineers.entities.Users;
import pe.edu.upc.tfarquifutureengineers.services.IUsersService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private IUsersService sS;
    @PostMapping
    public void insert(@RequestBody UsersDTO dto){
        ModelMapper m = new ModelMapper();
        Users s = m.map(dto,Users.class);
        sS.insert(s);
    }
    @GetMapping
    public List<UsersDTO> list(){
        return sS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,UsersDTO.class);
        }).collect(Collectors.toList());
    }
}
