package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//���ڸ� �Է¹޾� �ش��ϴ� ���� �ִ��ϼ��� ���
		
		int month = sc.nextInt();
		
		int[] maxDays = {31,28,31,30,31,30,31,31,30,31,30,31};
	
		System.out.println(month+ "���� �ִ� �ϼ��� " +maxDays[month-1]+"�� �Դϴ�.");
		
	}

}
