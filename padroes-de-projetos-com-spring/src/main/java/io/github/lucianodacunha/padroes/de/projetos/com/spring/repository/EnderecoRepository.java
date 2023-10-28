package io.github.lucianodacunha.padroes.de.projetos.com.spring.repository;

import io.github.lucianodacunha.padroes.de.projetos.com.spring.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}