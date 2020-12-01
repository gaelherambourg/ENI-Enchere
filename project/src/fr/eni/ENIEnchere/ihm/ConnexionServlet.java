package fr.eni.ENIEnchere.ihm;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.ENIEnchere.bll.UtilisateurManager;
import fr.eni.ENIEnchere.bo.Connexion;
import fr.eni.ENIEnchere.bo.Utilisateur;

/**
 * Servlet implementation class Connexion
 */
@WebServlet("/connexion")
public class ConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VUE_ACCUEIL = "/WEB-INF/jsp/accueille.jsp";
	private static final String VUE_CONNEXION_FORM = "/WEB-INF/jsp/connexion.jsp";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		redirect(request, response, VUE_CONNEXION_FORM);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("pseudo");
		String mp = request.getParameter("password");

		UtilisateurManager um = new UtilisateurManager();
		um.validerLogin(login, mp);
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setLogin(login);
		utilisateur.setMotDePasse(mp);
		
//		HttpSession session = request.getSession();
//		session.setAttribute("utilisateur", utilisateur);
		redirect(request, response, VUE_ACCUEIL);
	}

	public void redirect(HttpServletRequest request, HttpServletResponse response, String vue)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(vue);
		rd.forward(request, response);
	}
}
