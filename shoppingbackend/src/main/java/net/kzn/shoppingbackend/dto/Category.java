package net.kzn.shoppingbackend.dto;

public class Category {
	/*
	 * creating getter and sets
	 * 
	 */
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescripion() {
		return Descripion;
	}
	public void setDescripion(String descripion) {
		Descripion = descripion;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	private String name;
	private String Descripion;
	private String imageURL;
	

}
