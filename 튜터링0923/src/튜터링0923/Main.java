package 튜터링0923;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		System.out.println( " 입력>  " );
		
		int age = sc.nextInt();
		
		if (age <= 19| age>= 60) {
			System.out.println("할인대상입니다.");
		} else {
			System.out.println("할인대상이 아님니다.");
		}
		

	}

}
