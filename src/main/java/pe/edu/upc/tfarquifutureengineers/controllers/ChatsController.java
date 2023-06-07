package pe.edu.upc.tfarquifutureengineers.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tfarquifutureengineers.dtos.ChatsDTO;
import pe.edu.upc.tfarquifutureengineers.entities.Chats;
import pe.edu.upc.tfarquifutureengineers.services.IChatsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController//crear un servicio de tipo web- intercambio de info formato json
@RequestMapping("/Chats")//ruta del controlador
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
    //LISTAR
    @GetMapping
    public List<ChatsDTO>list(){
        return cS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x,ChatsDTO.class);
        }).collect(Collectors.toList());//retorna un conjunto de elementos dtos
    }
    //ELIMINAR
    @DeleteMapping("/{id}")//ruta para delete de metodología spring
    public void delete(@PathVariable("id") Integer id){
        cS.delete(id);
    }
    //MODIFICAR
    @GetMapping("/{id}")
    public ChatsDTO listId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();//creamos instancia model mapper
        ChatsDTO dto = m.map(cS.listId(id),ChatsDTO.class);//conversión chats a chatsdto
        return dto;
    }
    //ACTUALIZAR-> se hace la actualización aquí porq
    @PutMapping
    public void goUpdate(@RequestBody ChatsDTO dto){
        ModelMapper m = new ModelMapper();
        Chats c = m.map(dto, Chats.class);
        cS.insert(c);
    }
}
