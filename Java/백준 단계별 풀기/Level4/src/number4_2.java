import java.util.Scanner;

public class number4_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// �Է¹޴� ���� �ִ°� Ȯ���ϴ� ����� hasNext(), hasNextInt()�� ����Ѵ�.
		while(s.hasNext()) {
			int a= s.nextInt();
			int b = s.nextInt();
			System.out.println(a+b);
		}
	}
}
 