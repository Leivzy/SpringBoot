package top.leivzy.springbootdb.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import top.leivzy.springbootdb.domain.Person;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, String> {
    List<Person> findByLastname(String lastname);
    List<Person> findPersonByLastname(String lastname, Pageable page);
    List<Person> findByFirstnameAndLastname(String firstname, String lastname);

    List<Person> findByAddress_City(String city);

    List<Person> findByFamilyList_Username(String username);
}
