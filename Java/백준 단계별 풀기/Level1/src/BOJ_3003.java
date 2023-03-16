import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_3003 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int chess[] = new int[6];
		int current[] = {1,1,2,2,2,8};
		for(int i=0;i<chess.length;i++) {
			chess[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<chess.length;i++) {
			int answer = 0;
			answer = current[i] - chess[i];
			System.out.print(answer+" ");
		}
	}
}
