package kodlama.northwind.business.abstracts;

import java.util.List;

import kodlama.northwind.entities.concretes.Product;

public interface ProductService
{
	List<Product> getAll();
}
