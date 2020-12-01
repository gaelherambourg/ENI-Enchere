package fr.eni.ENIEnchere.bll;

import fr.eni.ENIEnchere.bo.Utilisateur;
import fr.eni.ENIEnchere.dal.DaoFactory;
import fr.eni.ENIEnchere.dal.UtilisateurDao;

import java.util.List;

import fr.eni.ENIEnchere.BusinessException;

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

}
