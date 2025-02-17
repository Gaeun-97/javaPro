/**
 * 
 */
package days07_1;

import java.util.Scanner;

/**
 * @author user
 *	@date-2025. 2. 11.오후 4:42:10
 * @subject
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		// 사용자의 가위 바위 보 입력값에 대한 유효성 검사. . .
		//							1~3
		int user,com;
		Scanner scanner = new Scanner(System.in);
		boolean isFirst = true;
		int count = 0; //입력 오류에 대한 카운트
		do {
			//최종 3회 실패시 프로그램 종료!!
			if (count == 3) {
				System.out.printf("[알림] 실패횟수:%d \n 프로그램 종료!!!",count);
				return ;
			} //if
		 //[알림] 1~3 정수를 다시 입력!!
			if(isFirst) {
		System.out.printf("[알림] 1~3 정수를 다시 입력(실패횟수:%d)!!",count);
		
		}
		isFirst =true;
		System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
	      user = scanner.nextInt();
	      
	      count++;
	      
	     
	      
//		}while(user !=1 &&user !=2 &&user !=3);
		}while(!(user ==1 ||user ==2 ||user ==3));
			System.out.printf(">user=%d\n",  user); 

	}//main

}//class
