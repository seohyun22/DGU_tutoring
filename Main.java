package 튜터링1007;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 2562번
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		
		System.out.println("입력> ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(i+">");
			arr[i] = sc.nextInt();				
		}
		
		int max = arr[0];
		int index = 0;
		
		for (int j=0; j<arr.length; j++) {
			if (arr[j]>max) {
				max = arr[j];
				index = j+1;
			}
		}
		
		System.out.println("최대값: " + max);
		System.out.println("위치: "+ index);
		
		
		
		// 10818번
		// sort 이용한 최대값 최소값
		Scanner sc = new Scanner(System.in);
		System.out.println("정수n개> ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("입력> ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(i+">");
			arr[i] = sc.nextInt();				
		}
		
		Arrays.sort(arr);
		System.out.print(arr[0]+" "+ arr[size-1]);
		
		
		
		// 8958번
		// OX퀴즈 
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력> ");
		int turn = sc.nextInt();
		
		for (int i=0; i<turn; i++) {
			String question = sc.next();
			int score=0, add=0;
			
			for (int j=0; j<question.length(); j++) {
				if(question.charAt(j) == 'O') {
					add++;
					score += add;	// score = score + add				
				}
				else
					add = 0;
			}
			System.out.println(score);				

		}
			
	    sc.close();
		
	}

}
