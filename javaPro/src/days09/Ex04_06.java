/**
 * 
 */
package days09;

/**
 * @author user
 *	@date-2025. 2. 13.오후 5:17:24
 * @subject
 * @content
 */
public class Ex04_06 {

	public static void main(String[] args) {
		String rrn = "830412-2700001";
	      rrn =  rrn.replace("-", "");
	      int tot = 0;
	      for(int i=0; i<=11; i++) { 
	         tot += (rrn.charAt(i)-'0')*(2+i%8) ;
	      }

	}

}
