package testPkg;



public class Excepclass {

	public static void main(String[] args) {
	
		 try {
			System.out.println(1/0);
		} 
		 catch (Exception e) {
			System.out.println("Hi in catch");
		}
		 finally {
			System.out.println("finally in finally block");
		} 
		 
		 
		
	}
	}
