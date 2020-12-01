package fr.eni.ENIEnchere.ihm;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DeconnexionServlet
 */
@WebServlet("/deconnexion")
public class DeconnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		try {
			session.invalidate();
			request.getRequestDispatcher("/WEB-INF/jsp/accueille.jsp").forward(request, response);
			System.out.println("Deconnexion réussie");
		} catch (Exception e) {
			System.out.println("Erreur destruction session");
		}
	}

}
