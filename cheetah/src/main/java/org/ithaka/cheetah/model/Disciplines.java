package org.ithaka.cheetah.model;
// Generated May 11, 2010 3:57:17 PM by Hibernate Tools 3.2.4.GA

import java.util.Date;



public class Disciplines implements java.io.Serializable{

	private String id;
	private String catName;
	private Date catDateModified;
	private String catNegotiator;
	private String catLtmCode;
	private Integer vstamp;	
	private String negotiatorsValue;
	private String topDisciplineValue;
	

	public Integer getVstamp() { return this.vstamp; }
	public void setVstamp(Integer vstamp ) { this.vstamp = vstamp; }  

	public Disciplines() {
	}





	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCatName() {
		return this.catName;
	}

	public void setCatName(String catName) {
		this.catName = catName.trim();
	}


	public String getCatLtmCode() {
		return catLtmCode;
	} 
	public void setCatLtmCode(String catLtmCode) {
		this.catLtmCode = catLtmCode.trim();
	}



	public Date getCatDateModified() {
		return this.catDateModified;
	}

	public void setCatDateModified(Date catDateModified) {
		this.catDateModified = catDateModified;
	}
	
	public String getNegotiatorsValue() {
		return negotiatorsValue;
	}
	public void setNegotiatorsValue(String negotiatorsValue) {
		this.negotiatorsValue = negotiatorsValue;
	}
	

	public String getTopDisciplineValue() {
		return topDisciplineValue;
	}
	public void setTopDisciplineValue(String tdValue) {
		this.topDisciplineValue = tdValue;
	}


}
