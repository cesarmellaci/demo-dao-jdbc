package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Scanner sc = new Scanner(System.in);

		//Department department = new Department(2, null);

		System.out.println("Teste findById");
		Department department = departmentDao.findById(3);
		System.out.println(department);

		System.out.println("Teste findAll");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

		//System.out.println("Teste Insert");
		//Department newDepartment = new Department(null, "Moda");
		//departmentDao.insert(newDepartment);
		//System.out.println("Inserted! New Id = " + newDepartment.getId());
		
		//System.out.println("Teste Update");
		//Department dept = departmentDao.findById(7);
		//dept.setName("Cars");
		//departmentDao.update(dept);
		//System.out.println("Update completed");

		//System.out.println("Test Delete");
		//System.out.println("Enter for Id: ");
		//int id = sc.nextInt();
		//departmentDao.deleteById(id);
		//System.out.println("Delete complete!");
	}
}
