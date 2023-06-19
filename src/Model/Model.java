package Model;

import View.Enemi;
import View.Item;
import View.Personne;

public class Model {

	public Personne perso;
	public String nom;
	public Maps map;
	public Enemi enemi;
	public Item item;
	
	
	
	public Model() {

	}
	
	public void  setNom(String nom) {
		this.perso.setNom(nom);
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	public void ChangerMaps() {
		
		
	}
	public void SeDeplacer() {
		
		
	}
	
}
