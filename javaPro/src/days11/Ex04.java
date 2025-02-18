/**
 * 
 */
package days11;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author user
 *	@date-2025. 2. 17.오후 5:20:10
 * @subject
 * @content
 */
public class Ex04 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		/* 1. 한 반에 10명인 학생의 성적 관리
        ( 이름, 국어, 영어, 수학, 총점, 평균, 등수  )
        1. 이름, 국,영,수 입력
        2. 총,평, 등 계산 처리
        3. 모든 학생 정보를 출력..
   조건) 등수 처리하는 메서드를 만드세요. 
   조건) 학생 이름,국,영,수 입력은 자동으로 처리하는 메서드를 만드세요.
   조건) 배열의 크기보다 학생 입력을 많이 할 경우 자동으로 배열의 크기를 3증가 시키는 코딩을 추가하세요.*/
		//git 명령어 찾아보기
	
		      String name;
		      int kor,eng,mat,tot,rank;
		      double avg;
		      
		      //final을 사용해 변하지 않는 값 설정
		      final int STUDENT_COUNT = 10;
		      
		      //배열 크기 선언
		      String [] names = new String[STUDENT_COUNT];
		      int [] kors = new int[STUDENT_COUNT];
		      int [] engs = new int[STUDENT_COUNT];
		      int [] mats = new int[STUDENT_COUNT];
		      int [] tots = new int[STUDENT_COUNT];
		      int [] ranks = new int[STUDENT_COUNT];
		      double [] avgs = new double[STUDENT_COUNT];
		      
		      int cnt = 0; //입력 받은 학생 수
		      
		      char con = 'y'; //입력하는 문자 y 선언
		      
		      Scanner scanner = new Scanner(System.in);
		      //입력값 선언
		      
		      do {
		         System.out.printf(" > [%d번] 학생 이름, 국어, 영어, 수학 점수 입력 ?");
		         name = getName();//랜덤 이름 생성
		         kor = getScore();//랜덤 점수 생성
		         eng = getScore();//랜덤 점수 생성
		         mat = getScore();//랜덤 점수 생성
		         
		         tot = kor+eng+mat;
		         avg =(double)tot/3;
		         rank = 1;
		         
		         names[cnt] = name;//입력 받은 학생 수를 배열에 선언
		         kors[cnt] = kor;//입력 받은 학생 수를 배열에 선언
		         engs[cnt] = eng;//입력 받은 학생 수를 배열에 선언
		         mats[cnt] = mat;//입력 받은 학생 수를 배열에 선언
		         avgs[cnt] = avg;//입력 받은 학생 수를 배열에 선언
		         tots[cnt] = tot;//입력 받은 학생 수를 배열에 선언
		         ranks[cnt] = rank;//입력 받은 학생 수를 배열에 선언
		         
		         cnt++; //학생 수 증가
		         
		         System.out.print("> 학생 입력 계속?");
		         con = (char)System.in.read();
		         System.in.skip(System.in.available());
		      } while (Character.toUpperCase(con) == 'Y');

		   }

		   private static int getScore() {
		      // TODO Auto-generated method stub
		      return (int)(Math.random()*101);
		   }

		   private static String getName() {
		      char[] nameArr = new char[3];
		      Random rnd = new Random();
		      for (int i = 0; i < nameArr.length; i++) {
		         nameArr[i] = (char)(rnd.nextInt('힣'-'가'+1));
		         
		         
		      } //for
		      
		      return new String(nameArr);
		   }

	

		
		

	}


