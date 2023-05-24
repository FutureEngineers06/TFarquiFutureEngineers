package pe.edu.upc.tfarquifutureengineers.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfarquifutureengineers.dtos.ChatsDTO;
import pe.edu.upc.tfarquifutureengineers.entities.Chats;
import pe.edu.upc.tfarquifutureengineers.services.IChatsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController//crear un servicio de tipo web- intercambio de info formato json
@RequestMapping("/chats")//ruta del controlador
public class ChatsController {
    @Autowired
    private IChatsService cS;
    //@PostMapping se utiliza para insertar
    @PostMapping
    public void  insert(@RequestBody ChatsDTO dto){
        ModelMapper m = new ModelMapper();
        Chats c = m.map(dto, Chats.class);
        cS.insert(c);
    }
    @GetMapping
    public List<ChatsDTO>list(){
        return cS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x,ChatsDTO.class);
        }).collect(Collectors.toList());//retorna un conjunto de elementos dtos
    }
}
