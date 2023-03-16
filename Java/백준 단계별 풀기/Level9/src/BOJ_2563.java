import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2563 {
	public static void main(String[] args) throws IOException{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int T = Integer.parseInt(br.readLine());
			int[][] paper = new int[100][100];
			int sum=0;
			
			for(int t=0; t<T; t++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				//�����̰� �����ϴ� �κ��� ���� �迭���� 1�� ����
				for(int i=a; i<a+10; i++) {
					for(int j=b; j<b+10; j++) {
						//�̹� 1�� ��� �������� �Ѿ
						if(paper[i][j]==1)
							continue;
						paper[i][j]=1;
						//���� 1�� �Ǵ� �κ� ���涧���� sum +1
						sum+=1;
					}
				}
			}
			
			System.out.println(sum);
			
	}
}
