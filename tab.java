package tp3;

import java.util.Scanner;

public class tab {
	static int NMAX=40;
	public static void remplir(float t[])
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<t.length;i++)
		{
			System.out.println("case"+i+":");
			t[i]=sc.nextFloat() ;
		}
	}
	public static float somme_element (float t[])
	{
		float s=0;
		for(int i=0;i<t.length;i++)
		{
			s=s+t[i];
		}
		return s;
	}
	public static float[] additionner (float t1[], float t2[])
	{
		float t[]=new float[t1.length];
		for(int i=0;i<t1.length;i++)
		{ 
			t[i]=t1[i]+t2[i];
		}
		return t;
	}
	public static float[] produit (float x, float t[])
	{
		float t1[]=new float[t.length];
		for(int i=0;i<t.length;i++)
		{ 
			t1[i]=x*t[i];
		}
		return t1;
	}
	public static void lister (float t[])
	{
		for(int i=0;i<t.length;i++)
		{
			 System.out.println("case"+i+":"+t[i]);
		}
	}
	public static float[] additionner(float x,float t[])
	{
		float t1[]=new float[t.length];
		for(int i=0;i<t.length;i++)
		{ 
			t1[i]=t[i]+x;
		}
		return t1;
	}
	
	  
	
	
	
}
 