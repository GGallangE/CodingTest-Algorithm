import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ_14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashSet<String> check = new HashSet<>();
		for(int i=0;i<N;i++) check.add(bf.readLine());
		
		int count =0;
		for(int i=0;i<M;i++) {
			if(check.contains(bf.readLine())) count++;
		}
		System.out.println(count);
	}
}
