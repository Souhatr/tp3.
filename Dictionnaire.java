package tp3;

public class Dictionnaire {
	private int nbMots;
	private MotDico[] dico;
	private String nom;
	public Dictionnaire(String nom)
	{
		this.dico= new MotDico[100];
		this.nom=nom;
		this.nbMots=MotDico.num;
		
	}
	public void ajouterMot (MotDico m)
	{
			dico[nbMots++]=m;	
	}
	public void supprimerMot (String ch)
	{
		
	}
	public int chercherMot (String ch)
	{
		for(int i=0;i<nbMots;i++)
		{
			if(dico[i].getMot()==ch)
				return i;
		}
		return -1;
	}
	public void listerDico ()
	{
		for(int i=0;i<nbMots;i++)
		{
			System.out.println("case"+i+":"+dico[i]);
		}
	}
	public int nbSynonymes (MotDico m)
	{
		int nb=0;
        for (int i=0;i<nbMots;i++) {
            if (dico[i].synonyme(m))
            {
                nb++;
            }
        }
        return nb;
	}
	
}
