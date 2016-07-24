import java.util.*;

public class Main {
	public static void main(String[] args) {
		Generator g=new Generator();
//		g.generuj();
//		g.m1.wyswietl();
//		g.m2.wyswietl();
//		g.oblicz();
		
		Scanner s=new Scanner(System.in);
		System.out.println("Podaj rozmiar macierzy");
		int kolumny=s.nextInt();
		int wiersze=s.nextInt();
		g.dodajglowy(wiersze,kolumny);
		System.out.println("Wprowadü pierwszπ macierz");
		for(int i=1;i<=wiersze;i++)
		{
			for(int j=1;j<=kolumny;j++)
			{
				int w1=s.nextInt();

				//if(w1!=0)
				g.m1.dodaj(w1, i, j);

			}
		}
		System.out.println("Wprowadü druga macierz");
		for(int i=1;i<=wiersze;i++)
		{
			for(int j=1;j<=kolumny;j++)
			{
				int w2=s.nextInt();
			
				//if(w2!=0)
				g.m2.dodaj(w2, i, j);
			}
		}
		g.m1.wyswietl();
		g.m2.wyswietl();
		g.oblicz();
		g.wynik.obliczPrzekatna();
//		System.out.println("Obliczenie przekπtnej");
//		System.out.println("Podaj rozmiar macierzy");
//		int x=s.nextInt();
//		g.dodajglowy(x, x);
//		System.out.println("Wprowadü macierz do obliczenia przekπtnej");
//		for(int i=1;i<=x;i++)
//		{
//			for(int j=1;j<=x;j++)
//			{
//				int w2=s.nextInt();
//			
//				//if(w2!=0)
//				g.m2.dodaj(w2, i, j);
//			}
//		}
//		g.m2.wyswietl();
//		g.m2.obliczPrzekatna();
	}

}
