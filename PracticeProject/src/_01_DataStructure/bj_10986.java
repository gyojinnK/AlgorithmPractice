package _01_DataStructure;

import java.io.*;

public class bj_10986 { //나머지의 합을 구하는 문제 + 구간 합
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String input = br.readLine();
			String[] inputfArr = input.split(" ");
			int M = Integer.parseInt(inputfArr[1]);
			String inputArr = br.readLine();
			String[] txt = inputArr.split(" ");
			
			int[] arr = new int[txt.length];
			int[] res = new int[txt.length];
			int cnt = 0;
			int[] count = new int[M];
			
			for(int i=0; i<txt.length; i++) {
				arr[i] = Integer.parseInt(txt[i]);
				if(i == 0) { res[i] = arr[i]; }
				else {
					res[i] = res[i-1] + arr[i];
				}
			}
			
			for(int i=0; i<txt.length; i++) {
				int mod = (int) (res[i] % M);
				if(mod == 0) cnt++;
				count[mod]++;
			}
			
			for(int i=0; i<M; i++) {
				cnt += count[i] * (count[i] - 1) / 2;
			}
			System.out.println(cnt);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
