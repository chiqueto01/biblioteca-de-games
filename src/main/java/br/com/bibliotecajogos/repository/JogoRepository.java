package br.com.bibliotecajogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.bibliotecajogos.model.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long> { }
