package review;

import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int max = 0;
		int intArray[] = new int[5];
		
		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i] > max)
				max = intArray[i];
			
			System.out.println("�Է��� �� �� �ִ밪�� " + max + "�Դϴ�.");
			scn.close();
			
		} 

	}

}
