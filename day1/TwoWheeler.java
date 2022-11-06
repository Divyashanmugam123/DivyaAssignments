package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 56437856781L;
	boolean isPunctured = false;
	String bikeName = "pulsar";
	double runningKM = 500000.70;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoWheeler newTW = new TwoWheeler();
		System.out.println("Number of wheels = "+newTW.noOfWheels);
		System.out.println("Number Of Mirrors = "+newTW.noOfMirrors);
		System.out.println("Chassis Number = "+newTW.chassisNumber);
		System.out.println("Is Punctured = "+newTW.isPunctured);
		System.out.println("Bike Name = "+newTW.bikeName);
		System.out.println("Running KM = "+newTW.runningKM);
		
	}

}
