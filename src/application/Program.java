package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		Scanner sc = new Scanner(System.in);

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

		//System.out.println("Teste findAll");
		//List<Seller> list = sellerDao.findAll();
		//for (Seller obj : list) {
			//System.out.println(obj);
		//}

		//System.out.println("Teste Update");
		//Seller seller = sellerDao.findById(1);
		//seller.setName("Bruce Wayne");
		//sellerDao.update(seller);
		//System.out.println("Updated! = " + seller.getName());

		System.out.println("Test Delete");
		System.out.println("Enter for Id: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete complete!");
	}
}
