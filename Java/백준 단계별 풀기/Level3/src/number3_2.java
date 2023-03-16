import java.util.Scanner;

public class number3_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		for(int i=0;i<number;i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println(a+b);
		}
	}
}
