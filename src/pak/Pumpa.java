package pak;

public class Pumpa 
{

	VrstaGoriva vrstaGoriva;
	double cijenaGoriva;
	String nazivPumpe;
	
	public Pumpa(VrstaGoriva vrstaGoriva, double cijenaGoriva, String nazivPumpe)
	{
		this.vrstaGoriva = vrstaGoriva;
		this.cijenaGoriva = cijenaGoriva;
		this.nazivPumpe = nazivPumpe;
	}
	
	public VrstaGoriva getVrstaGoriva()
	{
		return vrstaGoriva;
	}
	public void setVrstaGoriva(VrstaGoriva vrstaGoriva)
	{
		this.vrstaGoriva = vrstaGoriva;
	}
	
	public double getCijenaGoriva()
	{
		return cijenaGoriva;
	}
	public void setCijenaGoriva(double cijenaGoriva)
	{
		this.cijenaGoriva = cijenaGoriva;
	}
	
	public String getNazivPumpe()
	{
		return nazivPumpe;
	}
	public void setNazivPumpe(String nazivPumpe)
	{
		this.nazivPumpe = nazivPumpe;
	}
}
