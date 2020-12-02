package fr.eni.ENIEnchere.bll;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.eni.ENIEnchere.BusinessException;
import fr.eni.ENIEnchere.bo.Utilisateur;
import fr.eni.ENIEnchere.dal.DaoFactory;
import fr.eni.ENIEnchere.dal.UtilisateurDao;

public class UtilisateurManager {

	UtilisateurDao uDao;

	public UtilisateurManager() {

		uDao = DaoFactory.getUtilisateurDao();
	}

	public void ajouterUtilisateur(Utilisateur utilisateur) throws BusinessException {

		BusinessException businessException = new BusinessException();
		validerUtilisateur(utilisateur, businessException);

		if (!businessException.hasErreurs()) {
			uDao.add(utilisateur);
		} else {
			throw businessException;
		}
	}

	public void validerLogin(String login, String password) throws BusinessException {

		uDao.selectByLogin(login, password);

	}

	public List<String> listePseudo() throws BusinessException {

		return uDao.selectPseudo();
	}

	public List<String> listeEmail() throws BusinessException {

		return uDao.selectEmail();
	}

	private void validerUtilisateur(Utilisateur utilisateur, BusinessException businessException)
			throws BusinessException {
		if (utilisateur != null && utilisateur.getNom() != null && utilisateur.getNom().trim().length() > 0
				&& utilisateur.getPrenom() != null && utilisateur.getPrenom().trim().length() > 0
				&& utilisateur.getEmail() != null && utilisateur.getEmail().trim().length() > 0
				&& utilisateur.getRue() != null && utilisateur.getRue().trim().length() > 0
				&& utilisateur.getCode_postal() != null && utilisateur.getCode_postal().trim().length() > 0
				&& utilisateur.getVille() != null && utilisateur.getVille().trim().length() > 0
				&& utilisateur.getMot_de_passe() != null && utilisateur.getMot_de_passe().trim().length() > 0) {

		} else {
			businessException.ajouterErreur(CodesResultatBLL.REGLE_UTILISATEUR);
		}
	}

// Méthode vérification mail
//	private void validerEmail(String email, BusinessException businessException) {
//		Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
//		Matcher mat = pattern.matcher(email);
//		if (mat.matches()) {
//			System.out.println("Valid email address");
//		} else {
//			businessException.ajouterErreur(CodesResultatBLL.VALID_EMAIL);
//		}
//	}
}
