package com.objis.demowebservice.domaine;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DemandeFormation")
public class DemandeFormation {
	private String name=null;
	private String address=null;
	private String emailAddress=null;
	private String societe=null;
	private String theme=null;
	private String date=null;
	private String audit=null;
	private String remarque=null;
	
	
	public DemandeFormation(String name, String address, String emailAddress,
			String societe, String theme, String date, String audit,
			String remarque) {
		super();
		this.name = name;
		this.address = address;
		this.emailAddress = emailAddress;
		this.societe = societe;
		this.theme = theme;
		this.date = date;
		this.audit = audit;
		this.remarque = remarque;
	}
	
	public DemandeFormation() {
	}

	public String getRemarque() {
		return remarque;
	}
	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}

	public String getAudit() {
		return audit;
	}
	public void setAudit(String audit) {
		this.audit = audit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getSociete() {
		return societe;
	}
	public void setSociete(String societe) {
		this.societe = societe;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
