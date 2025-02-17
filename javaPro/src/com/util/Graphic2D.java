/**
 * 
 */
package com.util;

/**
 * @author user
 *	@date-2025. 2. 12.오후 12:40:28
 * @subject
 * @content
 */
public class Graphic2D {
	public static void drawLine() {
		System.out.println("-------------------"); //50줄 코딩 (가정)
	}
//	public static int drawLine() {
//		System.out.println("-------------------"); //50줄 코딩 (가정)
//		return 0;
//	}//리턴자료형은 중복함수 조건에 해당되지 않음
	public static void drawLine(int length) {
		for (int i = 1; i < length; i++) {
			System.out.print("=");
			
		} //for i
	}
		public static void drawLine(int length,String style) {
			for (int i = 1; i < length; i++) {
				System.out.print(style);
				
			} //for i
		System.out.println("-------------------"); //50줄 코딩 (가정)
	}

}
