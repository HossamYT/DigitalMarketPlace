/**
 * 
 */
package com.maham.DigitalMarketPlace.model;

import java.io.Serializable;

/**
 * @author Hossam Tolba
 *
 */
public class Account implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String etisalat_account_number = null;
	private String email = null;
	private long contact_number = 0;
	private int planID = 0;
	
	public Account() {
		super();
	}

	public Account(String etisalat_account_number, String email, long contact_number, int planID) {
		super();
		this.etisalat_account_number = etisalat_account_number;
		this.email = email;
		this.contact_number = contact_number;
		this.planID = planID;
	}

	public String getEtisalat_account_number() {
		return etisalat_account_number;
	}

	public void setEtisalat_account_number(String etisalat_account_number) {
		this.etisalat_account_number = etisalat_account_number;
	}


	public long getContact_number() {
		return contact_number;
	}

	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}

	public int getPlanID() {
		return planID;
	}

	public void setPlanID(int planID) {
		this.planID = planID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
		
}
