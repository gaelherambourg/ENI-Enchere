package fr.eni.ENIEnchere.dal;

import java.util.List;

import fr.eni.ENIEnchere.BusinessException;
import fr.eni.ENIEnchere.bo.Utilisateur;

public interface UtilisateurDao {

	void add(Utilisateur utilisateur) throws BusinessException;
	List<String> selectPseudo() throws BusinessException;
	List<String> selectEmail();
	Utilisateur selectByLogin(String login, String password) throws BusinessException;
	Utilisateur selectByPseudo(String pseudo) throws BusinessException;
}
