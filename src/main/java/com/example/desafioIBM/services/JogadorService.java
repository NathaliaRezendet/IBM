package com.example.desafioIBM.services;

import com.example.desafioIBM.entities.JogadorEntity;
import com.example.desafioIBM.repositories.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JogadorService {
    @Autowired
    //Tipo e nome da variável ou atributo
    JogadorRepository jogadorRepository;

    public List<JogadorEntity> listaJogadores() {
        return jogadorRepository.findAll();
    }

    public void inserirJogador(JogadorEntity jogador) {
        if(jogador != null) {

            jogadorRepository.save(jogador);

        }
    }

    public void apagarJogador() {
        jogadorRepository.deleteAll();
    }
}
