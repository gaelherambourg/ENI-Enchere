package fr.eni.ENIEnchere.bll;

import fr.eni.ENIEnchere.bo.Utilisateur;
import fr.eni.ENIEnchere.dal.DaoFactory;
import fr.eni.ENIEnchere.dal.UtilisateurDao;

public class UtilisateurManager {

	UtilisateurDao uDao;
	
	public UtilisateurManager() {
		
		uDao = DaoFactory.getUtilisateurDao();
	}
	
	public void ajouterUtilisateur(Utilisateur utilisateur) throws BllException {
		
		
		validerUtilisateur(utilisateur);
		uDao.add(utilisateur);
		
	}

	
	private void validerUtilisateur(Utilisateur utilisateur) throws BllException {
		if (utilisateur != null && utilisateur.getNom() != null && utilisateur.getNom().trim().length() > 0
				&& utilisateur.getPrenom() != null && utilisateur.getPrenom().trim().length() > 0
				&& utilisateur.getEmail() != null && utilisateur.getEmail().trim().length() > 0
				&& utilisateur.getRue() != null && utilisateur.getRue().trim().length() > 0
				&& utilisateur.getCode_postal() != null && utilisateur.getCode_postal().trim().length() > 0
				&& utilisateur.getVille() != null && utilisateur.getVille().trim().length() > 0
				&& utilisateur.getMot_de_passe() != null && utilisateur.getMot_de_passe().trim().length() > 0) {

		} else {
			BllException ex = new BllException("L'utilisateur n'est pas correct !!");
			throw ex;
		}
	}
	
}
