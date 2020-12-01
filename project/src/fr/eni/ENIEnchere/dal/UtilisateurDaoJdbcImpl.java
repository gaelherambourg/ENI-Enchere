package fr.eni.ENIEnchere.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UtilisateurDaoJdbcImpl implements UtilisateurDao {

	private static final String SELECT_BY_LOGIN = "SELECT no_utilisateur FROM UTILISATEURS WHERE pseudo = ? AND mot_de_passe = ?";

	@Override
	public void selectByLogin(String login, String password) {
		try (Connection cnx = ConnectionProvider.getConnection();
				PreparedStatement pstmt = cnx.prepareStatement(SELECT_BY_LOGIN)) {
			pstmt.setString(1, login);
			pstmt.setString(2, password);
			System.out.println(login);
			System.out.println(password);
			ResultSet rs = pstmt.executeQuery();
			boolean loginOk = rs.next();
			if (loginOk) {
				System.out.println("Connexion réussie");
			} else {
				System.out.println("Login inexistant");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
