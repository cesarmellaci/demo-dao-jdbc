package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		Department department = new Department(2, null);
		//Seller seller = sellerDao.findById(3);
		//System.out.println(seller);

		//System.out.println("Teste Insert");
		//Seller newSeller = new Seller(null, "May", "may@gmail.com", new Date(), 4000.0, department);
		//sellerDao.insert(newSeller);
		//System.out.println("Inserted! New Id = " + newSeller.getId());
		
		//System.out.println("Teste findById Department");
		//List<Seller> list = sellerDao.findByDepartment(department);
		//for (Seller obj : list) {
			//System.out.println(obj);
		//}

		System.out.println("Teste findAll");
		List<Seller> list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
	}
}
