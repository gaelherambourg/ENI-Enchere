package fr.eni.ENIEnchere.bll;

import fr.eni.ENIEnchere.dal.DaoFactory;
import fr.eni.ENIEnchere.dal.UtilisateurDao;

public class UtilisateurManager {

	private UtilisateurDao utilisateurDao;

	public UtilisateurManager() {
		this.utilisateurDao = DaoFactory.getUtilisateurDAO();
	}

	public void validerLogin(String login, String password) {
		utilisateurDao.selectByLogin(login, password);
	}
}
