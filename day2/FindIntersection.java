package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int firstArr[] = {20, 65, 50, 30, 82};
    int secondArr[] = {30, 45, 75, 50, 60, 25};
    System.out.println("Intersection of the two arrays :");
    
    for (int i=0; i<firstArr.length;i++)
    {
	for (int j=0;j<secondArr.length;j++) {
		if (firstArr[i] == secondArr[j])
		{
			System.out.println(firstArr[i]);
		}
	}
}
	}

}
