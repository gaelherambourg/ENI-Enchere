package fr.eni.ENIEnchere.ihm;

import java.io.IOException;
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
 * Servlet implementation class SupprimerCompteServlet
 */
@WebServlet("/supprimer")
public class SupprimerCompteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		Utilisateur u = (Utilisateur) session.getAttribute("utilisateur");
		UtilisateurManager um = new UtilisateurManager();
		try {
			um.supprimerUtilisateur(u.getNo_utilisateur());
			session.invalidate();
		} catch (BusinessException e) {
			e.printStackTrace();
		}

		response.sendRedirect(request.getContextPath());
	}

}
