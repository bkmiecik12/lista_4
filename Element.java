
public class Element {
	int wiersz;
	int kolumna;
	int wartosc;
	Element nastw; // nastepny w wierszu
	Element nastk; //nastepny w kolumnie
	
	public Element(int w,int a,int b)
	{
		wartosc=w;
		wiersz=a;
		kolumna=b;
	}
	
	
}
