package java_04;

import java.util.Scanner;

import java_03.book.Book;

public class MemberArray {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/**
		 * [ 요구사항 ]
		 * 
		 *  1. 다섯명의 회원명을 입력받아 String 배열을 생성하시오.
		 *  
		 */

		String[] names = meberInsert();
		meberSelect(names);

	}

	// 다섯명의 회원명을 입력받아 String 배열을 생성할 method
	public static String[] meberInsert() {
		
		//String[] 배열 선언
		String[] names = new String[5];
		
		// 입력 다섯 번 받아서 배열 안에 넣어주기
		for (int i=0; i<5; i++) {
			System.out.print("이름을 입력해 주세요 : ");
			names[i] = sc.next();			
					
		}
		
		System.out.println(" ==== 회원 정보 입력 완료!! ==== ");
		
		return names;
		
	}

	// 생성된 회원정보를 출력하는 method
	public static void meberSelect(String[] args) {
		
		// 배열에서 값 빼와서 예쁘게 보여주기
		for (int i=0; i<args.length; i++) {
			System.out.println("[ 회원 " + i + " ] " + args[i]);
		}
	
	}
	
}