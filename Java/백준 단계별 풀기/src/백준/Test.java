package น้มุ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;
public class Test {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int chus[] = {100,70,50,20,5,2,1};
		int n = Integer.parseInt(bf.readLine());
		int a[] = new int[n];
		int count =0;
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0;i<n;i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(Arrays.toString(a));
		int left = a[0];
		int right = a[1];
		for(int i = 2;i<n;i++) {
			if(left > right) right = right + a[i];
			else left = left + a[i];
		}
		int sum=0;
		if(right > left) sum = right - left;
		else sum = left - right;
		
		if(left == right) System.out.println(0);
		while(sum == 0) {
			for(int i=0;i<chus.length;i++) {
				if(chus[i] <= sum) {
					sum = sum - chus[i];
					count++;
				}
			}
		}
		System.out.println(count);
		
	}	
}
