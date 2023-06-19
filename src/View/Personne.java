package View;

import javafx.scene.image.Image;

public class Personne {

	private String nom;
	private int vie;
	private int tresorie;
	public Image img_Perso;
	
	public Personne(String nom, Image image) {
		this.nom = nom;
		this.img_Perso = image;
	}

	public String getNom() {
		return nom;
	}
	
	public Image getImage() {
		return img_Perso;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getVie() {
		return vie;
	}

	public void setVie(int vie) {
		this.vie = vie;
	}

	public int getTresorie() {
		return tresorie;
	}

	public void setTresorie(int tresorie) {
		this.tresorie = tresorie;
	}
	
	public void finalize() {
		System.gc();
	}
	
	
}
