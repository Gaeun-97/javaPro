package days08;

import com.util.MyCalendar;

public class Ex09_02 {

	public static void main(String[] args) {
		// [문제] 1년 ~ 2025년까지 총 몇번의 윤년이 있는지?
	//1~2025까지 돌려주면서 유효성 검사?
		int leapYearCount = 0;
		//com.util.MyCalendar.java
		
		for (int i = 1; i < 2025; i++) {
			if (MyCalendar.isLeapYear(i)) leapYearCount++;
		}
		System.out.println(leapYearCount);
				
		leapYearCount = 2025/4 - 2025/100 + 2025/400;
		System.out.println(leapYearCount); // 491 
		
		}//main
		} //class
		
		
		
		
		
		
