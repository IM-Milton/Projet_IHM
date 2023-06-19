package View;

import javafx.scene.image.Image;

public class Enemi {
	public int vie;
	public Image img_Enemi;
	
	public Enemi(Image img_enemi , int vie) {
		this.vie = vie;
		this.img_Enemi = img_enemi;
	}

	public Image getType_en() {
		return img_Enemi;
	}


	public int getVie() {
		return vie;
	}

	public void setVie(int vie) {
		this.vie = vie;
	}
	
	public void finalize() {
		System.gc();
	}

}
