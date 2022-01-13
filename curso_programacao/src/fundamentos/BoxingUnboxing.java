package fundamentos;

public class BoxingUnboxing {

	public static void main(String[] args) {
		int x = 20;
		
		/*Object*/ Integer obj = x;
		
		System.out.println(obj);
		
		int y = /*(int)*/ obj;
		
		System.out.println(y);
		
		//Wrapper classes aceitam valores nulos (int = Integer)
	}

}
