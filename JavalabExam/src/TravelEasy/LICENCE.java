package TravelEasy;


public class LICENCE 
{
	boolean validLicence = false;
	
	
	// Default constructor
	public LICENCE ( ) 
    {
		setLicence();
    }
	
	//methods get/set
	public void setLicence()
	{
		validLicence = true;
	}
	
	public String getLicence()
	{
		String s = "GetLicence() " + this.validLicence;
		
		return s;
	}
	
}
