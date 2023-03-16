import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1735 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int A0 = Integer.parseInt(st.nextToken());
		int A1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		int B0 = Integer.parseInt(st.nextToken());
		int B1 = Integer.parseInt(st.nextToken());
		int gcd = gcd(A1,B1);
		StringBuilder sb = new StringBuilder();
		int bunza = (A0*B1/gcd)+(B0*A1/gcd);
		int bunmo = A1*B1/gcd;
		sb.append(bunza / gcd(bunza,bunmo)).append(" ").append(bunmo / gcd(bunza,bunmo));
		System.out.println(sb);
	}
	private static int gcd(int a,int b) {
		int r = a%b;
		if(r == 0) return b;
		else return gcd(b,r);
	}
}
