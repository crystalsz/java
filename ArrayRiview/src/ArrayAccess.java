import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num[];
		num = new int[10]; //int intArray[] = new int[5];
		int max = -2147483648, min = 2147483647, sum = 0;
		//System.out.print("정수 10개 입력 : ");
		for(int i=0; i<num.length; i++) {
			num[i] = scn.nextInt();
			sum += num[i];
		}
		System.out.println((double)sum);
		System.out.println(/*"입력한 값들의 평균값 =" + */((double)sum/num.length));
		scn.close();
	}

}
