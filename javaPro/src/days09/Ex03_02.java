/**
 * 
 */
package days09;

/**
 * @author user
 *	@date-2025. 2. 13.오전 11:52:54
 * @subject
 * @content
 */
public class Ex03_02 {

	//
	public static void main(String[] args) {
		String rrn = "830412-1700001";
//		1)830412-********
		String [] rrnArr = rrn.split("-");
		//문자열 연결 연산자
		System.out.println(rrnArr[0]+"-*******");
		//String.concat() 문자열 연결 메서드
		System.out.println(rrnArr[0].concat("-*******"));
//		2)830412-1*******
		System.out.println(rrnArr[0]+ "-"+rrnArr[1].charAt(0)+"******");
		//concat 사용
		rrnArr[0].concat("-").concat(rrnArr[1].charAt(0)+"").concat("******");
			

	}

}
