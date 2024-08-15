package com.datorium.Datorium.API.Controllers;

import com.datorium.Datorium.API.DTOs.Cheese;
import com.datorium.Datorium.API.Services.CheeseShopService;
import com.datorium.Datorium.API.DTOs.UpdateCheeseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;


@RestController
@RequestMapping("/cheese")
public class CheeseShopControllers {

    private CheeseShopService cheeseShopService;
    public CheeseShopControllers(){
        cheeseShopService = new CheeseShopService();
        //This code runs first, when creating UserController object

    }

    @PostMapping("/add")
    public int add(@RequestBody Cheese cheese){
        return cheeseShopService.add(cheese);
    }

    @GetMapping("/get")
    public ArrayList<Cheese> get(){
        return cheeseShopService.get();
    }

    @PostMapping("/update")
        public Cheese update(@RequestBody UpdateCheeseDTO updateCheeseDTO){
        return cheeseShopService.update(updateCheeseDTO.cheeseIndex, updateCheeseDTO.cheese);
    }
}
