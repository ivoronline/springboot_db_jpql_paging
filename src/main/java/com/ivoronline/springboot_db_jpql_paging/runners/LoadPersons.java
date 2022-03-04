package com.ivoronline.springboot_db_jpql_paging.runners;

import com.ivoronline.springboot_db_jpql_paging.entities.Person;
import com.ivoronline.springboot_db_jpql_paging.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class LoadPersons implements CommandLineRunner {

  //PROPERTIES
  @Autowired PersonRepository personRepository;

  //================================================================
  // RUN
  //================================================================
  @Override
  @Transactional
  public void run(String... args) throws Exception {
    personRepository.save(new Person("Person 1"  ,  10));
    personRepository.save(new Person("Person 2"  ,  20));
    personRepository.save(new Person("Person 3"  ,  30));
    personRepository.save(new Person("Person 4"  ,  40));
    personRepository.save(new Person("Person 5"  ,  50));
    personRepository.save(new Person("Person 6"  ,  60));
    personRepository.save(new Person("Person 7"  ,  70));
    personRepository.save(new Person("Person 8"  ,  80));
    personRepository.save(new Person("Person 9"  ,  90));
    personRepository.save(new Person("Person 10" , 100));
    personRepository.save(new Person("Person 11" , 110));
    personRepository.save(new Person("Person 12" , 120));
  }

}
