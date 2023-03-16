import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number5_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] =new int[10];
		int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		
		String st = String.valueOf(val);
		for(int i=0;i<st.length();i++) arr[st.charAt(i)-'0']++;
		
		for(int v:arr) System.out.println(v);
		
	}
}
