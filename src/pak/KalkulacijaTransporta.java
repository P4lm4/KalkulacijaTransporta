package pak;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class KalkulacijaTransporta
{

	public static void main(String[] args)
	{
		
		String ime;
		String prezime;
		String jmbg;
		
		String imeVozila;
		String registracija;
		double prosjecnaPotrosnja;
		TipVozila tip;
		
		
		ArrayList<Vozilo> voziloList = new ArrayList<>();
		ArrayList<Vozac> vozacList = new ArrayList<>();
		ArrayList<Pumpa> pumpaList = new ArrayList<>();
		
		Scanner unos = new Scanner(System.in);
		
		ucitajFajlVozaca(vozacList, "Vozaci.txt");
		ucitajFajlVozila(voziloList, "Vozila.txt");
		
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
				System.out.println("3. Povratak na prethodni meni");
				
				int odabir = unos.nextInt();
				
				if(odabir == 1)
				{
					
					while(true)
					{
						
						System.out.println("1. Spisak vozaca");
						System.out.println("2. Unos novoga vozaca");
						System.out.println("3. Povratak na glavni meni");
						
						int odabirVozac = unos.nextInt();
						
						if(odabirVozac == 1)
						{
							ispisVozaca(vozacList);
							
							System.out.println("---------------------------------------");
							unos.nextLine();
						}
						else if(odabirVozac == 2)
						{
							
							unos.nextLine();
							
							System.out.println("Ime vozaca: ");
							ime = unos.nextLine();
							
							System.out.println("Prezime vozaca: ");
							prezime = unos.nextLine();
							
							System.out.println("JMBG vozaca: ");
							jmbg = unos.nextLine();
							
							System.out.println("---------------------------------------");
							unos.nextLine();
							
							vozacList.add(new Vozac(ime, prezime, jmbg));
							
							snimiFajlVozaca(vozacList, "Vozaci.txt");
						}
						else
						{
							break;
						}
					
					}
					
				}
				else if(odabir == 2)
				{
					while(true)
					{
						System.out.println("1. Spisak vozila");
						System.out.println("2. Unos novog vozila");
						System.out.println("3. Povratak na glavni meni");
						
						int odabirVozila = unos.nextInt();
						
						if(odabirVozila == 1)
						{
							ispisVozila(voziloList);
							
							System.out.println("---------------------------------------");
							unos.nextLine();
						}
						else if(odabirVozila == 2)
						{
							unos.nextLine();
							
							System.out.println("Ime vozila: ");
							imeVozila = unos.nextLine();
							
							System.out.println("Registracija vozila: ");
							registracija = unos.nextLine();
							
							System.out.println("Prosjecna potrosnja: ");
							prosjecnaPotrosnja = unos.nextDouble();
							
							System.out.println("Tip vozila: ");
							System.out.println("1. Teretno ");
							System.out.println("2. Prikljucno");
							
							int izborTipVozila = unos.nextInt();
							
							TipVozila izborVozila = TipVozila.values()[izborTipVozila - 1];
							tip = izborVozila;
							
							System.out.println("---------------------------------------");
							unos.nextLine();
							
							voziloList.add(new Vozilo(imeVozila, registracija, prosjecnaPotrosnja, tip));
							
							snimiFajlVozilo(voziloList, "Vozila.txt");
						}
						else
						{
							break;
						}
					}
					
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
		else
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
		System.out.println("5. Izlaz");
		
	}
	
	public static void ucitajFajlVozaca(ArrayList<Vozac> lista, String nazivFajla)
	{
		File f = new File(nazivFajla);
		
		try
		{
			Scanner s = new Scanner(f);
			
			while(s.hasNext())
			{
				String ime;
				String prezime;
				String jmbg;
				
				ime = s.nextLine();
				prezime = s.nextLine();
				jmbg = s.nextLine();
				
				
				Vozac v = new Vozac(ime, prezime, jmbg);
				
				lista.add(v);
			}
			
			s.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void ucitajFajlVozila(ArrayList<Vozilo> lista, String nazivFajla)
	{
		File f = new File(nazivFajla);
		
		try
		{
			Scanner s = new Scanner(f);
			
			while(s.hasNext())
			{
				String imeVozila;
				String registracija;
				double prosjecnaPotrosnja;
				
				
				
				imeVozila = s.nextLine();
				registracija = s.nextLine();
				prosjecnaPotrosnja = s.nextDouble();
				int brojEnuma = s.nextInt();
				
				TipVozila tip = TipVozila.values()[brojEnuma];				
				
				s.nextLine();
				
				Vozilo v = new Vozilo(imeVozila, registracija, prosjecnaPotrosnja, tip);
				
				lista.add(v);
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Podaci nisu upisani kako treba! ");
		}
	}
	
	public static void snimiFajlVozaca(ArrayList<Vozac> lista, String vozaciDatoteka)
	{
		
		try
		{
			PrintWriter upisFajl = new PrintWriter(vozaciDatoteka);
			
			for(int i = 0; i<lista.size(); i++)
			{
				upisFajl.println(lista.get(i).toFileVozac());
				
			}
			
			upisFajl.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Datoteka nije uspijela da se otovori! ");
		}
	}
	
	public static void snimiFajlVozilo(ArrayList<Vozilo> lista, String vozilaDatoteka)
	{
		
		try
		{
			PrintWriter upisFajl = new PrintWriter(vozilaDatoteka);
			
			for(int i = 0; i<lista.size(); i++)
			{
				upisFajl.println(lista.get(i).toFileVozilo());
			}
			
			upisFajl.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Datoteka nije uspijela da se otovori! ");
		}
	}
	
	public void cijenaGoriva() 
	{
		
	}
	
	public static void ispisVozila(ArrayList<Vozilo> ispis)
	{
		for(int i = 0; i < ispis.size(); i ++)
		{
			System.out.println((i+1) + ") Ime: " + ispis.get(i).getImeVozila() + "\n Registracija: " + ispis.get(i).getRegistracija() + "\n Prosjecna potrosnja: " + ispis.get(i).getProsjecnaPotrosnja() + "\n Tip vozila: " + ispis.get(i).getTip());
		}
	}
	
	public static void ispisVozaca(ArrayList<Vozac> ispis)
	{
		for(int i = 0; i < ispis.size(); i ++)
		{
			System.out.println((i+1) + ") Ime: " + ispis.get(i).getIme() + " \n Prezime: " + ispis.get(i).getPrezime() + " \n JMBG: " + ispis.get(i).getJmbg());
		}
	}

}
