package ooTest;

public class T_Test {

	public static void main(String[] args) {
		T t = new T(2,5);
		t.print();
		
		System.out.println("下落后");
		t.drop();
		t.print();
		
		System.out.println("左移后");
		t.moveLeft();
		t.print();
	}

}
