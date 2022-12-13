package week3.day1;

public class LearnString {

	public static void main(String[] args) {
		
		String name="Andrews";
		String rev="";
		int len=name.length();
		for(int i=len-1; i>=0;i--) {
			rev=rev+name.charAt(i);
			
		}
		System.out.println("rev"+rev);
				
		
				
				

	}

}
