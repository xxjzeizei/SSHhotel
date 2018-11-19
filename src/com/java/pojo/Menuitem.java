package com.java.pojo;
// Generated 2018-11-19 15:53:12 by Hibernate Tools 3.4.0.CR1

/**
 * Menuitem generated by hbm2java
 */
public class Menuitem implements java.io.Serializable {

	private Integer id;
	private Menu menu;
	private String itemName;
	private String urlLink;
	private Integer visible;
	private String descript;

	public Menuitem() {
	}

	public Menuitem(Menu menu, String itemName, String urlLink, Integer visible, String descript) {
		this.menu = menu;
		this.itemName = itemName;
		this.urlLink = urlLink;
		this.visible = visible;
		this.descript = descript;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getUrlLink() {
		return this.urlLink;
	}

	public void setUrlLink(String urlLink) {
		this.urlLink = urlLink;
	}

	public Integer getVisible() {
		return this.visible;
	}

	public void setVisible(Integer visible) {
		this.visible = visible;
	}

	public String getDescript() {
		return this.descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

}