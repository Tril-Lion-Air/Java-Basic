package ifExample;

import java.util.Scanner;

public class SwitchCaseEx {
	
		public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			
			int month = scanner.nextInt();
			int day;
			
			switch(month) {
				case 1: case 3: case 5: case 7: case 9: case 11:
					day = 31;
					break;
				case 2:
					day = 28;
					break;
				default: day = 30;
			}
			
			System.out.println(month + "월의 날짜수는 " + day +"일 입니다.");
			
	}
}
