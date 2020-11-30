package fr.eni.ENIEnchere.bo;

import javax.servlet.http.HttpServletRequest;

public class Connexion {

	public Utilisateur Connecter(HttpServletRequest request) {
		String login = request.getParameter("login");
		String mp = request.getParameter("mp");

		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setLogin(login);
		utilisateur.setMotDePasse(mp);
		
		
		return utilisateur;

	}

}
