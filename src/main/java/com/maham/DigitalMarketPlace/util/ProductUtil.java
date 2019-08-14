/**
 * 
 */
package com.maham.DigitalMarketPlace.util;

import java.io.Serializable;

/**
 * @author Hossam Tolba
 *
 */
public class ProductUtil implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private int productID = 0 ;
	private String etisalat_account_number = null;
	
	public ProductUtil() {
		super();
	}

	public ProductUtil(int productID, String etisalat_account_number) {
		super();
		this.productID = productID;
		this.etisalat_account_number = etisalat_account_number;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getEtisalat_account_number() {
		return etisalat_account_number;
	}

	public void setEtisalat_account_number(String etisalat_account_number) {
		this.etisalat_account_number = etisalat_account_number;
	}
	
}
