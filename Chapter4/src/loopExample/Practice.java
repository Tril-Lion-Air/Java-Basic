package loopExample;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		System.out.println("홀수 값을 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		
		int lineCount = scanner.nextInt();
		int spaceCount = lineCount/2+1;
		int starCount = 1;
		
		for(int i=0; i<lineCount; i++) {
			
			for(int j=0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			for(int k=0; k<starCount; k++) {
				System.out.print('*');
			}
			System.out.println();
						
			spaceCount-=1;
			starCount+=2;
			if (starCount >= lineCount) break;

		}
		
		for(int i=0; i<lineCount; i++) {
			
			for(int j=0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			for(int k=0; k<starCount; k++) {
				System.out.print('*');
			}
			System.out.println();
			if (starCount <= 1) break;

			spaceCount+=1;
			starCount-=2;
			
		}
	}

}
