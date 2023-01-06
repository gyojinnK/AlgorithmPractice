package _01_DataStructure;

import java.io.*;
import java.util.*;

public class bj_11720 {	//수의 합 구하기
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			char t = input.charAt(i);
			list.add(Character.getNumericValue(t));
		}
		
		int sum = 0;
		for(int i=0; i<input.length(); i++) {
			sum += list.get(i);
		}
		
		System.out.println(sum);
	}
}
