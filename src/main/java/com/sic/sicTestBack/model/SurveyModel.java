/**
 * 
 */
package com.sic.sicTestBack.model;

import java.sql.Timestamp;


/**
 * @author pedro
 *
 */


public class SurveyModel {
	

	private Long id;
	private Long documentNumber;
	private String email;
	private String comentarios;
	private String pcFavoriteBrand;
	private Timestamp date;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(Long documentNumber) {
		this.documentNumber = documentNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public String getPcFavoriteBrand() {
		return pcFavoriteBrand;
	}
	public void setPcFavoriteBrand(String pcFavoriteBrand) {
		this.pcFavoriteBrand = pcFavoriteBrand;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	
	
	public SurveyModel() {
	}
	public SurveyModel(Long id, Long documentNumber, String email, String comentarios, String pcFavoriteBrand,
			Timestamp date) {
		super();
		this.id = id;
		this.documentNumber = documentNumber;
		this.email = email;
		this.comentarios = comentarios;
		this.pcFavoriteBrand = pcFavoriteBrand;
		this.date = date;
	}
	
	
	@Override
	public String toString() {
		return "Survey [id=" + id + ", documentNumber=" + documentNumber + ", email=" + email + ", comentarios="
				+ comentarios + ", pcFavoriteBrand=" + pcFavoriteBrand + ", date=" + date + "]";
	}
	
	
}
