package tp3;

public class Compte {
	private int num;
	private int solde;
	public static int count=0;
	public Compte()
	{
		count++;
		this.num=count;
		this.solde=0;
	}
	void deposer(float m)
	{
		this.solde+=m;
	}
	void retirer(float m)
	{
		this.solde-=m;
	}
	int avoirSolde()
	{
		return this.solde;
	}
	void transferer(float m,Compte c)
	{
		c.solde+=m;
	}
	
}
