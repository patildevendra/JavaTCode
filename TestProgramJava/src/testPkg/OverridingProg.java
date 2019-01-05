package testPkg;


class P{
	
	int a , b;
	static int c;
	
	
	public  void sum (int a , int b) {
		c=  a+b;
		System.out.println("In parent class -"+c);
	}
	
}


class Q extends P{
	int c ;
	
	public  void sum(int d, int e) {		
		
		System.out.println("In child - "+d+e);
	}
}

public class OverridingProg {

	public static void main(String args[]) {
		
		P p = new Q();
		p.sum(478,985);
		
		/*Q q = new Q();
		q.sum(4.3,5.5);*/
	}
	
}
