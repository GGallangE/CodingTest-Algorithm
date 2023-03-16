import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2738 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int a[][] = new int[n][m];
		int b[][] = new int[n][m];
		for(int i= 0;i<n;i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j= 0;j<m;j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i= 0;i<n;i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j= 0;j<m;j++) {
				b[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				sb.append(a[i][j]+b[i][j]);
				if(j!=m) sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
