package fr.eni.ENIEnchere.dal;

public class DaoFactory {

	public static UtilisateurDao getUtilisateurDao() {
		
		
		return new UtilisateurDaoJdbcImpl();
	}
	
}
