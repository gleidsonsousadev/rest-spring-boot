package br.com.tribo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tribo.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {}
