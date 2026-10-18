package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();

    public List<Product> getAllProducts() {
        return products;
    }

    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }

    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    public List<Product> findByName(String name) {
        return products.stream()
                .filter(product -> product.getName().equalsIgnoreCase(name))
                .toList();
    }
}
