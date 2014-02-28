package net.codejava.hibernate.domaine;

import java.util.Set;

public class Famille {

	private long id;
	private String name;
	
	
	private Set<Article> articles;

	
	public Famille() {
	}

	public Famille(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Article> getArticles() {
		return articles;
	}

	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}
	
	

	@Override
	public String toString() {
		return "Famille [id=" + id + ", name=" + name + "]";
	}

}