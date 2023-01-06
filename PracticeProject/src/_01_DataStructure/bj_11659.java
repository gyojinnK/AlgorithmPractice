package _01_DataStructure;

import java.io.*;
import java.util.ArrayList;

public class bj_11659 {	//구간 합 구하기
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String fInput = br.readLine();
		String[] fInput_2 = fInput.split(" ");
		int N = Integer.parseInt(fInput_2[0]);
		int M = Integer.parseInt(fInput_2[1]);
		 
		String input = br.readLine();
		String[] iArr = input.split(" ");
		
		int[] arr = new int[N];
		int[] res = new int[N];
		int s = 0;
		int e = 0;
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(iArr[i]);
			if(i == 0) { res[i] = arr[i]; }
			else {
				res[i] = res[i-1] + arr[i];
			}
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<M; i++) {
			String m = br.readLine();
			String[] mArr = m.split(" ");
			
			s = Integer.parseInt(mArr[0])-1;
			e = Integer.parseInt(mArr[1])-1;
			
			if(s == 0) {
				list.add(res[e]);
			}else {
				list.add(res[e] - res[s-1]);
			}
			
		}
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
