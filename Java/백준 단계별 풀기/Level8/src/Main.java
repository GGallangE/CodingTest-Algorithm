import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

 

public class Main {

 

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		int count = 0;
		int c[] = new int[n];
		for(int i=0;i<n;i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		int z[] =new int[n];
		int s = 0;
		int save = 0;
		
		for(int i=0;i<n;i++) pq.offer(c[i]);
		int sum =0;
		for(int i=0;i<n;i++) z[i] = pq.poll();
		
		while(true) {
			sum += z[s];
			s++;
			count++;
			if(sum>b) break;		
		}
		sum = sum - z[s-1];
		
		
		while(true) {
			for(int i=0;i<a;i++) {
				sum = sum + z[s-1+i]/2;
				if(sum <= b) count++;
				else i = a;
			}
			break;
		}
		System.out.println(sum);
		System.out.println(count-1);
	}	


}