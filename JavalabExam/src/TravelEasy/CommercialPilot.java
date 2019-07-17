package TravelEasy;

public class CommercialPilot extends Pilot 
{
	//member variables
	boolean hasLicence = false;
	
	//constructor
	public CommercialPilot(String id, String name, double hourlyRate, int numHolidays) 
	{
		super(id, name, hourlyRate, numHolidays);
	}

	//overloaded constructor
	public CommercialPilot(String id, String name, double hourlyRate, int numHolidays, double overtime) 
	{
		super(id, name, hourlyRate, numHolidays, overtime);
	}
	
	//======= methods ============
	@Override
	public void calculateSalary() 
	{
		weeklySalary = hourlyRate * normalNumberOfHours;
		
		if (this.overtime > 0)
		{
			weeklySalary += overtime * hourlyRate;
		}
	}
	
	public void displayLicence()
	{
		System.out.println("Pilot has Licence: " + hasLicence);
	}
	
	// overloaded method
	public void displayLicence(char licence)
	{
		switch(licence)
		{
			case 't':
			case 'T':
				this.hasLicence = true;
				break;
			case 'f':
			case 'F':
				this.hasLicence = false;
				break;
			default:
				this.hasLicence = false;
				
		}
		System.out.println("Pilot has Licence: " + hasLicence);
	}
	
	//toString
	@Override
	public String toString() 
	{
		String s = String.format("toString(): %s %s %d %.2f",this.id, this.name, this.numHolidays, this.weeklySalary);

		return s;
	}
}
