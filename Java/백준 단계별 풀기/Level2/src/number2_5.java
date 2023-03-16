import java.util.Scanner;

public class number2_5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		int m = s.nextInt();
		if(m>=45) m=m-45;
		else {
			if(h==0) {
				h=23;
				m=m+15;
			}
			else {
				h=h-1;
				m=m+15;
			}
		}
		System.out.println(h);
		System.out.println(m);
	}
}
