package operator;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		System.out.println("정수 입력 : ");
		a = sc.nextInt();
		System.out.println("정수 입력 : ");
		b = sc.nextInt();

		System.out.println(a+"<"+b+"=>"+(a<b));
		System.out.println(a+"<="+b+"=>"+(a<=b));
		System.out.println(a+">"+b+"=>"+(a>b));
		System.out.println(a+">="+b+"=>"+(a>=b));
		System.out.println(a+"=="+b+"=>"+(a==b));
		System.out.println(a+"!="+b+"=>"+(a!=b));
		

		sc.close();

	}

}