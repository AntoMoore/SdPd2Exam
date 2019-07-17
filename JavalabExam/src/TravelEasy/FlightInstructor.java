package TravelEasy;

public class FlightInstructor extends Pilot 
{
	//member variables
	int bonus;

	//constructors
	public FlightInstructor(String id, String name, double hourlyRate, int numHolidays, int bonus) 
	{
		super(id, name, hourlyRate, numHolidays);
		this.bonus = bonus;
	}

	//overloaded constructor
	public FlightInstructor(String id, String name, double hourlyRate, int numHolidays, double overtime, int bonus) 
	{
		super(id, name, hourlyRate, numHolidays, overtime);
		this.bonus = bonus;
	}
	
	//======= methods ============
	@Override
	public void calculateSalary() 
	{
		weeklySalary = hourlyRate * normalNumberOfHours;
		
		if (this.overtime > 0)
		{
			weeklySalary += overtime * (hourlyRate * 1.5);
		}
	}
	
	@Override
	public void display() 
	{
		//call calculaterSalary
		this.calculateSalary();
		//output
		System.out.printf("ID: %s || Name: %s || Salary: %.2f || Bonus: %d \n", this.id, this.name, this.weeklySalary, this.bonus);

	}

}
