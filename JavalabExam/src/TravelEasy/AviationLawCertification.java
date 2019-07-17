package TravelEasy;

public interface AviationLawCertification 
{
	// interface constant
	final int EXAM_FEE = 500;
	final double DISCOUNT_FACTOR = 0.05;
	final float CAR_INSURANCE = 100;
	
	//abstract method
	void payExamFee();
	
	//default method
	default void displayExamFee()
	{
		System.out.println("The Exam fees are: " + EXAM_FEE);
	}
	
	//static method
	static void displayCarInsurance()
	{
		System.out.println("The Car Insurance is: " + CAR_INSURANCE);
	}
}
