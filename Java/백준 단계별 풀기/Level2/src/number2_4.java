import java.util.Scanner;

public class number2_4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		if(a>0 && b>0) System.out.println(1);
		if(a>0 && b<0) System.out.println(4);
		if(a<0 && b>0) System.out.println(2);
		if(a<0 && b<0) System.out.println(3);
	}
}
