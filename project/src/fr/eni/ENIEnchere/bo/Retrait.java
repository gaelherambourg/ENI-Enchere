package fr.eni.ENIEnchere.bo;

public class Retrait {

	private Article article;
	private String rue;
	private String code_postal;
	private String ville;
	
	
	/**
	 * 
	 */
	public Retrait() {
	}
	
	/**
	 * @param rue
	 * @param code_postal
	 * @param ville
	 */
	public Retrait(String rue, String code_postal, String ville) {
		this.rue = rue;
		this.code_postal = code_postal;
		this.ville = ville;
	}

	/**
	 * @param article
	 * @param rue
	 * @param code_postal
	 * @param ville
	 */
	public Retrait(Article article, String rue, String code_postal, String ville) {
		this.article = article;
		this.rue = rue;
		this.code_postal = code_postal;
		this.ville = ville;
	}

	public Article getArticle() {
		return article;
	}
	
	public void setArticle(Article article) {
		this.article = article;
	}
	
	public String getRue() {
		return rue;
	}
	
	public void setRue(String rue) {
		this.rue = rue;
	}
	
	public String getCode_postal() {
		return code_postal;
	}
	
	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}
	
	public String getVille() {
		return ville;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	
	
}
