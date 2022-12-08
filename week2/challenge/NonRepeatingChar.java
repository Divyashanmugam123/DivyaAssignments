package java1.challenge;

public class NonRepeatingChar {

	public static  void main(String[] args) {
		//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
     //Declare a String
		String s = "aabb";
			
		//Convert it into CharArray.
		char[] sChar =s.toCharArray();
		int max = 0;
		int occ =0;
		
 for (int i=0;i<sChar.length;i++)
 {
	 max = 0;
	 
	 for (int j=0;j<sChar.length;j++)
	 {
		 if(i!=j)
		 {
			 if(sChar[i]==sChar[j])
			 {
				 max++;
				 occ++;
				 break;
			 }
		 }
	 }
	 if (max ==0)
	 {
		 System.out.println("First Non Repeating character = " + sChar[i]);
		 System.out.println("Index of the char = "+ (i));
		 break;
	 }
	 
 }
 if (occ==sChar.length)
 {
	 System.out.println("There is no Non-repeating character");
 }
	
		
	}

}
