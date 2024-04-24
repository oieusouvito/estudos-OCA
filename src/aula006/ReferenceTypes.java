package aula006;

import java.util.Date;

public class ReferenceTypes {

	public static void main(String[] args) {
	
		Date date; //reference variable
		String name;
		
		date = new Date();
		name = "Victor Araujo";
		System.out.println(date.getTime());
		System.out.println(name.toUpperCase());
		
		date = null;
		//int value = null; // nao compila
		Integer valor = null;
	}
	
}
