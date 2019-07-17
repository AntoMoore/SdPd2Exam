package TravelEasy;

// NB - Pilot can not be concrete as it has 2 sub-classes
public class Pilot extends AvationStaff 
{
	//member variables
	int numHolidays;
	double overtime;
	
	//embedded class
	LICENCE licence;
	
	// basic constructor
	public Pilot(String id, String name, double hourlyRate, int numHolidays) 
	{
		this.id = id;
		this.name = name;
		this.hourlyRate = hourlyRate;
		this.numHolidays = numHolidays;
		//embedded class
		licence = new LICENCE();
	}
	
	// overloaded constructor
	public Pilot(String id, String name, double hourlyRate, int numHolidays, double overtime) 
	{
		//call basic constructor
		this(id, name, hourlyRate, numHolidays);
		// add overtime
		this.overtime = overtime;
		//embedded class
		licence = new LICENCE();
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

	@Override
	public void display() 
	{
		//call calculaterSalary
		this.calculateSalary();
		//output
		System.out.printf("ID: %s || Name: %s || Holidays: %d || Salary: %.2f \n", this.id, this.name, this.numHolidays, this.weeklySalary);

	}

}
