package com.javatechie.crud.eample.repository;
import com.javatechie.crud.eample.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	Product findByName(String name);
}
