package _01_DataStructure;

import java.io.*;

public class bj_24390 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(":");
		int M = Integer.parseInt(input[0]);
		int S = Integer.parseInt(input[1]);
		int T = (M * 60) + S;

		int cnt = 0;

		while(T != 0) {
			if(T >= 600) {
				T = T - 600;
				cnt++;
			}
			else if(60 <= T && T < 600) {
				T = T - 60;
				cnt++;
			}
			else if(30 <= T && T < 60) {
				T = T - 30;
			}
			else if(10 <= T && T < 30) {
				T = T - 10;
				cnt++;
			}
			if(T == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		br.close();
	}
}
