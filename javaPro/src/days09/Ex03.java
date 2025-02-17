/**
 * 
 */
package days09;

import java.util.Random;

import days08.Ex07;

/**
 * @author user
 *	@date-2025. 2. 13.오전 11:19:44
 * @subject
 * @content
 */
public class Ex03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* 
		 * 결재할때마다 영수증 보면 임의의 숫자 4개가 **** 출력
		 	"7655-****-9234-5677"
			"7655-8988-9234-****"
			"****-8988-9234-5677"
			"7655-8988-****-5677"
			
		지금 로직이 각 칸의 수들을 저장하고
		그 칸들을 랜덤하게 돌려서 나온 칸만
		* 처리 한다는...?
		* 
		* 
		 */
		String card ="7655-8988-9234-5677";
//		//각 칸의 수들을 저장하는 건 배열
//		//사용..하나?
//		String [] m1 = {"7","6","5","5"};
//		String[] m2 = {"8","9","8","8"};
//		String [] m3 = {"9","2","3","4"};
//		String [] m4 = {"5","6","7","7"};
//		
//		// 칸의 수들을 랜덤으로 돌릴려면,
//		Random random = new Random()
		
		//String.split() 메서드 기억
		String [] cardArr = card.split("-");
		
		//days08.Ex07
		//int index = Ex07.getRandomInteger(0, 3);
		//1) Math.random() 메서드 사용
		//2)Random 클래스 사용 ***
	
		 Random rnd = new Random(); 
		 int index =  rnd.nextInt(4); // 0<= int <bound

		 cardArr[index] = "****";
		 //각각의 cardArr 배열의 요소들을 -으로 연결해서 출력
//		 System.out.printf("%s-%s-%s-%s",cardArr[0],cardArr[1],cardArr[2],cardArr[3]);
				String result = String.join("-", cardArr);
				//String.join도 잘 알아두기
				System.out.println(result);
		
		
		

	}

}
