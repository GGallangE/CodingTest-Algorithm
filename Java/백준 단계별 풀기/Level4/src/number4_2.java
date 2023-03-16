import java.util.Scanner;

public class number4_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 입력받는 값이 있는가 확인하는 방법은 hasNext(), hasNextInt()를 사용한다.
		while(s.hasNext()) {
			int a= s.nextInt();
			int b = s.nextInt();
			System.out.println(a+b);
		}
	}
}
 