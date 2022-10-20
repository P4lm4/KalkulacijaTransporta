package pak;

public class Vozilo
{
	
	String ime;
	String registracija;
	double prosjecnaPotrosnja;
	TipVozila tip;
	int amortizacija;
	int cijenaRegistracije;
	
	
	public Vozilo(String ime, String registracija, double prosjecnaPotrosnja, TipVozila tip)
	{
		
		this.ime = ime;
		this.registracija = registracija;
		this.tip = tip;
		
	}
	
	public String getIme()
	{
		return ime;
	}
	public void setIme(String ime)
	{
		this.ime = ime;
	}
	
	public String getRegistracija()
	{
		return registracija;
	}
	public void setRegistracija(String registracija)
	{
		this.registracija = registracija;
	}
	
	public double getProsjecnPotrosnja()
	{
		return prosjecnaPotrosnja;
	}
	public void setProsjecnaPotrosnja(double prosjecnaPotrosnja)
	{
		this.prosjecnaPotrosnja = prosjecnaPotrosnja;
	}
	
	public TipVozila getTip()
	{
		return tip;
	}
	public void setTip(TipVozila tip)
	{
		this.tip = tip;
	}
	
	
}
