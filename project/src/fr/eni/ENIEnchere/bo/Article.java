package fr.eni.ENIEnchere.bo;

import java.time.LocalDateTime;

public class Article {

	private int no_article;
	private String nom_article;
	private String description;
	private LocalDateTime date_debut_enchere;
	private LocalDateTime date_fin_enchere;
	private int prix_initial;
	private int prix_vente;
	private String etat_vente;
	private Utilisateur utilisateur;
	private Enchere enchere;
	private Categorie categorieArticle;
	private Retrait lieuRetrait;
	
	public int getNo_article() {
		return no_article;
	}
	
	public void setNo_article(int no_article) {
		this.no_article = no_article;
	}
	
	public String getNom_article() {
		return nom_article;
	}
	public void setNom_article(String nom_article) {
		this.nom_article = nom_article;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getDate_debut_enchere() {
		return date_debut_enchere;
	}
	public void setDate_debut_enchere(LocalDateTime date_debut_enchere) {
		this.date_debut_enchere = date_debut_enchere;
	}
	public LocalDateTime getDate_fin_enchere() {
		return date_fin_enchere;
	}
	public void setDate_fin_enchere(LocalDateTime date_fin_enchere) {
		this.date_fin_enchere = date_fin_enchere;
	}
	public int getPrix_initial() {
		return prix_initial;
	}
	public void setPrix_initial(int prix_initial) {
		this.prix_initial = prix_initial;
	}
	public int getPrix_vente() {
		return prix_vente;
	}
	public void setPrix_vente(int prix_vente) {
		this.prix_vente = prix_vente;
	}
	public String getEtat_vente() {
		return etat_vente;
	}
	public void setEtat_vente(String etat_vente) {
		this.etat_vente = etat_vente;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Enchere getEnchere() {
		return enchere;
	}
	public void setEnchere(Enchere enchere) {
		this.enchere = enchere;
	}
	public Categorie getCategorieArticle() {
		return categorieArticle;
	}
	public void setCategorieArticle(Categorie categorieArticle) {
		this.categorieArticle = categorieArticle;
	}
	public Retrait getLieuRetrait() {
		return lieuRetrait;
	}
	public void setLieuRetrait(Retrait lieuRetrait) {
		this.lieuRetrait = lieuRetrait;
	}
	
	
}
