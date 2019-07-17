package TravelEasy;

public final class FlightAttendant extends AvationStaff implements AviationLawCertification
{
	//member variables
	int numHolidays;
	
	//constructor
	public FlightAttendant(String id, String name, double hourlyRate, int numHolidays) 
	{
		this.id = id;
		this.name = name;
		this.hourlyRate = hourlyRate;
		this.numHolidays = numHolidays;
	}
	
	//======= methods ============
	@Override
	public void calculateSalary() 
	{
		weeklySalary = hourlyRate * normalNumberOfHours;
	}

	@Override
	public void display() 
	{
		//call calculateSalary method
		this.calculateSalary();
		//output
		System.out.printf("ID: %s || Name: %s || Holidays: %d || Salary: %.2f \n", this.id, this.name, this.numHolidays, this.weeklySalary);
	}
	
	@Override
	public String toString() 
	{
		String s = String.format("toString(): %s %s %d %.2f",this.id, this.name, this.numHolidays, this.weeklySalary);

		return s;
	}
	
	// Interface Methods
	@Override
	public void payExamFee() 
	{
		System.out.println("Fee's paid: " + (DISCOUNT_FACTOR * EXAM_FEE) + " by " + this.name);
		
	}
	
	@Override
	public void displayExamFee() 
	{
		AviationLawCertification.super.displayExamFee();
	}
	
	// equals method
	@Override
	public boolean equals(Object obj) 
	{
		FlightAttendant other = (FlightAttendant)obj;
		
		if (other.id==id && other.name == name && other.hourlyRate == hourlyRate && other.numHolidays == numHolidays)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	

}
