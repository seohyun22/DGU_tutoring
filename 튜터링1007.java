package Ʃ�͸�1007;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 2562��
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		
		System.out.println("�Է�> ");
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
		
		System.out.println("�ִ밪: " + max);
		System.out.println("��ġ: "+ index);
		
		
		
		// 10818��
		// sort �̿��� �ִ밪 �ּҰ�
		Scanner sc = new Scanner(System.in);
		System.out.println("����n��> ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("�Է�> ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(i+">");
			arr[i] = sc.nextInt();				
		}
		
		Arrays.sort(arr);
		System.out.print(arr[0]+" "+ arr[size-1]);
		
		
		
		// 8958��
		// OX���� 
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�> ");
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
