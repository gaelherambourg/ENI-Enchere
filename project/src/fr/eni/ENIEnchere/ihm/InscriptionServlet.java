package fr.eni.ENIEnchere.ihm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ENIEnchere.bll.BllException;
import fr.eni.ENIEnchere.bll.UtilisateurManager;
import fr.eni.ENIEnchere.bo.Utilisateur;

/**
 * Servlet implementation class InscriptionServlet
 */
@WebServlet("/inscription")
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public InscriptionServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UtilisateurManager um = new UtilisateurManager();
		Utilisateur utilisateur;
		List<String> listeErreur = new ArrayList<String>();
		
		
		String pseudo = request.getParameter("pseudo");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String rue = request.getParameter("rue");
		String code_postal = request.getParameter("code_postal");
		String ville = request.getParameter("ville");
		String password = request.getParameter("password");
		String confirm_password = request.getParameter("confirm_password");
		
		utilisateur = new Utilisateur(pseudo, nom, prenom, email, phone, rue, code_postal, ville, password, false);
		
		try {
			um.ajouterUtilisateur(utilisateur);
		} catch (BllException e) {
			e.printStackTrace();
			listeErreur.add(e.getMessage());
			request.setAttribute("listeErreur", listeErreur);
			RequestDispatcher rd = request.getRequestDispatcher("inscription.jsp");
			rd.forward(request, response);
		}
	}

}
