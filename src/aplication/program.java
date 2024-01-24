package aplication;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class program {

	public static void main(String[] args) {
		
		
		//Dessa forma o programa nao conhece a implementação, Conhecendo somente a interface,
		//É uma forma de fazer uma injeçãoi de dependência sem explicitar a implementação.
		SellerDao sellerDao = DaoFactory.createSellerDao(); 
		
		System.out.println("=== TEST 1: seller findById ===");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

	}

}
