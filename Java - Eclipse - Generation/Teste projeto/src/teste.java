import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class teste {

	public static void main(String[] args) {
		List <Integer> number = new ArrayList<Integer>();
		number.add(10);
		number.add(60);
		number.add(30);
		number.add(70);
		for(Integer x: number) {
			System.out.println(x);
			
		}
		Collections.sort(number);
		System.out.println(number);
		
//		List <String> palavra = new ArrayList<String>();
//		number.add(10);
//		number.add(60);
//		number.add(30);
//		number.add(70);
//		for(String x: palavra) {
//			System.out.println(x);
//			
//		}
//		Collections.sort(palavra);
	}

}
