package TravelEasy;

public class TestClass 
{

	public static void main(String[] args)
	{
		//test FlightAttendant class
		FlightAttendant enricoFermi = new FlightAttendant("006", "Enrico Fermi", 60.00, 20);
		enricoFermi.display();
		System.out.println(enricoFermi.toString());
		
		//test Pilot Class
		Pilot edmondHalley = new Pilot("007", "Edmond Halley", 150.00, 0, 15);
		edmondHalley.display();
		
		//test CommercialPilot class
		CommercialPilot testPilot = new CommercialPilot("008", "Test Pilot", 100.00, 0);
		testPilot.display();
		System.out.println(testPilot.toString());
		//use displayLicence
		testPilot.displayLicence();
		//use displayLicence (overloaded)
		testPilot.displayLicence('T');
		
		//test FlightInstructor class
		FlightInstructor janeGoodall = new FlightInstructor("009", "Jane Goodall", 140.00, 0, 10.00, 5000);
		janeGoodall.display();
		
		//test Interface (FlightAttendant)
		FlightAttendant jenniferGreene = new FlightAttendant("010", "Jennifer Green", 50.00, 10);
		jenniferGreene.payExamFee();
		jenniferGreene.displayExamFee();
		AviationLawCertification.displayCarInsurance();
		
		//test POLYMORPHISM
		Pilot mariaMitchell = new FlightInstructor("011", "Maria Mitchell", 250.00, 0, 0, 5000);
		mariaMitchell.display();
		
		//test Static methods in interface and class
		AviationLawCertification.displayCarInsurance(); //interface call
		AvationStaff.displayCarInsurance(); //class call
		
		//test equals method (FlightAttendant)
		FlightAttendant myHusband = new FlightAttendant("012", "Married", 75.00, 20);
		FlightAttendant myWife = new FlightAttendant("012", "Married", 75.00, 20);
		System.out.println("Are Objects equal: " + myHusband.equals(myWife));
		
		// test COMPOSITION embedded class (LICENCE)
		Pilot composition = new CommercialPilot("013", "composition", 100.00, 0);
		System.out.print(composition.licence.getLicence());
		
	}

}
