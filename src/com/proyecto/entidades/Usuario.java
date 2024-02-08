package com.proyecto.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // indica que esta clase es una entidad
@Table(name = "usuario") // Especifica a la tabla a la cual hace referencia 
public class Usuario {
	
	@Id // se especifica que userID es el correspondiente id de la tabla
	@Column(name = "user_id") // se especifica cual es la columna a la cual hace referencia
	private int userID;
	@Column(name = "user_email")
	private String userEmail;
	@Column(name = "user_password")
	private String userPassword;
	
	// constructor sin parametros
	public Usuario() {
	}

	// constructor con parametros 
	public Usuario(String userEmail, String userPassword) {
		super();
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}

	// metodos get and set de las variables privadas
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	// metodo que permite imprimir los valores de la clase
	@Override
	public String toString() {
		return "Usuario [userID=" + userID + ", userEmail=" + userEmail + ", userPassword=" + userPassword + "]";
	}	
}
