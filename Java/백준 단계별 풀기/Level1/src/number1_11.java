import java.util.Scanner;

public class number1_11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int z = a*(b%10);
		int y = a*(b/10%10);
		int x = a*(b/100);
		System.out.println(z);
		System.out.println(y);
		System.out.println(x);
		System.out.println(z+y*10+x*100);
	}
}
