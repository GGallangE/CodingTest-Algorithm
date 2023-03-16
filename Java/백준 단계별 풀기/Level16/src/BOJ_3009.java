import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int coordinate[][] = new int[3][2];
		for(int i=0;i<3;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			coordinate[i][0] = Integer.parseInt(st.nextToken());
			coordinate[i][1] = Integer.parseInt(st.nextToken());
		}
		int x = 0;
		int y = 0;
		StringBuilder sb = new StringBuilder();
		if(coordinate[0][1] == coordinate[2][1]) {
			if(coordinate[0][0] == coordinate[1][0]) {
				x = coordinate[2][0];
				y = coordinate[1][1];
			}else {
				x = coordinate[0][0];
				y = coordinate[1][1];
			}
			sb.append(x).append(" ").append(y);
		}
		else if(coordinate[0][1] == coordinate[1][1]) {
			if(coordinate[0][0] == coordinate[2][0]) {
				x = coordinate[1][0];
				y = coordinate[2][1];
			}else {
				x = coordinate[0][0];
				y = coordinate[2][1];
			}
			sb.append(x).append(" ").append(y);
		}
		else {
			if(coordinate[0][0] == coordinate[1][0]) {
				x = coordinate[2][0];
				y = coordinate[0][1];
			}else {
				x = coordinate[1][0];
				y = coordinate[0][1];
			}
			sb.append(x).append(" ").append(y);
		}
		System.out.println(sb);
	}
}
