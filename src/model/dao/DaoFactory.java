package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	//vai expor um método que retorna o tipo da interface, mas internamente vai instanciar uma implementação.
	//usado para nao precisar expor a implemtentação, deixando apenas a interface.
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection()); 
	}

}
