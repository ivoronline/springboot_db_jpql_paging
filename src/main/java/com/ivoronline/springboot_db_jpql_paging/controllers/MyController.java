package com.ivoronline.springboot_db_jpql_paging.controllers;

import com.ivoronline.springboot_db_jpql_paging.entities.Person;
import com.ivoronline.springboot_db_jpql_paging.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired PersonRepository personRepository;

  //================================================================
  // GET PERSONS BY AGE
  //================================================================
  // http://localhost:8080/GetPersonsByAge?pageNumber=0&pageSize=2&age=50
  @RequestMapping("GetPersons")
  List<Person> getPersons(
    @RequestParam Integer pageNumber,
    @RequestParam Integer pageSize,
    @RequestParam Integer age
  ) {
    Pageable     firstPageWithTwoElements = PageRequest.of(pageNumber, pageSize);
    Page<Person> personsPage              = personRepository.getPersons(age, firstPageWithTwoElements);
    List<Person> personsList              = personsPage.getContent();
    return personsList;
  }

}