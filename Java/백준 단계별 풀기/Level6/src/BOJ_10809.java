import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[26];
		for(int i=0;i<arr.length;i++) {
			arr[i] = -1;  // �迭�� ���� -1�� ä��  Arrays.fill(arr,-1) �ϸ� �ѹ��� ä��� ����. �ʱ�ȭ!!
		}
		String s = bf.readLine();
		
		for(int i=0;i<s.length();i++) {
			char word = s.charAt(i);
			if(arr[word - 'a']==-1)
				arr[word - 'a'] = i;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
