package com.ShoppingCartApplication.entity;

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
@Table(name="purchase_details", schema ="ecomm")
@NamedQueries({
	@NamedQuery(name="getAllPurchaseDetails" ,query="Select p from PurchaseDetails p")
})
public class PurchaseDetails extends Cloneable{
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer purchaseDetailIdentifier;
	
	@Basic(optional = false)
	@Column(name = "user_email_identifier")
	private String userEmailIdentifier;
	
	@Basic(optional = false)
	@Column(name = "bill_number")
	private Integer billNumber;
	
	@Basic(optional = false)
	@Column(name = "status")
	private String status;
	
	@Basic(optional = false)
	@Column(name = "bank_name")
	private String bankName;
	
	@Basic(optional = false)
	@Column(name = "created_date")
	private Date createdDate;
	
	@Basic(optional = false)
	@Column(name = "created_by")
	private Integer createdBy;
	
	@Basic(optional = false)
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;
	
	@Basic(optional = false)
	@Column(name = "last_modified_by")
	private Integer lastModifiedBy;

	public Integer getPurchaseDetailIdentifier() {
		return purchaseDetailIdentifier;
	}

	public void setPurchaseDetailIdentifier(Integer purchaseDetailIdentifier) {
		this.purchaseDetailIdentifier = purchaseDetailIdentifier;
	}

	public String getUserEmailIdentifier() {
		return userEmailIdentifier;
	}

	public void setUserEmailIdentifier(String userEmailIdentifier) {
		this.userEmailIdentifier = userEmailIdentifier;
	}

	public Integer getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(Integer billNumber) {
		this.billNumber = billNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = (Date) (createdDate!=null ? createdDate.clone():null);
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = (Date) (lastModifiedDate!=null ? lastModifiedDate.clone():null) ;
	}

	public Integer getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(Integer lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

}
