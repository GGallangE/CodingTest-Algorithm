import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2581 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(bf.readLine());
		int N = Integer.parseInt(bf.readLine());
		int n = 10000;
		boolean check[] = new boolean[n+1];
		check = isprime(check,n+1);
		int count = 0;
		int sum = 0;
		int min = 0;
		for(int i = M;i<=N;i++) { 
			if(!check[i]) {
				count++;
				sum += i;
				if(count==1) min = i;
			}
		}
		if(count != 0) {
			System.out.println(sum);
			System.out.println(min);	
		}
		else System.out.println(-1);
	}
	static boolean[] isprime(boolean[] b, int n) {
		b[0] = true;
		b[1] = true;
		for(int i = 2;i<Math.sqrt(n);i++) {
			if(!b[i]) {
				for(int j= i*i;j<n;j+=i) {
					b[j] = true;
				}
			}
		}
		return b;
	}
}
