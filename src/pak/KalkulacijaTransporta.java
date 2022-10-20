package pak;

import java.util.ArrayList;
import java.util.Scanner;


public class KalkulacijaTransporta
{

	public static void main(String[] args)
	{
		
		ArrayList<Vozilo> voziloList = new ArrayList<>();
		ArrayList<Vozac> vozacList = new ArrayList<>();
		ArrayList<Pumpa> pumpaList = new ArrayList<>();
		
		Scanner unos = new Scanner(System.in);
		
		while(true)
		{
			Menu();
			int unosMeni = unos.nextInt();
			
		if(unosMeni == 1)
		{
			
		}
		else if(unosMeni == 2)
		{
			
			while(true)
			{
				System.out.println("1. Vozaci");
				System.out.println("2. Vozila");
				
				int odabir = unos.nextInt();
				
				if(odabir == 1)
				{
					
					
					
				}
				else if(odabir == 2)
				{
					
				}
				else
				{
					break;
				}
			}
			
			
		}
		else if(unosMeni == 3)
		{
			
			
			
		}
		else if(unosMeni == 4)
		{
			break;
		}
		
		
		}
		
		

	}
	
	public static void Menu() 
	{
		
		System.out.println("Meni");
		System.out.println("1. Kalkulacija transporta");
		System.out.println("2. Spisak vozila i vozaca");
		System.out.println("3. Pumpe i gorivo");
		System.out.println("4. Putarine");
		
	}
	
	public void cijenaGoriva() 
	{
		
	}

}
