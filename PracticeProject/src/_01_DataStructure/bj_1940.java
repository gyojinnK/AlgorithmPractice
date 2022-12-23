package _01_DataStructure;

import java.io.*;
import java.util.Arrays;

// �� ������ ��� + ����

public class bj_1940 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			long N = Long.parseLong(br.readLine());	// ����� ����
			long S = Long.parseLong(br.readLine()); // ������ �ϼ��Ǵ� ����ȣ�� ��
			long[] method = new long[(int)N];
			
			String[] input = br.readLine().split(" ");
			for(int i=0; i<input.length; i++) {
				method[i] = Long.parseLong(input[i]);
			}
			
			Arrays.sort(method);
			
			int i = 0;
			int j = (int)N-1;
			int count = 0;
			long sum = method[i] + method[j];
			
			while(i < j) {
				if(sum < S) {
					sum = sum - method[i];
					i++;
					sum += method[i];
				}
				else if(sum > S){
					sum -= method[j];
					j--;
					sum += method[j];
				}else {
					count++;
					j--;
					i++;
					sum = method[i] + method[j];
				}
			}
			System.out.println(count);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
