import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15649 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		
		int permutation = 1;
		for(int i=0;i<M;i++) {
			permutation = permutation * N;
			N--;
		}
		
		for(int i=1;i<=permutation;i++) {
			int k = 1;
			for(int j=1;j<=M;j++) {
				if(i == j) {
					sb.append(i).append(" ").append(false);
				}
				sb.append(j).append(" ");
				
			}
		}
	}
}
