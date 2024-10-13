package tp3;

public class maison {
	private String type;
	private String adr;
	private int nbchambre;
	private float surface;
	public  maison (String adr, String t, int n) 
	{
		this.adr=adr;
		this.type=t;
		this.nbchambre=n;
		
	}
	 public maison (String a, String t, int n, float s)
	 {
		 this.adr=a;
		 this.type=t;
		 this.nbchambre=n;
		 this.surface=s;
	 }
	 void setSurface(float s)
	 {
		 this.surface=s;
	 }
	 float calculPrix(float pmc)
	 {
		 return this.surface*pmc;
	 }
	 float calculPrix()
	 {
		 return 2100*surface;
	 }
	 public String toString()
	 {
		 return"un appartement de"+surface+"m^2 a"+adr+"avec"+nbchambre+"chambres";
	 }
	 
		
}
