import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1934 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int x = gcd(a,b);
			sb.append(a * b / x).append("\n");
		}
		System.out.println(sb);
	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		int r = a%b;
		if(r == 0) return b;
		else return gcd(b,r);
	}
}
