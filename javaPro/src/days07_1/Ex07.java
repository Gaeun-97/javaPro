/**
 * 
 */
package days07_1;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author user
 *	@date-2025. 2. 11.오후 3:42:56
 * @subject do~while문
 * @content 가위/바위/보 게임 구현
 * 				1) 게임을 계속 여부? y 누르면 이어가기
 * 				2) 누구든 3 게임을 먼저 이기면 종료
 */
public class Ex07 {

	
	public static void main(String[] args) throws IOException {
		int com, user = 0;
		String input;
		Scanner scanner = new Scanner(System.in);
		char con = 'y';

		int comScore = 0, userScore = 0;
		// int [] winningRate = new int[2]; // [0] 컴승률, [1] 사승률
		//                   0      1     2     3
		String [] rpsArr = {"", "가위", "바위", "보"};

		do {
			com = (int) (Math.random() * 3) + 1;
			System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
			input = scanner.next();
			
			

			System.out.printf("> com=%s, user=%s\n"
					, rpsArr[com], rpsArr[user]);

			// 승자 판단해서 출력...
			switch (user - com) {
			case 0:
				System.out.print("무승부");
				break;
			case 1:
			case -2:
				System.out.print("사용자 승리"); 
				userScore++;
				// winningRate[1]++;
				break;
			case -1:
			case 2:
				System.out.print("컴퓨터 승리");
				comScore++;
				// winningRate[0]++;
				break;
			} // switch
			System.out.printf("( %d : %d )\n",comScore, userScore); 

			// 
			if (comScore == 3 || userScore == 3) {
				System.out.printf("최종 승리자: %s 입니다.\n"
						, comScore == 3 ? "컴퓨터" : "사용자" );
			} // if

			// 1) 게임을 계속 여부 ? y
			System.out.print("\n 게임 계속합니까 ? ");
			con = (char)System.in.read(); // y, n
		} while ( con == 'y' || con == 'Y' ); 

		System.out.println("end");
	}//main

}//class
