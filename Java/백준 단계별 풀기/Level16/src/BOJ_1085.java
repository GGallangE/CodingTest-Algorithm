import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		int answer[] = new int[4];
		answer[0] = x-0;
		answer[1] = w-x;
		answer[2] = y-0;
		answer[3] = h-y;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<4;i++) {
			if(answer[i]<min) min = answer[i];
		}
		sb.append(min);
		
		System.out.println(sb);
	}
}
