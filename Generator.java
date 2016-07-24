import java.util.*;

public class Generator {
	Macierz m1;
	Macierz m2;
	Macierz wynik;
	public Generator()
	{
		m1=new Macierz();
		m2=new Macierz();
		wynik=new Macierz();
	}
	public void dodajglowy(int w, int k)
	{
		for(int i=1;i<=w;i++)
		{
			Element e1 = m1.pierwszy;
			Element e2 = m2.pierwszy;
			Element e3 = wynik.pierwszy;
			while(e1.nastk!=null)
			{
				e1=e1.nastk;
				e2=e2.nastk;
				e3=e3.nastk;
			}
			e1.nastk=new Element(0,i,0);
			e2.nastk=new Element(0,i,0);
			e3.nastk=new Element(0,i,0);
		}
		
		for(int i=1;i<=k;i++)
		{
			Element e1 = m1.pierwszy;
			Element e2 = m2.pierwszy;
			Element e3 = wynik.pierwszy;
			while(e1.nastw!=null)
			{
				e1=e1.nastw;
				e2=e2.nastw;
				e3=e3.nastw;
			}
			e1.nastw=new Element(0,0,i);
			e2.nastw=new Element(0,0,i);
			e3.nastw=new Element(0,0,i);
		}
		//m1.wyswietl();
		//m2.wyswietl();
	}
	
	public void generuj()
	{
		Random r = new Random();
		int iloscWierszy=r.nextInt(4)+2;
		int iloscKolumn=r.nextInt(4)+2;
		//Element e1=m1.pierwszy;
		//Element e2=m2.pierwszy;
		System.out.println(iloscWierszy+" "+iloscKolumn+"\n");
		dodajglowy(iloscWierszy,iloscKolumn);
		for(int i=1;i<=iloscWierszy;i++)
		{
			for(int j=1;j<=iloscKolumn;j++)
			{
				int w1=r.nextInt(50);
				int w2=r.nextInt(50);
				int rand1=r.nextInt(5);
				int rand2=r.nextInt(5);
				if(w1!=0)
				m1.dodaj(w1, i, j);
			}
		}
	}
	
	public void oblicz()
	{
		Element k=m1.pierwszy.nastk.nastw;
		Element w=m1.pierwszy.nastk.nastw;
		
		Element k2=m2.pierwszy.nastk.nastw;
		Element w2=m2.pierwszy.nastk.nastw;
		
		while(w!=null)
		{
			int kontrola=1;
			while(k!=null)
			{
				if(kontrola==k.kolumna && kontrola==k2.kolumna)
				{
					wynik.dodaj(k.wartosc+k2.wartosc, k.wiersz, k.kolumna);
					k=k.nastw;
					k2=k2.nastw;
				}
				else if(kontrola!=k.kolumna)
				{
					wynik.dodaj(k2.wartosc, k2.wiersz, k2.kolumna);
					k2=k2.nastw;
				}
				else if(kontrola!=k2.kolumna)
				{
					wynik.dodaj(k.wartosc, k.wiersz, k.kolumna);
					k=k.nastw;
				}
				else if(kontrola!=k.kolumna && kontrola!=k2.kolumna)
				{
					wynik.dodaj(0, w.wiersz, kontrola);
				}
				kontrola++;
				
			}
			//System.out.println();
			w=w.nastk;
			k=w;
			w2=w2.nastk;
			k2=w2;
		}
		wynik.wyswietl();
	}
}
