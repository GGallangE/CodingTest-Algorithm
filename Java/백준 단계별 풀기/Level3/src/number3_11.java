import java.util.Scanner;

public class number3_11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int X = s.nextInt();
		for(int i=0;i<N;i++) {
			int c = s.nextInt();
			if(c<X) System.out.print(c+" ");
		}
	}
}
