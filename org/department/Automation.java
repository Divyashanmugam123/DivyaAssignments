package org.department;

public class Automation extends MultipleLangauge {

	
	public void Java() {
		System.out.println("Java Method");
		
	}

	public void Selenium() {
		System.out.println("Selenium Method");
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby Method");
		
	}
	public static void main(String[] args) {
		Automation a = new Automation();
		a.Java();
		a.Selenium();
		a.ruby();
		a.python();

	}


}
