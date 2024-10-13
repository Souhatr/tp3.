package tp3;

public class Banque {

	public static void main(String[] args) {
		Compte co1= new Compte();
		System.out.println("numero"+Compte.count);
		System.out.println("solde"+co1.avoirSolde());
		Compte co2= new Compte();
		System.out.println("numero"+Compte.count);
		System.out.println("solde"+co2.avoirSolde());
		co1.deposer(1200);
		co2.deposer(500);
		System.out.println("solde"+co1.avoirSolde());
		System.out.println("solde"+co2.avoirSolde());
		co2.transferer(700, co1);
		co2.retirer(700);
		if(co1.avoirSolde()<0)
			System.out.println("co1 est en rouge et son solde est"+co1.avoirSolde());
		if(co2.avoirSolde()<0)
			System.out.println("co2 est en rouge et son solde est"+co2.avoirSolde());
		
			
		
		

	}

}
