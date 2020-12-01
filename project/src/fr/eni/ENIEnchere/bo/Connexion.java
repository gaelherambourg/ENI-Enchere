package fr.eni.ENIEnchere.bo;

import javax.servlet.http.HttpServletRequest;

import fr.eni.ENIEnchere.bll.UtilisateurManager;

public class Connexion {

	public Utilisateur Connecter(HttpServletRequest request) {
		String login = request.getParameter("pseudo");
		String mp = request.getParameter("password");
		try {
			UtilisateurManager um = new UtilisateurManager();
			um.validerLogin(login, mp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setLogin(login);
		utilisateur.setMotDePasse(mp);

		return utilisateur;

	}

}
