package calendar;

import java.util.Scanner;


public class Calendar {
	
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int maxDaysOfMonth(int month) {
		
		return MAX_DAYS[month-1];
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		//���ڸ� �Է¹޾� �ش��ϴ� ���� �ִ��ϼ��� ���
		
		int month = sc.nextInt();
		
		int[] maxDays = {31,28,31,30,31,30,31,31,30,31,30,31};
	
		System.out.println(month+ "���� �ִ� �ϼ��� " +maxDays[month-1]+"�� �Դϴ�.");
		System.out.println(month + "���� �ִ� �ϼ��� " + cal.maxDaysOfMonth(month));
		
		sc.close();
		
	}

}
