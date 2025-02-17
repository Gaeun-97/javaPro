/**
 * 
 */
package days05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author user
 *	@date-2025. 2. 7.오후 4:07:38
 * @subject
 * @content
 */
public class Ex08 {

	
	public static void main(String[] args) {
		
		//가위바위보 게임
		//룰 사용자가 가위/바위/보 중에 하나를 선택하면 컴퓨터가 랜덤으로 수를 낸다.
		//서로의 수를 비교해서 이긴 사람을 판정한다.
		
		
		//변수 선언
		
		// 입력 값을 받는 함수 설정
		//사용자가 입력하면 그 값과 컴퓨터도 랜덤으로 낸 값을 같이 보고, 판단하는 코드...를 짜야하는데
		//1~3
		//1-1~3-1 / 0~2
		//0.0 <=Math.random()<1.0
		//0.0<=Math.random()*3<3.0
		//0<=(int)(Math.random()*3)<3
		//1<=(Math.random()*3)+1<4
		//		for (c = 1; c< 4; c++) {
//			System.out.println((int)(Math.random()*3)+1);
//			
//		}
		//수 입력-> 다른 랜덤수랑 비교!
		//랜덤수랑 비교면 (A&&B?무승부:다음고민)?(이겼다:졌다)
		//(A&&B?무승부:A>B)?(이겼다:졌다)
		//저 두번째 식은 그럼 어느것이 이겼냐 졌냐를 파악해야하는 부분인건데
		//
		int user=0;
		int computer=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" > user 가위(1)/바위(2)/보(3) 선택?");
		user = sc.nextInt();
		computer=(int)(Math.random()*3)+1;
		//이 값이 저 스캐너 값으로 들어가서 비교가 되어야함.
		//1 : 3 이김 /3 : 2 이김/ 2 : 1 이김 같은 수 일때는 무승부
		//1 : 2 짐/ 3 : 1 짐 /2 : 3 짐 을... 이해하고 해야하는데
		//크고 작다로 하면 안될 거 같고 if문으로 비교 연산자 넣으면서 해야하는..건가?
		//user
		System.out.printf("user=%d, computer=%d \n",user,computer);
		if (user==computer) {
			System.out.println("무승부");
			
		} else if (user<computer) {
			System.out.println("승리");
			
		}else{
			System.out.println("패배");			
			}

		}

		
		
		//랜덤으로 내는 건 작성했는데... 이걸 컴퓨터
		//for i
	
		//사용자랑 컴퓨터의 수가 같으면 true로 넘어가서 무승부 나오는거고 아니면 두번째 항으로
		//넘어가면 좋을텐데 저 앞부터 막혔다... boolean으로 자꾸 변환하라고 나오는데.
		//switch문을 사용해서 이겼다/졌다/무승부를 내는 거 같은데.
	}




