
public class Macierz {
Element pierwszy;

public Macierz()
{
	pierwszy=new Element(0,0,0);
}

public void wyswietl()
{
	Element k=pierwszy.nastk.nastw;
	Element w=pierwszy.nastk.nastw;
	
	while(w!=null)
	{
		int kontrola=1;
		while(k!=null)
		{
			if(kontrola==k.kolumna)
			{
				System.out.printf("%2d ",k.wartosc);
				k=k.nastw;
			}
			else System.out.printf("%2d ",0);
			
			kontrola++;
			
		}
		System.out.println();
		w=w.nastk;
		k=w;
	}
	System.out.println();
}

public void dodaj(int wart,int w,int k)
{
	Element n=new Element(wart,w,k);
	Element t=pierwszy;
	
	while(t.kolumna<k)
		t=t.nastw;
	while(t.wiersz<w-1 && t.nastk!=null)
		t=t.nastk;
	t.nastk=n;
	
	t=pierwszy;
	while(t.wiersz<w)
		t=t.nastk;
	while(t.kolumna<k-1)
		t=t.nastw;
	t.nastw=n;
}
public void obliczPrzekatna()
{
	Element k=pierwszy.nastk.nastw;
	Element w=pierwszy.nastk.nastw;
	
	int suma=0;
	
	while(w!=null)
	{
		while(k!=null)
		{
			if(k.wiersz==k.kolumna)
			{
				suma+=k.wartosc;
				
			}
			k=k.nastw;
		}
		w=w.nastk;
		k=w;
	}
	System.out.println("Œlad macierzy: "+suma);
}

}
