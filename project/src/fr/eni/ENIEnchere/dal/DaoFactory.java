package fr.eni.ENIEnchere.dal;


public class DaoFactory {
	
	public static UtilisateurDao getUtilisateurDAO()
	{
		return new UtilisateurDaoJdbcImpl();
	}

}
