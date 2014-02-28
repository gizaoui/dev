package net.codejava.hibernate.domaine;

public class Article {
	
	private long id;
	private String title;
	private String description;
	private String keywords;
	private String content;
	
	
	private Famille famille;

		
	public Article() {
	}

	public Article(String title, String description, String keywords,
			String content, Famille famille) {
		this.title = title;
		this.description = description;
		this.keywords = keywords;
		this.content = content;
		this.famille = famille;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Famille getfamille() {
		return famille;
	}

	public void setfamille(Famille famille) {
		this.famille = famille;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", description="
				+ description + ", keywords=" + keywords + ", content="
				+ content + "]";
	}

}