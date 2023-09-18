package com.example.desafioIBM.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//nome da tabela
@Entity
@Table(name = "JOGADOR")
//Constroi os getters e setters por baixo dos panos
@Data
//Cria um construtor sem argumento
@NoArgsConstructor
//Criar um construtor com TODOS os argumentos
@AllArgsConstructor
public class JogadorEntity {

    @Id
    //Terá uma identidade única
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nome", length = 45, nullable = false)
    private String nome;

}
