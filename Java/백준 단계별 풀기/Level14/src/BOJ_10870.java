import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10870 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		System.out.println(fibonnaci(N));
	}
	private static int fibonnaci(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return fibonnaci(n-1) + fibonnaci(n-2);
	}
}
