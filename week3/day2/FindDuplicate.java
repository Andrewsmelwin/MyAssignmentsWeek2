package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindDuplicate {

	public static void main(String[] args) {
		
		String[] name= {"Adam","Ben","Zara","Adam","Charlie","James","Ben"};
		
		List<String> n1 =new
				ArrayList<String>(Arrays.asList(name));
		System.out.println(n1);
		
		int count = Collections.frequency(n1,"Adam");
		
		System.out.println(count);
				
				
				

	}

}
