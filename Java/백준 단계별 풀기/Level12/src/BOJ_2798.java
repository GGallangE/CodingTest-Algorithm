import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2798 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		int sum = 0;
		int max = 0;
		
		st = new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i= 0;i<N;i++) {
			for(int j = i+1;j<N;j++) {
				for(int k = j+1;k<N;k++) {
					sum = arr[i] + arr[j] + arr[k];
					if(sum > max && sum <= M) max = sum;
//					System.out.println(sum);
				}
			}
		}
		System.out.println(max);
	}
}
