package week3.day1;

import java.util.Iterator;

/*. Write a Java program to get the character at the given index within the String. 
String text = Java Exercise 
  Index for character E and s  */  

public class StringIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = ("Java Exercise ");
		char[] charArray = text.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]=='E')
			{
				System.out.println("Index of E is" + i);
			}
			if(charArray[i]=='s')
			{
				System.out.println("Index of s is" + i);
			}
		}
	}
}


