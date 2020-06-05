package view;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Programa {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Livros");
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);
		System.out.println(seller);

	}

}
