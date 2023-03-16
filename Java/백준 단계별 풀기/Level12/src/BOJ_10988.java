import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10988 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String N = bf.readLine();
		int answer = 0;
		char M[] = new char[N.length()];
		for(int i=0;i<N.length();i++) {
			M[i] = N.charAt(i);
		}
		for(int i =0; i<N.length()/2+1;i++) {
			if(M[i] != M[N.length()-i-1]) {
				answer = 0;
				break;
			}
			else {
				answer = 1;
			}
		}
		System.out.println(answer);
	}
}
