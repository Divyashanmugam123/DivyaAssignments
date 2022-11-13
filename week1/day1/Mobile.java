package week1.day1;

public class Mobile {
	
	String mobileBrandName = "Vivo";
	char mobileLogo = 'V';
	short noOfMobilePiece = 32760;
	int modelNumber = 5000;
	long mobileImeiNumber = 768768898767L;
	float mobilePrice = 70000f;
	boolean isDamaged = true;
	char c = 65;
	
	public void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("Making call");

	}
	
	public void sendMsg() {
		// TODO Auto-generated method stub
		System.out.println("Message Sent");
		

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int temp=0;
		
				System.out.println(temp);
		Mobile mob = new Mobile();
		System.out.println("Mobile Brand Name = "+mob.mobileBrandName);
		System.out.println("Mobile Logo = "+mob.mobileLogo);
		System.out.println("Number of Mobile Piece ="+mob.noOfMobilePiece);
		System.out.println("Model Number ="+mob.modelNumber);
		System.out.println("Mobile IMEI Number ="+ mob.mobileImeiNumber);
		System.out.println("Mobile price ="+mob.mobilePrice);
		System.out.println("Is Damaged = "+mob.isDamaged);
		


	}
	
	

}
