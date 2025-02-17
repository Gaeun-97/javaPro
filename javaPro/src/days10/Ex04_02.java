/**
 * 
 */
package days10;

import java.io.IOException;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

import days08.Ex07;

/**
 * @author user
 *	@date-2025. 2. 14.오후 3:12:32
 * @subject		
 * @content		
 */
public class Ex04_02 {


	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int [] korArr = new int[3];
		int index = 0;
		String regex = "^(100|[1-9]?[0-9]$";
		int score;
		char con = 'y';
		do {
			
			System.out.printf("%d번 학생 점수 입력 	? ",index+1);
			//score = scanner.nextInt();
			score =Ex07.getRandomInteger(0, 100) ;
			if (index == korArr.length) {
				int [] temp = new int[korArr.length+2];
				for (int i = 0; i < korArr.length; i++) {
					temp[i] =korArr[i];
					
				} //for i
				korArr = temp;
				
			} //if
			korArr[index] = score;
			
			System.out.print(" > 입력 계속	?	");
			con = (char)System.in.read();
			System.in.skip(System.in.available()); //
	//	} while (con == 'y'||con =='Y');
			} while (Character.toUpperCase(con) == 'Y');
		
		dispScore(korArr, index);
		
		//[문제]   최고점수/최저점수/점수 평균 출력
		//


	}
	private static void dispScore(int [] korArr, int index) {
		 System.out.printf("> 입력한 수 : %d 명\n", index);
	      for (int i = 0; i < index; i++) {
	         System.out.printf("[%d]번 학생의 점수 : %d점\n", i+1, korArr[i]);
	      } // for i
	      IntStream stream = IntStream.of(korArr);
	     OptionalInt oMax=stream.max();
	     int maxScore = oMax.getAsInt();
	     int minScore = IntStream.of(korArr).limit(index).min().getAsInt();
	     double avgScore = IntStream.of(korArr).limit(index).average().getAsDouble();
	     
	     System.out.printf("최고점 : %d, 최저점: %d, 평균 : %.2f\n",maxScore,minScore,avgScore);
	
	      //최고점수/최저점수/점수 평균 출력
	      //
		
	}

}
