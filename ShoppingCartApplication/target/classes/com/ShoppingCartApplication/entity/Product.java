package com.ShoppingCartApplication.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.internal.util.Cloneable;

@Entity
@Table(name = "products", schema = "product")
@NamedQueries({
	@NamedQuery(name="getAllProducts" ,query="Select p from Product p")
})
public class Product extends Cloneable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_identifier")
	private Integer productIndentifier;

	@Basic(optional = false)
	@Column(name = "product_name")
	private String productName;

	@Basic(optional = false)
	@Column(name = "price")
	private BigDecimal price;

	@Basic(optional = false)
	@Column(name = "created_by")
	private Integer createdBy;

	@Basic(optional = false)
	@Column(name = "created_date")
	private Date createdDate;

	@Basic(optional = false)
	@Column(name = "last_modified_by")
	private Integer lastModifiedBy;

	@Basic(optional = false)
	@Column(name = "last_modified_date")
	private Date lastmodifieddate;

	public Integer getProductIndentifier() {
		return productIndentifier;
	}

	public void setProductIndentifier(Integer productIndentifier) {
		this.productIndentifier = productIndentifier;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = (Date) (createdDate!=null ? createdDate.clone():null);
	}

	public Integer getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(Integer lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Date getLastmodifieddate() {
		return lastmodifieddate;
	}

	public void setLastmodifieddate(Date lastmodifieddate) {
		this.lastmodifieddate = (Date) (lastmodifieddate!=null ? lastmodifieddate.clone() :null) ;
	}

}
