package net.codejava.hibernate.domaine;

public class Product {

	private long productId;

	private String name;
	private String description;
	private float price;
	
	private ProductDetail productDetail;

	public Product() {
	}
	
	public long getProductId() {
		return productId;
	}

	public void setProductId(long id) {
		this.productId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public ProductDetail getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(ProductDetail detail) {
		this.productDetail = detail;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name
				+ ", description=" + description + ", price=" + price
				+ ", productDetail=" + productDetail + "]";
	}
}
