package com.example.desafioIBM.services;

import com.example.desafioIBM.entities.JogadorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TimeService {
    @Autowired
    private JogadorService jogadorService;

    public static Map<String, List<String>> organizarTimes(List<JogadorEntity> jogadores) {

        Map<String, List<String>> grupos = new HashMap<>();

        if (jogadores != null) {

            int contador = 1;

            for (JogadorEntity jogador : jogadores) {


                if (jogador.getNome().split(" ").length == 2) {
                    String primeiroCaractereDoSobrenome = String.valueOf(jogador.getNome().split(" ")[1].charAt(0));

                    boolean existeSobrenome = grupos.values().stream().anyMatch(
                            nomes -> nomes.stream().anyMatch(
                                    nome -> nome.contains(jogador.getNome().split(" ")[1])
                            )
                    );

                    if (!existeSobrenome) {
                        grupos.computeIfAbsent(primeiroCaractereDoSobrenome, k -> new ArrayList<>()).add(jogador.getNome());

                    } else {
                        contador++;
                        List<String> addJogadores = new ArrayList<>();
                        addJogadores.add(jogador.getNome());

                        grupos.put(primeiroCaractereDoSobrenome + contador, addJogadores);
                    }


                }
            }
        }

        return grupos;

    }

    public Map<String, List<String>> getTimes() {
        return transformaObjeto(organizarTimes(jogadorService.listaJogadores()));
    }

    private Map<String, List<String>> transformaObjeto(Map<String, List<String>> times) {

        Map<String, List<String>> novoMapa = new HashMap<>();
        int count = 1;

        for (String chaveOriginal : times.keySet()) {
            String novaChave = "time" + count;
            List<String> valoresOriginais = times.get(chaveOriginal);

            novoMapa.put(novaChave, valoresOriginais);
            count++;
        }
        return novoMapa;
    }


}
