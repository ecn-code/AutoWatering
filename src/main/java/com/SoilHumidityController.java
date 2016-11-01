package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by eliasibz on 01/11/16.
 */
@Controller
public class SoilHumidityController {


    @RequestMapping("/create")
    @ResponseBody
    public String create(@RequestBody SoilHumidity soilHumidity) {
        try {
            soilHumidityRepository.save(soilHumidity);
        }
        catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "User succesfully created! (id = " + soilHumidity.getId() + ")";
    }

    @Autowired
    private SoilHumidityRepository soilHumidityRepository;
}
