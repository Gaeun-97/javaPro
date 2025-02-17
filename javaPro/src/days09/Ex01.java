/**
 * 
 */
package days09;

/**
 * @author user
 *	@date-2025. 2. 13.오전 8:57:59
 * @subject
 * @content
 */
public class Ex01 {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
				if(isPrimeNumber(i)) {
			
		}
		} //for i
	
		
		
		
	}//main

	private static boolean isPrimeNumber(int n) {
		if(n==1) {
			return false;
		}else if(n==2){
			return true;
		}else if(n%2 == 0){
			return false;
		}else {
			for (int i = 3; i <= Math.sqrt(n); i+=2) {
				if (n%i ==0) {
					return false;
				} //if
			} //for i
		}
		for (int i = 3; i < n; i++) {
			if (n%i ==0) {
				return false;
			} //if
		} //for i
		return true;
	}

}//class
