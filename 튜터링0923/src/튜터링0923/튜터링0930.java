package 튜터링0923;

import java.util.Scanner;

public class 튜터링0930 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		// 2438번 
		Scanner sc = new Scanner(System.in);
		System.out.println("입력> ");
		int number = sc.nextInt();
		
		for(int i=0; i<number; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
		/*
		// 2439번
		Scanner sc = new Scanner(System.in);
		System.out.println("입력> ");
		int num = sc.nextInt();

		for(int i=0; i<num; i++) {
			for(int x=num-1; x>i; x--) {
				System.out.print(" ");
			}							
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
		// 10952번
		Scanner sc = new Scanner(System.in);
		System.out.println("입력> ");
		
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println( A+B );
			
			if (A == 0 && B == 0)
				break;			
		}	
				
		
		sc.close();
	}
}
