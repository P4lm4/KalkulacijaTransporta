package pak;

public class Vozilo
{
	
	String ime;
	String registracija;
	int brojSasije;
	TipVozila tip;
	int pocetniKilometri;
	int amortizacija;
	int velicinaRezervoara;
	
	public Vozilo(String ime, String registracija, int brojSasije, TipVozila tip, int pocetniKilometri)
	{
		
		this.ime = ime;
		this.registracija = registracija;
		this.brojSasije = brojSasije;
		this.tip = tip;
		this.pocetniKilometri = pocetniKilometri;
		
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
	
	public TipVozila getTip()
	{
		return tip;
	}
	public void setTip(TipVozila tip)
	{
		this.tip = tip;
	}
	
	public int setPocetniKilometri()
	{
		return pocetniKilometri;
	}
	public void getPocetniKilometri(int pocetniKilometri)
	{
		this.pocetniKilometri = pocetniKilometri;
	}

}
