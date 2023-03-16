import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10872 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		System.out.println(fac(N));
	}
	private static int fac(int n) {
		if(n == 0) return 1;
		return fac(n-1) * n;
	}
}
