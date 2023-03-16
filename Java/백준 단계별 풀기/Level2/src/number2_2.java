import java.util.Scanner;

public class number2_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String x = null;
		if(a<=100 && a>=90) x ="A";
		else if(a<90 && a>=80) x ="B";
		else if(a<80 && a>=70) x ="C";
		else if(a<70 && a>=60) x ="D";
		else if(a<60) x ="F";
		System.out.println(x);
	}
}