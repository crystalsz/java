import java.util.Scanner;

public class Ctrlwhile01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int n= sc.nextInt();
		
		
		int i=0;
		while(i<=n) {
		System.out.println(i);
		i++;
		}
}
}