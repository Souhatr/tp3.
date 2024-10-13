package tp3;

public class mainMison {

	public static void main(String[] args) {
		maison m1= new maison("Tunis","un duplex",4,210);
		maison m2=new maison("Nabeul","villa",5);
		System.out.println(m1);
		System.out.println(m2);
		m2.setSurface(230);
		System.out.println("prix1"+m1.calculPrix(3000));
		System.out.println("prix2"+m1.calculPrix());
		System.out.println("prix1"+m2.calculPrix(3000));
		System.out.println("prix2"+m2.calculPrix());

		

	}

}
