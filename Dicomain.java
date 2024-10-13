package tp3;

public class Dicomain {

	public static void main(String[] args) {
		Dictionnaire d1= new Dictionnaire("larousse");
		d1.ajouterMot(new MotDico("cheval","Grand mammifère à crinière, domestiqué par l'homme comme animal de trait et de transport "));
		d1.ajouterMot(new MotDico("pomme","Fruit du pommier, rond, à pulpe ferme et juteuse."));
		d1.ajouterMot(new MotDico("joie","Émotion agréable et profonde"));
		d1.listerDico();
		
		

	}

}
