package aula004;

public class Chick {
	
	private String name = "Fluffy";
	
	//Instance INITIALIZER runs before everything else
	{
		System.out.println("Setting the field");
		System.out.println(name);
	}
	
	//no return type
	//Constructors runs at the end
	public Chick() {;
		name = "Duke"; //initialization out of line
		System.out.println("I am a constructor!! and we are setting the name field");
	}
	
	public static void main(String[] args) {
		Chick chich = new Chick();
		System.out.println(chich.name);
	}
	
}
