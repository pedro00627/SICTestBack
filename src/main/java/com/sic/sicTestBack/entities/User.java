package com.sic.sicTestBack.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author pedro
 *
 */

@Table
@Entity
public class User {
	
	@Id
    @Column(name="ID", nullable = false, updatable = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String username;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private int attempts;
	@Column(nullable = false)
	private boolean status;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAttempts() {
		return attempts;
	}
	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	public User() {
	}
	
	public User(Long id, String name, String username, String password, int attempts, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.attempts = attempts;
		this.status = status;
	}
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", attempts="
				+ attempts + ", status=" + status + "]";
	}
	
	
	

	
}
