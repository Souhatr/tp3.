package tp3;

import java.util.Scanner;

public class CalculMoyenne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("donner un entier");
		int nb=sc.nextInt();
		while(nb>tab.NMAX)
		{
			System.out.println("donner un entier");
			nb=sc.nextInt();
		}	
		float noteCtrl[]=new float[nb];
		float noteExaman[]=new float[nb];
		tab.remplir(noteCtrl);
		tab.remplir(noteExaman);
		tab.lister(noteCtrl);
		tab.lister(noteExaman);
		float moy[]=new float[nb];
		moy=tab.additionner(noteCtrl, tab.produit(2, noteExaman));
		for(int i=0;i<nb;i++)
		{
			System.out.println("case"+i+":"+moy[i]);
		}
		System.out.println("la moyenne de la classe est"+(tab.somme_element(moy)/nb));
		
		
	}

}
