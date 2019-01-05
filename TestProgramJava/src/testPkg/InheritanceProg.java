package testPkg;

class pc1{
	pc1(){
		System.out.println("Parent class constructor");
	}
	
	void dus(){
		System.out.println("Hi 1");
	}
}

class pc2 extends pc1{
	pc2(){
		System.out.println("child class construtor");
	}
	void dus2(){
		System.out.println("Hi 1");
	}
	
}

public class InheritanceProg {

	public static void main(String args[]) {
		
		pc2 p= new pc2();
		
		
	}
}
