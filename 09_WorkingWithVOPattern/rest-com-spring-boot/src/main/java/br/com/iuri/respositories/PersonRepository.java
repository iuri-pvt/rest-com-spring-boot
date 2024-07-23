package br.com.iuri.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.iuri.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{}
