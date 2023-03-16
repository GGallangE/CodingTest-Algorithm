import java.util.Scanner;

public class number5_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<a;i++) {
			int b = s.nextInt();
			if(max<b) max =b;
			if(min>b) min = b;
		}
		System.out.println(min+" "+max);
	}
}
