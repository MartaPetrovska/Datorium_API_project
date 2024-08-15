package com.datorium.Datorium.API.Services;

import com.datorium.Datorium.API.DTOs.Cheese;
import com.datorium.Datorium.API.Repo.CheeseShopRepo;

import java.util.ArrayList;

public class CheeseShopService {

    private CheeseShopRepo cheeseShopRepo;

    public CheeseShopService(){
        cheeseShopRepo = new CheeseShopRepo();
    }

    public int add(Cheese cheese){
        return cheeseShopRepo.add(cheese);
    }

    public ArrayList<Cheese> get(){
        return cheeseShopRepo.get();
    }

    public Cheese update(int cheeseIndex, Cheese updateCheeseDTO){
        return cheeseShopRepo.update(cheeseIndex, updateCheeseDTO);
    }
}
