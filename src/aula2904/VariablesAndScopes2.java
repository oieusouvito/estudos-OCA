package aula2904;

public class VariablesAndScopes2 {

	public static void main(String[] args) {
		
	}
	
	public void eat(int peacesOfCheese) {
		int bitesOfCheese = 1;
	}
	
	public void eatIfHungry(boolean hungry) {
		if(hungry) {
			int bitesOfCheese = 1;
		}
		//bites of cheese goes out of scope here
		//System.out.println(bitesOfCheese);
		System.out.println(hungry);
		
		{
			boolean teenyBit = true;
			System.out.println(hungry);
		}
	}
	
}
