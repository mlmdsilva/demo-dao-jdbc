package application;

import java.util.Date;

import model.entities.Departament;
import model.entities.Seller;

public class TestProgram {

	public static void main(String[] args) {
		
		Departament obj = new Departament(1,"Books");
		System.out.println(obj);
		Seller seller = new Seller(21,"Bob","bob@gmai.com",new Date(),3000.00,obj);
		System.out.println(seller);
	}

}
