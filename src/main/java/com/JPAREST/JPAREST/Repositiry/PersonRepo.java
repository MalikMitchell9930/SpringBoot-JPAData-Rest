package com.JPAREST.JPAREST.Repositiry;

import com.JPAREST.JPAREST.Model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepo extends
        PagingAndSortingRepository<Person, Long>, CrudRepository<Person,Long> {
    List<Person> findByLastName(@Param("name") String name);

}
