package Text;


public class Test3 {
	public static void main(String[] args) {
		int m = 20;
		System.out.println(test(m,0,0));
	}
	public static int test(int m,int b,int c) {
		if(b<2&&c<3&&m==0) {
			return 0;
		}
		return m+test(b/2+c/3,m+b%2,m+c%3);
	}
}
