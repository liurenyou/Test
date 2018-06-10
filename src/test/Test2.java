package test;

public class Test2 {
	public static void main(String[] args) {
		test(9);
	}
	public static void test(int i) {
		if(i<1) {
			return;
		}
		test(i-1);
		for(int j=1;j<=i;j++) {
			System.out.print(j+"*"+i+"="+(j*i)+"\t");
		}
		System.out.println();
	}
}