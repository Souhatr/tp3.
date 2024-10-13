package tp3;
import java.util.Scanner;

public class Calcul {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("donner un entier") ;
		int n = sc.nextInt() ;
		System.out.println("factoriel de n est"+Entier.factoriel(n));
		Entier.absolu(n);
		System.out.println ("donner un entier") ;
		int n2=sc.nextInt();
		Entier.comparer(n, n2);
		Entier.premier(n);
		Entier e1= new Entier(n);
		Entier.count++;
		System.out.println(e1.factoriel(n));
		e1.absolu(n);
		e1.premier(n);
		e1.comparer(n, n2);
		System.out.println(Entier.count);
		
	
		
	}

}
