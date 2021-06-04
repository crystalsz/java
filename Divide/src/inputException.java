import java.util.InputMismatchException;
import java.util.Scanner;

public class inputException {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0, n = 0;
		System.out.println("3개의 정수를 입력하세요");
		for(int i = 0; i < 3; i++)
		{
			System.out.print(i + ">>");
			try {
			n= scn.nextInt(); //정수 입력
			}
			catch(InputMismatchException e) {
				scn.next();
				System.out.println("정수가 아닙니다.");
				i--;
				continue;
			}
			sum += n;
		}
		System.out.println("합은" + sum);

	}

}
