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
		//숫자를 입력받아 해당하는 달의 최대일수를 출력
		int month;

		//int[] maxDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		while (true){
			System.out.println("몇월?");
			month = sc.nextInt();

			// 출력문보다 위에와서 오류가 안남 *** 중요
			if(month<1 || month>12) {

				break;
			}
			//	System.out.println(month+ "월의 최대 일수는 " +maxDays[month-1]+"일 입니다.");
			System.out.printf("%d %d" ,month, cal.maxDaysOfMonth(month));



		} 
		System.out.println("bye~");



	}

}
