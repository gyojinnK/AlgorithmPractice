package _01_DataStructure;

import java.io.*;

public class bj_2018 {	//연속된 자연수의 합 구하기 + 투 포인터
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N+1];
			int sPoint = 0;
			int ePoint = 0;
			int cnt = 0;
			
			for(int i=1; i<=N; i++) {
				arr[i-1] = i;
			}
			
			int sum = 1;
			
			while(ePoint != N) {
				if(sum < N) {
					ePoint++;
					sum += arr[ePoint];
				}
				if(sum > N) {
					sum -= arr[sPoint];
					sPoint++;
				}
				if(sum == N){
					cnt++;
					ePoint++;
					sum += arr[ePoint];
				}
				
			}
			System.out.println(cnt);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
