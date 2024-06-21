package exam;

public class Ex02_PrintExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 12;
		int num2 = 25;		
		String day = "크리스마스";
				
		int curYear = 2024;
		int varNum = 1;
		int yearResult;
				
		yearResult = curYear - varNum; //2023
		
		double num3 = 72.893d;
		
		int num4 = 100;
		int num5 = 10;
		
		int num6 = num4 + num5;
		
		double num8 = 3.141592653589793d; //원주율
		int num9 = 5; //반지름
		
		//=== 변환
		double num10 =   num8 * num9 * 2;
		double num11 = num8 * num9 * num9;
		
		char charValue = '뷁';
		int intValue = charValue;
	
		double num12 = 58.78945;
		int intNum12 = (int) num12;
		
		System.out.println(num1 + "월 " + num2 + "일은 " + day + "입니다.");
		System.out.println("작년 " + yearResult + "년도 대학 합격률은 " + num3 + "퍼센트 였습니다.");
		System.out.println(num4 + "이라는 숫자에 " + num5 + "을 더하면 " + num6 + "이 됩니다.");
		System.out.println("원주율은 " + num8 + "이고, 반지름이 " + num9 + "인 원의 둘레는 " + num10 + "입니다.");
		System.out.println("반지름이 " + num9 + "인 원의 넓이는 " + num11 + "입니다." );
		System.out.println(charValue +"의 문자번호는 " + intValue + "입니다.");
		System.out.println(num12 + "를 버림 하면 " + intNum12 + "입니다." );
		
		
		
		
	}

}
