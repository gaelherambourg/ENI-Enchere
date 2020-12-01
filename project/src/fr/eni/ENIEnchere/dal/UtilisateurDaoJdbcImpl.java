package fr.eni.ENIEnchere.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UtilisateurDaoJdbcImpl {

	private static final String SELECT_BY_LOGIN = "SELECT no_utilisateur FROM UTILISATEURS WHERE pseudo = ? AND mot_de_passe = ?";

	public void selectByLogin(String login, String password) throws SQLException {
		try (Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement pstmt = cnx.prepareStatement(SELECT_BY_LOGIN)) {
			pstmt.setString(1, login);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			boolean loginOk = rs.next();
			if(loginOk) {
				String motDePasse = rs.getString(2);
				if (password.trim().toUpperCase().equals(motDePasse.toUpperCase())) {
					System.out.println("Connexion réussie");
				} else {
					System.out.println("Identifiant ou mot de passe invalide");
				}
			}
		}
	}

}
