import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_25304 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int amount = Integer.parseInt(bf.readLine());
		int kind = Integer.parseInt(bf.readLine());
		int sum = 0;
		for(int i=0;i<kind;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int price = Integer.parseInt(st.nextToken());
			int count = Integer.parseInt(st.nextToken());
			sum += price * count;
		}
		if(amount == sum) System.out.println("Yes");
		else System.out.println("No");
	}
}
