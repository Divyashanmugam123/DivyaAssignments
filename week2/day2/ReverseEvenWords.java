package week2.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  		String test = "I am a software tester"; 
  		String[] splitTest = test.split(" ");
  		String[] strStore;
  		String revStr = "";
  		char[] charArray = {};
  		for (int i=0;i<splitTest.length;i++)
  		{
  			if(i%2 !=0)
  			{
  				System.out.println(splitTest[i]);
  				
  				
  				for (int j=splitTest[i].length()-1;j>=0;i--)
  				{
  					
  					charArray = splitTest[j].toCharArray();
  					System.out.println(charArray[i]);
  				}
  				
  				String str = new String(charArray);  

  				System.out.println(str);
  				/*for (int j=splitTest[i].length()-1;j>=0;j--)
  				{
  					revStr = revStr+splitTest[j];
  				}**/
  			}
  			else
  			{
  				
  			}
  			
  			
  			
  		}

	}

}
