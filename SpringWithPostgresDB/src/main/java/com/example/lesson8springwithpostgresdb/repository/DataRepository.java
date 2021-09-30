package com.example.lesson8springwithpostgresdb.repository;

import com.example.lesson8springwithpostgresdb.model.Data;
import org.springframework.data.repository.CrudRepository;

public interface DataRepository extends CrudRepository<Data, Long> {

}
