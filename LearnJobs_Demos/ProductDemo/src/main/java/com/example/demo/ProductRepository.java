package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
//public interface ProductRepository extends CrudRepository<Product, Integer>{
//
//}

//JpaRepository is subtype of CrudRepository
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
