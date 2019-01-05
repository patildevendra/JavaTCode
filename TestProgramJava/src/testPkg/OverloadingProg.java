package testPkg;

class Pc{
	
	
	Pc(){
		System.out.println("In cons ");
	}
	
	Pc(int a){
		
		System.out.println("In para cons -"+a);
	}
	
	void sum(int a) {
		System.out.println(a);
	}
	void sum(int a,int b ) {
		System.out.println(a+b);
	}
	void sum(float a ,int b ,int c ) {
		System.out.println(a+b+c);
	}
}


public class OverloadingProg {
 
	public static void main(String args[]) {		
		 Pc c;
		 c = new Pc();
		 c = new Pc(5);
		 c.sum(10);
		 c.sum(50, 100);
		 c.sum(1.50f, 200, 250);
	}
}
