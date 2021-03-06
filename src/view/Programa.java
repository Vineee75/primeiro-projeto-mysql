package view;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== Teste 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

		System.out.println("\n=== Teste 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> lista = sellerDao.findByDepartment(department);
		for (Seller obj : lista) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Teste 3: seller findByAll ===");
		lista = sellerDao.findAll();
		for (Seller obj : lista) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Teste 4: seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserido: novo Id = " + newSeller.getId());
		
		System.out.println("\n=== Teste 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Nathali Camily");
		sellerDao.update(seller);
		System.out.println("Update completo!");
		
		System.out.println("\n=== Teste 6: seller delete ===");
		System.out.print("Entre com o Id pro teste de dele��o: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Dele��o completa");
		
		sc.close();
	}

}
