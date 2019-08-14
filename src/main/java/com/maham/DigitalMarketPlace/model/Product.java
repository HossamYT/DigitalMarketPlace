/**
 * 
 */
package com.maham.DigitalMarketPlace.model;

import java.io.Serializable;

/**
 * @author Hossam Tolba
 *
 */
public class Product implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int productID = 0 ;
	private int planID = 0 ;
	private String etisalat_account_number = null;

	
	public Product() {
		super();
	}


	public Product(int productID, int planID, String etisalat_account_number) {
		super();
		this.productID = productID;
		this.planID = planID;
		this.etisalat_account_number = etisalat_account_number;
	}


	public int getProductID() {
		return productID;
	}


	public void setProductID(int productID) {
		this.productID = productID;
	}


	public int getPlanID() {
		return planID;
	}


	public void setPlanID(int planID) {
		this.planID = planID;
	}


	public String getEtisalat_account_number() {
		return etisalat_account_number;
	}


	public void setEtisalat_account_number(String etisalat_account_number) {
		this.etisalat_account_number = etisalat_account_number;
	}

	
}
