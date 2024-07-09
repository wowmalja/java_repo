package java_05;

public class MainExecute {

	public static void main() {
		
		// 부모 클래스 생성자
		Point point = new Point();
		
		point.setX(10);
		point.setY(20);
		
		System.out.println("point x 값 : " + point.getX());
		System.out.println("point y 값 : " + point.getY());
		
		// 자식 클래스 생성자 - Point 클래스를 상송받았음
		Circle circle = new Circle();		
		
	}
}
