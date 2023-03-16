import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ_10815 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		HashSet<Integer> s1 = new HashSet<>(); // hashset ¼±¾ð
		for(int i=0;i<N;i++) s1.add(Integer.parseInt(st.nextToken()));
		
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(bf.readLine());
		st = new StringTokenizer(bf.readLine());
		for(int i= 0;i<M;i++) {
			if(s1.contains(Integer.parseInt(st.nextToken()))) sb.append('1').append(" ");
			else sb.append('0').append(" ");
		}
		System.out.println(sb);
	}
}
