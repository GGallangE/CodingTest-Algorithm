import java.util.Scanner;

public class number3_7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		for(int i=1;i<=number;i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println("Case #"+i+": "+(a+b));
		}
	}
}
