package com.challenge.topic7.web.controller;


import com.challenge.topic7.web.entities.Location;
import com.challenge.topic7.web.service.LocationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@Slf4j
public class ControllerInit {

    @Autowired
    private LocationService locationService;

    @GetMapping("/")
    public String init(Model model){

        var locations = locationService.showLocation();

        log.info("successful connection ☕");

        model.addAttribute("locations", locations);
        return "index";
    }

    @GetMapping("/add")
    public String add(Location location){
        return "modify";
    }

    @PostMapping("/save")
    public String save(Location location){
        locationService.save(location);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(Location location, Model model){
        location = locationService.findLocation(location);
        model.addAttribute("location", location);
        return "modify";
    }

    @GetMapping("/delete")
    public String delete(Location location){
        locationService.delete(location);
        return "redirect:/";
    }
}
