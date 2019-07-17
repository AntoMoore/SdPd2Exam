package TravelEasy;

public abstract class AvationStaff 
{
	//member variables
	String id;
	String name;
	double hourlyRate;
	double normalNumberOfHours = 37.5;
	double weeklySalary;
	//static variable
	static float CAR_INSURANCE = 200;
	
	//abstract methods
	public abstract void calculateSalary();
	public abstract void display();
	
	//static method
	static void displayCarInsurance()
	{
		System.out.println("The Car Insurance is: " + CAR_INSURANCE);
	}
}
