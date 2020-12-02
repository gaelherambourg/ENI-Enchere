package fr.eni.ENIEnchere.ihm;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.ENIEnchere.BusinessException;
import fr.eni.ENIEnchere.bll.UtilisateurManager;
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
		String password = request.getParameter("password");

		UtilisateurManager um = new UtilisateurManager();
		try {

			HttpSession session = request.getSession();
			session.setAttribute("utilisateur", um.recupereUtilisateur(login, password));
			response.sendRedirect(request.getContextPath());
		} catch (BusinessException e) {
			System.out.println("Erreur lors de la récupération de l'utilisateur");
			request.setAttribute("listeCodesErreur", e.getListeCodesErreur());
			redirect(request, response, VUE_CONNEXION_FORM);
		}

	}

	public void redirect(HttpServletRequest request, HttpServletResponse response, String vue)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(vue);
		rd.forward(request, response);
	}
}
