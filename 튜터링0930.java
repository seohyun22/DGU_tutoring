package Ʃ�͸�0923;

import java.util.Scanner;

public class Ʃ�͸�0930 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		// 2438�� 
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է�> ");
		int number = sc.nextInt();
		
		for(int i=0; i<number; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
		/*
		// 2439��
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է�> ");
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
		
		
		// 10952��
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է�> ");
		
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
