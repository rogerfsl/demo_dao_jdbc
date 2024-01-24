package aplication;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class program {

	public static void main(String[] args) {
		
		
		//Dessa forma o programa nao conhece a implementação, Conhecendo somente a interface,
		//É uma forma de fazer uma injeçãoi de dependência sem explicitar a implementação.
		SellerDao sellerDao = DaoFactory.createSellerDao(); 
		
		System.out.println("=== TEST 1: seller findById ===");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		
		Department department = new Department(2, null);
		
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: seller findByAll ===");
		
		list = sellerDao.findAll();
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: seller insert ===");
		
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000, department);
		sellerDao.insert(newSeller);
		
		System.out.println("Inserted! new id = " + newSeller.getId());
		
		System.out.println("\n=== TEST 5: seller update ===");
		
		seller = sellerDao.findById(1);
		seller.setName("Bruce Waine");
		sellerDao.update(seller);
		System.out.println("Update completed");
	}

}
