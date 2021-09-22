package week3.day1;

public class StringaASSignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = new String("Kutty");
		 String str2 = new String("Kutty");
		 
		 if(str1==str2) {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Different text");
		 
	}

}



/*
 * JUSTIFICATION
 *  == is a operator used to compare objects to check equality. 
 *  == operator is for"address comparsion"not a content comparsion. 
 *  == operator checks objects of same location.
 *  Even though the above objects are same == checks the memory location.hence,gives the output as Different text. 
 */