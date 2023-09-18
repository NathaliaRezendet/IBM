package com.example.desafioIBM.controllers;

import com.example.desafioIBM.services.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/times")
public class TimeController {

    @Autowired
    private TimeService timeService;

    @GetMapping
    public Map<String, List<String>> listaTimes(){
        return timeService.getTimes();
    }

}
