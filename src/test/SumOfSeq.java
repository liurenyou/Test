package test;
import java.util.Scanner;
public class SumOfSeq {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int n = scan.nextInt();
		double result = 0;
		for (int i = 1; i<=n; i++) {
			result += 1.0 / i;
			if(i==1){
				System.out.print("1/1");
			}else{
				System.out.print("+"+"1"+"/"+i);
			}
		}
		System.out.print("=" + result);

	}
}
