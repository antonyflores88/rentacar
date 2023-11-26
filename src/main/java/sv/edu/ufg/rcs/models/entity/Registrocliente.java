package sv.edu.ufg.rcs.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "preregisto_de_cliente")
public class Registrocliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	private String numerodedui;
	private String nombrecliente;
	private String telefono;
	private String email;
	private String tipodedocumento;
	private int codigovehiculo;

	// METODOS getter and setters

	/**
	 * @return the nombrecliente
	 */
	public String getNombrecliente() {
		return nombrecliente;
	}

	/**
	 * @return the codigovehiculo
	 */
	public int getCodigovehiculo() {
		return codigovehiculo;
	}

	/**
	 * @param codigovehiculo the codigovehiculo to set
	 */
	public void setCodigovehiculo(int codigovehiculo) {
		this.codigovehiculo = codigovehiculo;
	}

	/**
	 * @param nombrecliente the nombrecliente to set
	 */
	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the tipodedocumento
	 */
	public String getTipodedocumento() {
		return tipodedocumento;
	}

	/**
	 * @param tipodedocumento the tipodedocumento to set
	 */
	public void setTipodedocumento(String tipodedocumento) {
		this.tipodedocumento = tipodedocumento;
	}

	/**
	 * @return the numerodedui
	 */
	public String getNumerodedui() {
		return numerodedui;
	}

	/**
	 * @param numerodedui the numerodedui to set
	 */
	public void setNumerodedui(String numerodedui) {
		this.numerodedui = numerodedui;
	}

	@Override
	public String toString() {
		return "Registrocliente [numerodedui=" + numerodedui + ", nombrecliente=" + nombrecliente + ", telefono="
				+ telefono + ", email=" + email + ", tipodedocumento=" + tipodedocumento + ", codigovehiculo="
				+ codigovehiculo + "]";
	}

}
