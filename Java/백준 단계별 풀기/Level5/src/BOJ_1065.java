import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1065 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// �Ѽ��� ���������� �ǹ��ϸ� ���� ��� 123 ó�� +1 +1  �̳� 840 -4 -4 ó�� �Ȱ��� ���������� �ǹ��Ѵ�.
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		System.out.println(hansu(n));
	}
	private static int hansu(int n) {
		int count=0;
		if(n<=99)
			return n;
		else {
			count =99;
			for(int i=100;i<=n;i++) {
				int hundred = i/100;
				int ten = (i/10)%10;
				int one = i%10;

				if((hundred-ten)==(ten-one))
					count++;
			}
		}

		return count;
	}

}
