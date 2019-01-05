package testPkg;

interface ab{
	public static int a=50;
	
	void take();
	
}
interface bc{
	void give();
}

interface ex extends ab,bc{
	
}

class temp {
	
}


class cd implements ab,bc{

	@Override
	public void give() {
		System.out.println("bc give");
		System.out.println(a);
	}

	@Override
	public void take() {
		System.out.println();
		
	}
	
}

public class InterfaceProg {

}
