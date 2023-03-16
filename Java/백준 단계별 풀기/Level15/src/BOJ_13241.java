import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13241 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(bf.readLine());
		Long N = Long.parseLong(st.nextToken());
		Long M = Long.parseLong(st.nextToken());
		System.out.println(N * M / gcd(N,M));
		
	}

	private static Long gcd(Long a, Long b) {
		// TODO Auto-generated method stub
		Long r = a%b;
		if(r == 0) return b;
		else return gcd(b,r);
	
	}
}
