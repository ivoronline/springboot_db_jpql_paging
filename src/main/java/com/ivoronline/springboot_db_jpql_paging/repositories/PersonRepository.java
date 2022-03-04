package com.ivoronline.springboot_db_jpql_paging.repositories;

import com.ivoronline.springboot_db_jpql_paging.entities.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<Person, Integer> {
  @Query(value = "SELECT person FROM Person person WHERE person.age > :age")
  Page<Person> getPersons(Integer age, Pageable pageable);  //Custom
}
