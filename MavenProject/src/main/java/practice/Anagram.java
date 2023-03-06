package practice;

import java.util.Arrays;

public class Anagram {

public static void main(String[] args) {
String s1 = "LISTEN";
String s2 = "SILENT";

if(s1.length()==s2.length())
{

char[] sChar1 = s1.toCharArray();
char[] sChar2 = s2.toCharArray();
int count = 0;

Arrays.sort(sChar1);
Arrays.sort(sChar2);

System.out.println(sChar1);
System.out.println(sChar2);

for(int i=0; i<sChar1.length;i++)
{
	if (sChar1[i]==sChar2[i])
	{
		count++;
	}
}

System.out.println(count);
	
if (count==s1.length())
{
	
		System.out.println("Given String is Anagram");
			}
		else
		{
			System.out.println("Given String is NOT Anagram");
		}


}

else
{
	System.out.println("String length don't match hence not compared");
}
}

}