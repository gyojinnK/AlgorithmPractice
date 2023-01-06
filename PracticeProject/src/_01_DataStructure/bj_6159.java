package _01_DataStructure;

import java.io.*;
import java.util.Arrays;

public class bj_6159 {	//브루트포스 알고리즘 + 투 포인터 + 정렬
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		long N = Long.parseLong(input.split(" ")[0]);
		long S = Long.parseLong(input.split(" ")[1]);
		long[] sizes = new long[(int)N];

		for(int i=0; i<N; i++) {
			long size = Long.parseLong(br.readLine());
			sizes[i] = size;
		}

		int start = 0;
		int end = 1;
		long sum = 0;
		int cnt = 0;

		Arrays.sort(sizes);

		while(true) {				
			sum = sizes[start] + sizes[end];

			if(sum <= S) {
				end++;
				cnt++;
				sum = 0;
			}else {
				break;
			}

			if(end > (int)N-1) {
				start++;
				if(start == (int)N-1) { break; }
				end = start+1;
			}
		}
		System.out.println(cnt);
	}
}
