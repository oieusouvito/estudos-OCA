package aula2904;

public class Mouse {

	static int MAX_LENGTH = 5; //class variable
	int length; //instance variable
	
	public void grow(int inches) {
		if (length < MAX_LENGTH) {
			int newSize = length + inches;
			length = newSize;
		}
	}
	
	
	public static void main(String[] args) {
		Mouse mouse = new Mouse();
	}
	
}
