package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
    String text = "We learn java basics as part of java sessions in java week1";
    String[] splText = text.split(" ");
    Set<String> uniqueText = new LinkedHashSet<String>();
    for(int i=0;i<splText.length;i++)
    {
    uniqueText.add(splText[i]);
	}
    System.out.println("After removing duplicates ==>"+text);
}
}
