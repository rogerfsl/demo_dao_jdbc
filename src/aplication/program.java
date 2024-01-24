package aplication;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class program {

	public static void main(String[] args) {
		
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000, obj);
		
		//Dessa forma o programa nao conhece a implementação, Conhecendo somente a interface,
		//É uma forma de fazer uma injeçãoi de dependência sem explicitar a implementação.
		SellerDao sellerDao = DaoFactory.createSellerDao(); 
		
		System.out.println(seller);

	}

}
