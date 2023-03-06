package java1.challenge;

public class FirstLetterTwice {

	public static void main(String[] args) {
		
		//Declaring a String
		String s = "abccbbcbaacz";
		
		//Converting to charArray
		char[] charS = s.toCharArray();
		
		char firstLetter = ' ';
		
		int stop = 0;
		
		//Initializing variable to find index
		int mejIndex = 0;
		int value = 0;
		int index =0;
		
		//Initializing variable for occurance
	
		
		//for loop for comparison
		one:for (int i=0;i<charS.length;i++)
		{
			two:for (int j=0;j<charS.length;j++)
			{
				//Don't compare the same index
				if (i!=j)
				{
					if(charS[i]==charS[j] && j>i)
					{
						value = j;
						
						if(value<mejIndex)
						{
							firstLetter = charS[j];
							index = j;
							mejIndex=value;
							break two;					
						}
						
					}
					
				}
				
			}
	
			
		}
		
		System.out.println("First Twice Letter is = "+firstLetter+" and it's index location = "+index);
	
		//if it matches with other char, increment the occurance and break it. Assign the index and compare it with next index.
	}

}
