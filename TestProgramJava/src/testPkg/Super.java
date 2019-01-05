package testPkg;

class abc{
	 int sum=10;
	
	abc(){
		System.out.println("In abc - constructor");
	}
	
	public void dis() {
		System.out.println("In ABC -Dis");
	}
}


public class Super extends abc {
	
	public Super() {
		super();
	}
	
	void show(){
		
		super.dis();
		System.out.println("In abc -show - "+ super.sum);
	}
	
	public static void main(String args[]) {
		
		Super a = new Super();
		a.show();
		
	}

}
