package fr.eni.ENIEnchere.bll;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.eni.ENIEnchere.dal.DaoFactory;
import fr.eni.ENIEnchere.dal.UtilisateurDao;

public class UtilisateurManager {

	private UtilisateurDao utilisateurDao;

	public UtilisateurManager() {
		this.utilisateurDao = DaoFactory.getUtilisateurDAO();
	}

	public void validerLogin(String login, String password) {
		try {
			validerEmail(login);
			utilisateurDao.selectByLogin(login, password);
		} catch (Exception e) {

		}

	}

	private void validerEmail(String email) {
		Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
		Matcher mat = pattern.matcher(email);
		if (mat.matches()) {
			System.out.println("Valid email address");
		} else {
			System.out.println("Not a valid email address");
		}
	}
}
