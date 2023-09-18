package com.example.desafioIBM.repositories;

import com.example.desafioIBM.entities.JogadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//jpa repositopry espera o <tipo, ID>
public interface JogadorRepository extends JpaRepository<JogadorEntity, Integer> {
}
