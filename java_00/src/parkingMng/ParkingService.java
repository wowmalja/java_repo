package parkingMng;
import java.util.Scanner;

public class ParkingService {

	public static ParkingDAO parkingDAO;	
	public static Scanner sc = new Scanner(System.in);

	public ParkingService() {
		parkingDAO = new ParkingDAO();		
	}

	public void startprogram() {


		while (true) {

			int menu = printMenu();


			switch(menu) {

			case 1 :
				inParking();
				break;

			case 2 :
				outParking();
				break;


			case 3 :
				System.out.println("시스템 종료");
				System.exit(0);
				break;

			default :
				System.out.println("1~3 사이의 수를 선택해 주세요.");
				break;
			}

		}
	}

	public int printMenu() {

		System.out.println(" [주차장 현황 ]");
		System.out.println();

		String[][] parkingSpace = parkingDAO.selectParking();


		for (int i=0; i<parkingSpace.length; i++) {
			
			for(int j =0;j<parkingSpace[i].length; j++) {
				if(parkingSpace[i][j] == null) {
					System.out.print("□ " + parkingDAO.parkingNum[i][j] + " : " + parkingSpace[i][j] + "\t\t");
				}else {
					System.out.print("■ " + parkingDAO.parkingNum[i][j] + " : " + parkingSpace[i][j] + "\t\t");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("원하는 메뉴를 선택해 주세요.");
		System.out.println("1) 주차  2) 출자  3) 종료 ");
		int menu = sc.nextInt();
		return menu;
	}

	public void inParking() {

		String[][] parkingSpace = parkingDAO.selectParking();

		System.out.println("주차하고 싶은 위치를 선택해 주세요");
		System.out.println("(예시) 주차 공간 선택 - 1");

		int location = sc.nextInt();
		String locationStr = String.valueOf(location);
		
		if(location < 1 || location > parkingDAO.ROW * parkingDAO.COL) {
			System.out.println("주차 위치를 잘못 입력하였습니다.");
			System.out.println("처음부터 다시 시작하세요");
		} else if(parkingDAO.selectParkingSpace(locationStr) != null) {
			System.out.println("이미 다른 차량이 주차되어 있습니다.");
			System.out.println("처음부터 다시 시작하세요");
		} else {
			System.out.print("주차 차량번호 입력(예 : 54도 1234) : ");
			String carNum = sc.next();

			System.out.print("차량 번호가" + carNum + " 맞습니까? (y/n)");
			String confirm = sc.next();

			if ("y".equals(confirm)) {
				parkingDAO.insertParking(locationStr, carNum);
				//parkingSpace[locationRow-1][locationCol-1] = carNum;
				System.out.print("주차가 완료되었습니다!! ");					
			} else {
				System.out.println("처음부터 다시 시작하세요");
			}
		}
	}

	public void outParking() {

		String[][] parkingSpace = parkingDAO.selectParking();


		System.out.print("주차 위치를 입력해 주세요. : ");
		String locationStr = sc.next();

					parkingDAO.deleteParking(locationStr);					// parkingSpace[i][j] = null;
					System.out.print("출차완료! 안녕히 가세요~ ");
					

	}
}