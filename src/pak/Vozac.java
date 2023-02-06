package pak;

public class Vozac
{
	
	String ime;
	String prezime;
	String jmbg;
	int predjenoKilometara;
	int plata;
	int plataPoKilometru;
	
	public Vozac(String ime, String prezime, String jmbg)
	{
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
	}
	
	public String getIme()
	{
		return ime;
	}
	public void setIme(String ime)
	{
		this.ime = ime;
	}
	
	public String getPrezime()
	{
		return prezime;
	}
	public void setPrezime(String prezime)
	{
		this.prezime = prezime;
	}
	
	public String getJmbg()
	{
		return jmbg;
	}
	public void setJmbg(String jmbg)
	{
		this.jmbg = jmbg;
	}
	public String toFileVozac()
	{
		return this.ime +"\n" + this.prezime + "\n" + this.jmbg;
	}
}
