package pak;

import java.util.ArrayList;

public class KalkulacijaTransporta
{

	public static void main(String[] args)
	{
		
		ArrayList<Vozilo> voziloList = new ArrayList<>();
		
		Vozilo auto = new Vozilo("Audi", "456654156",5,TipVozila.Teretno,256030);
		
		System.out.println(auto);

	}

}
