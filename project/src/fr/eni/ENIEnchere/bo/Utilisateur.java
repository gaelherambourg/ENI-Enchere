package fr.eni.ENIEnchere.bo;
import java.io.Serializable;

public class Utilisateur implements Serializable {

	private String login;
	private String motDePasse;

	public Utilisateur() {

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

}
