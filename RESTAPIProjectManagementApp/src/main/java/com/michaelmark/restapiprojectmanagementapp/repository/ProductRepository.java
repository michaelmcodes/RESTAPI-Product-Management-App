package com.michaelmark.restapiprojectmanagementapp.repository;

import com.michaelmark.restapiprojectmanagementapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface ProductRepository extends JpaRepository<Product, Integer> {


    Collection<? extends Product> findByPid(Integer pid);

    Collection<? extends Product> findByPname(String pname);

    Collection<? extends Product> findByLocation(String location);

    Collection<? extends Product> findByQuantity(Integer quantity);
}
