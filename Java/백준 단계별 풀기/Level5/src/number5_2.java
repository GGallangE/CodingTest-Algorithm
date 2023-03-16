import java.util.Scanner;

public class number5_2 {
	public static void main(String[] args) {
		int n[] = new int[9];
		Scanner s = new Scanner(System.in);
		int i=0;
		int max=Integer.MIN_VALUE, count=0;
		for(;i<9;i++) {
			int a = s.nextInt();
			n[i] = a;
			if(max<n[i]) {
				max=n[i];
				count =i;
			}
		}
		System.out.println(max);
		System.out.println(count+1);
	}
}