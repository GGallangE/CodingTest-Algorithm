import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2231 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int sum = 0;
		int number = 0;
		int answer = 0;
		for(int i = 1;i<=N;i++) {
			sum = 0;
			number = i;
			while(number != 0) {
				sum += number %10;
				number = number / 10;
			}
//			System.out.println(sum);
			if(sum+i == N) {
				answer = i;
				break;
			}
			
		}
		System.out.println(answer);
	}
}
//if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) rank++;
