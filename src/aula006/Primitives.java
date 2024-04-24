package aula006;

public class Primitives {

	public static void main(String[] args) {
		
		int num = 10;
		
		//the largest int value
		
		System.out.println(Integer.MAX_VALUE);
		
		long max = 31212315153L; // doesnt compile - FALTOU O L NO FINAL PRA COMPILAR
		
		//octal - 0 - 7
		//hexadecimal - digits - 0-9, letters - A-F ex : 0xFF
		//binary - digits - 0-1 ex : 0b10
		
		int b = 0xFF; // compila
		
		System.out.println(56);
		System.out.println(0b11);
		System.out.println(017);
		System.out.println(0x1F);
		
		int million1 = 1000000;
		int million2 = 1_000_000;
		
		System.out.println(million2);
		
//		double notAtStart = _1000.00; // doenst compile
//		double notAtEnd = 1000.00_; // doesnt compile
//		double decimal1 = 1_.01; // doesnt compile
//		double decimal2 = 1._01; // doesnt compile
		
	}

}
