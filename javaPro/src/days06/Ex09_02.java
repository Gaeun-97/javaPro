/**
 * 
 */
package days06;

/**
 * @author user
 *	@date-2025. 2. 10.오후 4:48:37
 * @subject
 * @content
 */
public class Ex09_02 {


	public static void main(String[] args) {
		//[문제]
		String name = "admin";
		char ch;
		
//	[1]
//		char [] nameArr = new char[name.length()];
//		//char name.charAt(int index);
//		for (int i = 0; i < name.length(); i++) {
//			ch = name.charAt(i);
//			System.out.printf("%s -> '%c'\n", name,i, ch);
//		} //for i
	
		
		// string->char[] 변환
		char [] nameArray = name.toCharArray();
		//System.out.println( Arrays.toString(nameArr ));
		//char[] ->string 변환
		//name =  new String(nameArray);
		name = String.valueOf(nameArray);
//		name = "";
//		for (int i = 0; i < nameArray.length; i++) {
//			name +=nameArray[i];
			
		} //for i
		/*
		
		System.out.printf("%s -> '%c'\n", name, ch);
		ch = name.charAt(1);
		System.out.printf("%s -> '%c'\n", name, ch);
		ch = name.charAt(2);
		System.out.printf("%s -> '%c'\n", name, ch);
		ch = name.charAt(3);
		System.out.printf("%s -> '%c'\n", name, ch);
		ch = name.charAt(4);
		System.out.printf("%s -> '%c'\n", name, ch);
		*/
		

	}


