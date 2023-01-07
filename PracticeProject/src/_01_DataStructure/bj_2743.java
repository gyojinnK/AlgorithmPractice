package _01_DataStructure;

import java.io.*;

public class bj_2743 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		int cnt = 0;
		try {
			input = br.readLine();
			cnt = input.length();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(cnt);
	}
}
