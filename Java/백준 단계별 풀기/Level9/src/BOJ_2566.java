import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2566 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n[][] = new int[9][9];
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		int x=0,y=0;
		for(int i=0;i<9;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int j=0;j<9;j++) {				
				n[i][j] = Integer.parseInt(st.nextToken());
				if(n[i][j]>max) {
					max = n[i][j];
					x = i+1;
					y = j+1;
				}
			}
		}
		System.out.println(max);
		System.out.println(x+" "+y);
	}
}
