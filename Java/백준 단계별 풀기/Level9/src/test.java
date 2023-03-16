import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int arr[][] = new int[N][2];
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(bf.readLine());
//			arr[i] = Integer.parseInt(bf.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
		}
		
//		System.out.println(a);
//		for(int i=0;i<N;i++) {
//			System.out.print(arr[i][0]+" ");
//			System.out.print(arr[i][1]+"\n");
//		}
		System.out.println(sb);
	}
}
