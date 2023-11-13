package algorithm_study;

import java.util.Scanner;

public class ch1_SumWhile {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
//		System.out.println("n값: ");
//		int n = stdIn.nextInt();
//	
		//while문
//		int sum = 0;
//		int i = 1;
//		
//		while(i<=n) {
//			sum+=i;
//			i++;
//		}
		
		int n;
		
		//양수만 입력
		do {
			System.out.println("n값: ");
			n = stdIn.nextInt();
		} while ( n<= 0);
		
		//for문
		int sum = 0;
		for(int i = 1; i<=n; i++)
			sum += i;
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");		
	}

}
