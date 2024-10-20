package com.michaelmark.restapiprojectmanagementapp.service;

import com.michaelmark.restapiprojectmanagementapp.model.Product;
import com.michaelmark.restapiprojectmanagementapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;

    public List<Product> getAllProducts(){
        return repo.findAll();
    }

    public Product saveProduct(Product product) {
        return repo.save(product);
    }

    public List<Product> searchProducts(Integer pid, String pname, String location, Integer quantity) {
        Set<Product> products = new HashSet<>();

        if (pid != null) {
            products.addAll(repo.findByPid(pid));
        }
        if (pname != null && !pname.isEmpty()) {
            products.addAll(repo.findByPname(pname));
        }
        if (location != null && !location.isEmpty()) {
            products.addAll(repo.findByLocation(location));
        }
        if (quantity != null) {
            products.addAll(repo.findByQuantity(quantity));
        }

        if (products.isEmpty()) {
            return repo.findAll();
        }
        return new ArrayList<>(products);
    }

    public Product updateProduct(int id, Product productDetails) {
            Product product = repo.findById(id).orElse(null);
            if (product != null) {
                product.setPname(productDetails.getPname());
                product.setLocation(productDetails.getLocation());
                product.setQuantity(productDetails.getQuantity());
                return repo.save(product);
            }
            return null;
        }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }
}
