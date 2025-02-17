/**
 * 
 */
package days09;

import java.util.Scanner;

/**
 * @author user
 *	@date-2025. 2. 13.오후 12:34:12
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		/* 요구분석 ★★★★★★★★★★중요
		 * 주민등록번호 	ㄱㄴㄷㄹㅁㅂ - ㅅㅇㅈㅊㅋㅌㅍ
		 * Resident Registration Number, RRN
		 * 	1)ㄱㄴㄷㄹㅁㅂ -여섯 숫자는 생년월일
		 * 	2) ㅅ 		-	18세기,19세기,20세기 성별
		 * 	3)ㅇㅈ	-	 출생 등록지
		 *			ㅊㅋ 읍,동,면 주민센터
		 *		4)ㅌ	 	-	주민센터 등록 순번 
		 *		5)ㅍ - 검증번호
		 *주민등록번호로 할 수 있는거...?
		 * */
		//"830412-1700001";
		Scanner scanner =  new Scanner(System.in);
		String rrn = getRrn(scanner);
		System.out.println(rrn);

		// rrn -> 생년월일     "1983년 4월 12일" 반환 메서드 선언
		String birthday = getBirthday(rrn);
		System.out.println(birthday);


	}

	private static String getRrn(Scanner scanner) {
		// 유효성 검사   숫자6-숫자7
		//      String regex = "[0-9]{6}-[0-9]{7}";
		String regex = "\\d{6}-\\d{7}";
		String rrn ;

		// [알림], 실패횟수
		do {
			System.out.print("> 주민등록번호 14자리 입력( 예: 000000-000000) ? ");
			rrn = scanner.next();
		} while ( !rrn.matches(regex) );

		return rrn;

	}

	private static String getBirthday(String rrn) {
		int year = getCentury(rrn) + Integer.parseInt(rrn.substring(0, 2));
		int month = Integer.parseInt(rrn.substring(2, 4));
		int day = Integer.parseInt(rrn.substring(4, 6));
		return String.format("%d년 %d월 %d일", year,month,day);
		

	}
	private static boolean getGender(String rrn) {
		// [2]  String rrn.substring(0, 0)
		String strGender = rrn.substring(7, 8); // "2"
		int gender = Integer.parseInt(strGender); // 2
		return  gender%2==1 ? true:false;
	}

private static boolean getNationality(String rrn) {
	char gender = rrn.charAt(7) ;
	switch (gender) {  
	case '9': case '0': 
	case '1': case '2': case '3': case '4':   
		return true;
		// case '5': case '6': case '7': case '8':
	default:
		return false;          
	} // switch
}

private static int getCentury(String rrn) {
	char gender = rrn.charAt(7) ;
	switch (gender) {  
	case '9': case '0':
		return 1800; 
	case '1': case '2': case '5': case '6':   
		return 1900;
		// case '3': case '4': case '7': case '8':
	default:
		return 2000;          
	} // switch
}
}


