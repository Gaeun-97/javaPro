/**
 * 
 */
package days09;

/**
 * @author user
 *	@date-2025. 2. 13.오전 11:52:54
 * @subject
 * @content	indexof split substring repeat length concat join
 */
public class Ex03_03 {

	//
	public static void main(String[] args) {

		//1)830412-********
		String rrn = "830412-1700001";
		int beginIndex = 0;
		int endIndex = 7;
		String s = rrn.substring(beginIndex, endIndex);
		int count = rrn.length()-s.length();
		System.out.println(s+"*".repeat(count));
		
		//2)830412-1*******
		beginIndex = 0;
		endIndex =8;
		s =rrn.substring(beginIndex, endIndex);
		count = rrn.length() - s.length();
		System.out.println(s+"*".repeat(count));
		
		
		// [문제]  주민등록번호 뒷자리 7개 출력
		//String rrn = "830412-1700001";
//		System.out.println(rrn.split("-")[1]);
//		System.out.println(rrn.indexOf("-"));
		System.out.println(rrn.substring(beginIndex));//정해진 지점부터 끝까지
		
		
		



	}

}
