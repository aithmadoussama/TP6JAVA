package exercice1;

public class Forme {
	protected String couleur;

	public Forme(String couleur) {
		this.couleur = couleur;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public void dessiner() {
		System.out.println("Dessiner une forme de couleur " + couleur);
	}
}
