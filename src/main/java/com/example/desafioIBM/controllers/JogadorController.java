package com.example.desafioIBM.controllers;

import com.example.desafioIBM.entities.JogadorEntity;
import com.example.desafioIBM.services.JogadorService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

//Estou dizendo que é um controller
@RestController
@RequestMapping ("/jogador")
@CrossOrigin(origins = {"http://localhost:3000"})
public class JogadorController {
    @Autowired
    private JogadorService jogadorService;


    @PostMapping
    public void inserirJogador(@RequestBody JogadorEntity jogador){
        jogadorService.inserirJogador(jogador);

    }

    @DeleteMapping("/all")
    public void apagarJogador(){
        jogadorService.apagarJogador();
    }
}
