package br.com.janiaoliveira.agropopshop.agropopshop_janiaoliveira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.janiaoliveira.agropopshop.agropopshop_janiaoliveira.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
