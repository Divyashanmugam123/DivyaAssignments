package week3.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";	
		int count=0;
		String[] splStr = text.split(" ");
		
		String newText="";
	    for (int i=0;i<splStr.length;i++)
	    {
	    	count = 0;
	    	for(int j=0;j<splStr.length;j++)
	    	{
	    		
	    		if(splStr[i].equals(splStr[j]))
	    		{
	    			count++;
	    			
	    			if (count>1)
	    	    	{
	    				 splStr[j].replace(splStr[j], "");
	    				 break;
	    	    	}
	    			if(i==j)
	    			{
	    				newText=newText+splStr[j]+" ";
	    			}
	    			
	    		}
	    			    		
	    	}
	    	
	        }
		
	    System.out.println(newText);

	}
	

}
