
public class ForEachEx {

	public static void main(String[] args) {
		int intArray[] = {6, 2, 1, 140, 50};
		String strArray[] = {"Apple", "Cherry", "Manggo", "Orange", "Banana"};
		int count = 0, sum = 0;
		for(int i : intArray) {		//for(초기식;조건식;중감식) for(데이터 타입 변수 : 배열)
			System.out.print(i);
			sum += i;
			count++;
			if(count < intArray.length)
				System.out.print(" + ");
			else
				System.out.print(" = ");
		}
		System.out.println(sum); System.out.println(" 평균 = " + (double)sum/count);
		for(String str : strArray)
			System.out.println(str);
		
	}

}
