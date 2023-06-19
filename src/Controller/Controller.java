package Controller;

import Model.Model;


public class Controller {
	
	Model model;
	
	public Controller(Model Model) {
		this.model = Model;
	}
	
	public void Sedeplacer() {
		model.SeDeplacer();
	}
	
	public void setNom(String nom) {
		model.setNom(nom);
	}
	
	public void ChangerMap() {
		
	}
	
	
	
}
