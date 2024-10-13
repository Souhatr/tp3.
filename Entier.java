package tp3;
public class Entier {
	private int num;
	static int count=0;
	public Entier(int num)
	{
		this.num=num;
	}
	public static int  factoriel(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}
	public static void  absolu(int n)
	{
		if(n<0)
			System.out.println("la valeur absolu de n est"+-n);
		else
			System.out.println("la valeur absolu de n est"+n);
	}
	public static void comparer(int e1,int e2)
	{
		if(e1==e2)
			System.out.println("sont identiques");
		else
			System.out.println("ne sont pas identiques");
			
	}
	public static void premier(int n)
	{
		int d=2;
		boolean ok=true;
		while((d<=n/2)&ok){
			if (n%d!=0)
				d=d+1;
			else
				ok=false;
			
		}
		if (ok=true)
			System.out.println(n+"est premier");
		else
			System.out.println(n+"n'est pas premier");
	}
	

	
}
