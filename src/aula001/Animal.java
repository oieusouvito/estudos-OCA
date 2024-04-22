package aula001;

public class Animal {
	
	String name;
	String species;
	
	//não retorna nenhum valor
	public void sound() {		
		System.out.println("This animal is a dog and it barks!");
	}
	
	//GETTERS AND SETTERS
	
	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}
	
}
