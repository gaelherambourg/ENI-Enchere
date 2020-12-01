package fr.eni.ENIEnchere.bo;
import java.io.Serializable;

public class Utilisateur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String pseudo;
	private String motDePasse;

	public Utilisateur() {

	}

	public String getLogin() {
		return pseudo;
	}

	public void setLogin(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

}
