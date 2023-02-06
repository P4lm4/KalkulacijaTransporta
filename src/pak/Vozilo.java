package pak;

public class Vozilo
{
	
	String imeVozila;
	String registracija;
	double prosjecnaPotrosnja;
	TipVozila tip;
	int amortizacija;
	int cijenaRegistracije;
	
	
	public Vozilo(String imeVozila, String registracija, double prosjecnaPotrosnja, TipVozila tip)
	{
		
		this.imeVozila = imeVozila;
		this.registracija = registracija;
		this.tip = tip;
		
	}
	
	public String getImeVozila()
	{
		return imeVozila;
	}
	public void setImeVozila(String ime)
	{
		this.imeVozila = ime;
	}
	
	public String getRegistracija()
	{
		return registracija;
	}
	public void setRegistracija(String registracija)
	{
		this.registracija = registracija;
	}
	
	public double getProsjecnaPotrosnja()
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
	
	public String toFileVozilo()
	{
		return this.imeVozila + "\n" + this.registracija + "\n" + this.prosjecnaPotrosnja + "\n" + this.tip;
	}
	
	
}
