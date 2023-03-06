package java1.challenge;

public class Jewels {

	public static void main(String[] args) {
		//Array for Jewels
		char[] jewels = {'a','A'};
		//Declaring string for Stones
		String stones = "aAAbbabb";
		//Converting stones to CharArray
		char[] charStones = stones.toCharArray();
		//Initializing count = 0
		int count=0;
		for (int i=0;i<charStones.length;i++)
		{
			for(int j=0;j<jewels.length;j++)
			{
				if(charStones[i]==jewels[j])
				{
					count++;
				}
			}
		}
		
		System.out.println("Number of Stones = "+count);

	}

}
