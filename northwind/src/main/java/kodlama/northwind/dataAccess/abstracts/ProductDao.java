package kodlama.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>
{

}
