package pe.edu.upc.tfarquifutureengineers.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import pe.edu.upc.tfarquifutureengineers.dtos.UsersDTO;
import pe.edu.upc.tfarquifutureengineers.entities.Users;
import pe.edu.upc.tfarquifutureengineers.services.IUsersService;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

//@RestController
@Controller
@Secured({"ROLE_ADMIN"})
@RequestMapping("/users")
public class UsersController {

    ////////////////////////////////
    @Autowired
    private PasswordEncoder bcrypt;
    ////////////////////////////////
    @Autowired
    private IUsersService uService;
    //@PostMapping
    //public void insert(@RequestBody UsersDTO dto){
    //    ModelMapper m = new ModelMapper();
    //    Users s = m.map(dto,Users.class);
    //    uService.insert(s);
    //}
    //@GetMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    //public List<UsersDTO> list(){
    //    return uService.list().stream().map(x->{
    //        ModelMapper m = new ModelMapper();
    //        return m.map(x,UsersDTO.class);
    //    }).collect(Collectors.toList());
    //}
    //@DeleteMapping("/{id}")
    //public void delete(@PathVariable("id") Integer id){
   //     uService.delete(id);
    //}
    ///@GetMapping("/{id}")
    //public UsersDTO listid(@PathVariable("id")Integer id){
   ////     ModelMapper m = new ModelMapper();
    //    UsersDTO dto = m.map(uService.listid(id),UsersDTO.class);
    //    return dto;
    //}
   // @PutMapping
    //public void goUpdate(@RequestBody UsersDTO dto){
    //    ModelMapper m = new ModelMapper();
    //    Users a = m.map(dto, Users.class);
    //    uService.insert(a);
    //}

    ///////////////////////////////////
    @PostMapping("/save")
    public String saveUser(@Valid Users user, BindingResult result, Model model, SessionStatus status)
            throws Exception {
        if (result.hasErrors()) {
            return "usersecurity/user";
        } else {
            String bcryptPassword = bcrypt.encode(user.getPassword());
            user.setPassword(bcryptPassword);
            int rpta = uService.insert(user);
            if (rpta > 0) {
                model.addAttribute("mensaje", "Ya existe");
                return "usersecurity/user";
            } else {
                model.addAttribute("mensaje", "Se guardó correctamente");
                status.setComplete();
            }
        }
        model.addAttribute("listaUsuarios", uService.list());

        return "usersecurity/listUser";
    }

    @GetMapping("/list")
    public String listUser(Model model) {
        try {
            model.addAttribute("user", new Users());
            model.addAttribute("listaUsuarios", uService.list());
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "usersecurity/listUser";
    }
    /////////////////////////////////////
}
