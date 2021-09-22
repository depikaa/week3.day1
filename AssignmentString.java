package week3.day1;

public class AssignmentString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=("I am Learning Java") ;
		
		String str2=("I am learning java");
	if (str==str2)
	{
		System.out.println("== operator  output is true");
	}
	else
		System.out.println("== operator output is false");
	{
	boolean equals=str.equals(str2);
	System.out.println("equals output is "+equals);
	}
	boolean equalsIgnoreCase = str.equalsIgnoreCase(str2);
	System.out.println(" equalsIgnoreCase output is" +equalsIgnoreCase );
	}
}
	
	
	



