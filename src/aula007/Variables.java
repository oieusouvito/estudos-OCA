package aula007;

public class Variables {
	
	static int z = 100; // class variable
	int u = 100; // instance variable

	public static void main(String[] args) {
		
		String zooName;
		int numberAnimals;
		
		zooName = "Nandankanan";
		numberAnimals = 200;
		
		int x = 10;
		
		String s1, s2;
		String s3 = "yes", s4 = "no";
		
		int i1, i2, i3 = 0;
		
		// int num, String value; does not compile!!!!!
		
		//double d1, double d2; does not compile!
		
//		int i3; i4; does not compile!!
		
		int okidentifier;
		int $okidentifier;
		int _alsoOkidentifier;
		int __okbutnotgood;
		
//		int 3DPointClass;
//		int hollywood@vine;
//		int *$coffee;
//		int public;
		}
	
//	public int notValid() {
//		int y = 10;
//		int x; 
////		int reply = x+y; // doenst compile
////		return reply;
//	}
	
	public int valid() {
		int y=10;
		int x;
		x=3;
		int reply=x+y;
		return reply;
	}
	
	public void findAnswer(boolean check) {
		int answer;
		int onlyOneBranch;
		
		if(check) {
			onlyOneBranch = 1;
			answer = 1;
		} else {
			answer = 2;
		}
		
		System.out.println(answer);
//		System.out.println(onlyOneBranch); // does not compile
	}
	
}
