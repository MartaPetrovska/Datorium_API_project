package com.datorium.Datorium.API.Controllers;

import com.datorium.Datorium.API.DTOs.User;
import com.datorium.Datorium.API.Services.UserService;
import org.apache.coyote.BadRequestException;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;
import java.util.ArrayList;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {
    private UserService userService;
    public UserController(){
        userService = new UserService();
    }


    @PostMapping("/add") //localhost:8080/user/add
    public void add(@RequestBody User user) throws BadRequestException {
        userService.add(user);
    }

    @GetMapping("/get") //localhost:8080/user/get
    public ArrayList<User> get(){
        return userService.get();
    }

    @PostMapping("/update") //localhost:8080/user/update
    public User update(@RequestBody User user){
        return userService.update(user);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam int id){// http://localhost:8080/user/delete?id=123
        userService.delete(id);
    }


}
