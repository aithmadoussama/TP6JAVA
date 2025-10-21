package exercice1;

public class Triangle extends Forme {

	private double base, hauteur;

	public Triangle(String couleur, double base, double hauteur) {
		super(couleur);
		this.hauteur = hauteur;
		this.base = base;
	}

	@Override
	public void dessiner() {
		System.out.println("Dessiner un triangle de couleur " + couleur + ", base=" + base + ", hauteur=" + hauteur);
	}

}
