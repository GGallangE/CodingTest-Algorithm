import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_7568 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		
		int[][] arr = new int[N][2];
		for(int i = 0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<N;i++) {
			int ranking = 1;
			for(int j=0;j<N;j++) {
				if(i==j) continue;
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) ranking++;
			}
			sb.append(ranking).append(" ");
		}
		System.out.println(sb);
	}
}
