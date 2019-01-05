package testPkg;

class M0{
	
	int a=10;
	void display() {
		System.out.println("Hellofrom M0");
	}
}

public class M1 extends M0{
	int a=11;
	void display() {
		System.out.println("Hellofrom M1");
	}

	public static void main(String[] args) {
		
		M0 m = new M1();
		m.display();
		System.out.println(m.a);

	}

}
