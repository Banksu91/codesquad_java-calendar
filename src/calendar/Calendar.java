package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//숫자를 입력받아 해당하는 달의 최대일수를 출력
		
		int month = sc.nextInt();
		
		int[] maxDays = {31,28,31,30,31,30,31,31,30,31,30,31};
	
		System.out.println(month+ "월의 최대 일수는 " +maxDays[month-1]+"일 입니다.");
		
	}

}
