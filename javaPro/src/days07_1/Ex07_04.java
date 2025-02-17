/**
 * 
 */
package days07_1;

import java.util.Scanner;

/**
 * @author user
 *	@date-2025. 2. 12.오전 8:48:14
 * @subject
 * @content
 */
public class Ex07_04 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        int user, com;
		        int comScore = 0, userScore = 0;
		        int count = 0;
		        boolean isFirst = false;
		        String input;  // 사용자 입력을 저장할 변수

		        // 가위 바위 보 선택 배열
		        String[] rpsArr = {"", "가위", "바위", "보"};

		        // 게임 반복
		        while (true) {
		            // 최종 3회 실패시 프로그램 종료
		            if (count == 3) {
		                System.out.printf("[알림] 실패횟수:%d \n 프로그램 종료!!!\n", count);
		                break;
		            }

		            // 잘못된 입력 시 알림
		            if (isFirst) {
		                System.out.printf("[알림] 1~3 정수를 다시 입력(실패횟수:%d)!!!\n", count);
		            }
		            isFirst = true;

		            // 사용자 입력 받기
		            System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
		            input = scanner.nextLine(); // 입력을 String으로 받음

		            // 숫자 입력 여부 확인
		            if (!input.matches("[1-3]")) {  // 1, 2, 3만 유효한 입력
		                System.out.println("[알림] 잘못된 입력입니다! 숫자 1~3만 입력해주세요.");
		                count++; // 잘못된 입력 횟수 증가
		                continue; // 잘못된 입력이면 다시 입력 받기
		            }

		            // 유효한 입력일 경우, user 변환
		            user = Integer.parseInt(input);

		            // 컴퓨터 선택 (1~3)
		            com = (int) (Math.random() * 3) + 1;

		            // 선택 결과 출력
		            System.out.printf("> com=%s, user=%s\n", rpsArr[com], rpsArr[user]);

		            // 승자 판단
		            switch (user - com) {
		                case 0:
		                    System.out.print("무승부\n");
		                    break;
		                case 1:
		                case -2:
		                    System.out.print("사용자 승리\n");
		                    userScore++;
		                    break;
		                case -1:
		                case 2:
		                    System.out.print("컴퓨터 승리\n");
		                    comScore++;
		                    break;
		            }

		            // 점수 출력
		            System.out.printf("( %d : %d )\n", comScore, userScore);

		            // 3번 승리한 사람 출력
		            if (comScore == 3 || userScore == 3) {
		                System.out.printf("최종 승리자: %s 입니다.\n", comScore == 3 ? "컴퓨터" : "사용자");
		                break; // 3번 승리한 사람 출력 후 게임 종료
		            }

		            // 게임 계속 여부 묻기
		            System.out.print("\n게임 계속합니까? (y/n) ");
		            char con = scanner.nextLine().charAt(0); // 'y' or 'n' 입력 받기
		            if (con != 'y' && con != 'Y') {
		                System.out.println("게임 종료");
		                break; // 'y'나 'Y'가 아니면 종료
		            }
		        }

		        scanner.close(); // Scanner 자원 해제

}//main
}//class
