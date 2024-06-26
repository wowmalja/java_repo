package java_00; 

public class Operator04 {
	public static void main(String[] args) {

		/*
		 * [ 당신의 선택은? 치킨 vs 소 ]
		 * 
		 * 입력받을 변수는 1 또는 2
		 * 1번은 닭 vs 2번은 소
		 * 닭은 치킨 vs 소는 스테이크
		 * 
		 * 결과물 예시 : 가져오신 동물은 닭이므로, 치킨을(를) 요리하겠습니다.
		 * 결과물 예시 : 가져오신 동물은 소이므로, 스테이크을(를) 요리하겠습니다.
		 * 
		 */
		
		
		/*
		조건 연산자
		- ? 와 : 으로 이루어짐
		- A ? B : C 
		- A ? B (true 일 때 반환 값) : C (false 일 때 반환 값)
		- 3항 연산자
		- A: boolean
		- B, C: 상수, 변수 > 데이터(문장이 오는 경우도 있으나, 보통 데이터가 옴)
		- A 조건이 참이면 B를 반환, 거짓이면 C를 반환

	 */
		
		
		
		int animalNum = 2;
		String animal = "";
		String animalResult = "";
		
		animal = (animalNum == 1) ? "닭" : "소";
		animalResult = (animal == "닭") ? "치킨" : "스테이크";
		
		System.out.println("가져오신 동물은 " + animal + "이므로, " + animalResult + "을(를) 요리하겠습니다.");
		


						//---------------------------------
		
		
		
		
		
		/*
		 * [ 홀짝 감별기 ]
		 * 
		 * 입력받은 변수의 값이 홀이냐 짝이냐를 구분
		 *  
		 * 결과물 예시 : 입력하신 숫자 3은(는) 홀수입니다.
		 * 결과물 예시 : 입력하신 숫자 8은(는) 짝수입니다.
		 * 
		 */
		
		int num1 = 8;
		int numResult;
		
		String numResult2 = "";
		
		numResult = num1 % 2;
		
		numResult2 = (numResult == 1) ? "홀수" : "짝수";
		
		
				
				
		// flag ? m1 : m2; // 반환값과 동일한 변수에 넣어줘야 함

		System.out.println("입력하신 숫자" + num1 +"은(는)" +  numResult2 + "입니다.");
		
		
		/* 
		 * * [평균 구하기]
		 * 입력 값 : 국어, 영어, 수학
		 * 조건1) : 국어, 영어, 수학 점수의 평균을 구하여 85점 이상이면 합격 / 미만이면 불합격
		 * 조건2) : 평균 점수는 소수점 두자리까지 표시
		 * 
		 * 결구물 예시 :
		 * 당신의 국어 점수는 85점 입니다.
		 * 당신의 영어 점수는 90점 입니다.
		 * 당신의 수학 점수는 60점 입니다.
		 * 
		 * 당신의 평균 점수는 78.33이고, 불합격 입니다. 
		 */
		int kor = 100;
		int eng = 66;
		int math = 73;
		
		//int score = 90;
		
		String pass;
		 		
		double average = (kor+eng+math)/3.0d;
		
		if (average >= 85) {
			pass = "합격";
		} else {
			pass = "불합격";
		}
								
		System.out.println("당신의 평균 점수는 " + average + "이고, " + pass + "입니다." );
		
		
		

	}
}
