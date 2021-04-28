/**
 * 
 */
package com.sic.sicTestBack.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author pedro
 *
 */

@Table
@Entity
public class Survey {
	
	@Id
	private Long id;
	@Column
	private Long documentNumber;
	@Column
	private String email;
	@Column
	private String comentarios;
	@Column
	private String pcFavoriteBrand;
	@Column
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
	
	
	public Survey() {
		super();
	}
	public Survey(Long id, Long documentNumber, String email, String comentarios, String pcFavoriteBrand,
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
