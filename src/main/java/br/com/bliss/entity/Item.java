package br.com.bliss.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the produto database table.
 * 
 */
@Entity
@Table(name = "item")
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", unique = true, nullable = false, table="item")
	private int id;

	public Item() {
	}

	@Column(name = "CREATE_DATE")
	private String dateCreate;

	@Column(name = "UPDATE_DATE")
	private String dateUpdate;

	@Column(length = 100)
	private String name;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "BRAND")
	private String brand;

	@Column(name = "CATEGORY")
	private String category;

	@Column(name = "URL")
	private String url;

	@Column(name = "PRICE", nullable = false, length = 45)
	private String price;

	@Column(name = "COST", length = 45)
	private String cost;

	@Column(name = "SKU", length = 45)
	private String sku;

	@Column(name = "THUMBNAIL", length = 255)
	private String thumbnail;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	

	public String getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(String dateCreate) {
		this.dateCreate = dateCreate;
	}

	public String getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(String dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		result = prime * result + ((dateCreate == null) ? 0 : dateCreate.hashCode());
		result = prime * result + ((dateUpdate == null) ? 0 : dateUpdate.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((sku == null) ? 0 : sku.hashCode());
		result = prime * result + ((thumbnail == null) ? 0 : thumbnail.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		if (dateCreate == null) {
			if (other.dateCreate != null)
				return false;
		} else if (!dateCreate.equals(other.dateCreate))
			return false;
		if (dateUpdate == null) {
			if (other.dateUpdate != null)
				return false;
		} else if (!dateUpdate.equals(other.dateUpdate))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (sku == null) {
			if (other.sku != null)
				return false;
		} else if (!sku.equals(other.sku))
			return false;
		if (thumbnail == null) {
			if (other.thumbnail != null)
				return false;
		} else if (!thumbnail.equals(other.thumbnail))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}


	
}