package testPkg;

 abstract class A{
	 
	 int a=10;
	 
	 void show1() {
		 System.out.println("In Parent class - "+a);
	 }
	 
	 abstract void show(int a);
	 
 }
 
abstract class Bn extends A{
	 
	
	 void show1() {
		 System.out.println("In child class - "+a);
	 }
	 
	 abstract void show(int a);
	 
 }
 
 
 class b extends A{

	@Override
	void show(int a) {
		System.out.println(a);
		
	}
	// void show() {}
 }

public class AbstractionProg {
	
	public static void main(String args[]) {
		b a = new b();
		a.show(50);
		A aa = new b();
		aa.show1();
		
	}
	
	
	

}
