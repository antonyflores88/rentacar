package sv.edu.ufg.rcs.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reserva_vehiculo")
public class Vehiculo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String tipo_de_vehiculo;
	private String marca;
	private String modelo;
	private String color;
	private int year;
	private String transmision;
	private int capacidad_de_personas;
	private String full_extras;
	
	@Id
	private int codigo;
	
	// metodos getter and setters
	
	/**
	 * @return the tipo_de_vehiculo
	 */
	public String getTipo_de_vehiculo() {
		return tipo_de_vehiculo;
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @param tipo_de_vehiculo the tipo_de_vehiculo to set
	 */
	public void setTipo_de_vehiculo(String tipo_de_vehiculo) {
		this.tipo_de_vehiculo = tipo_de_vehiculo;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the molor
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param molor the molor to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the transmision
	 */
	public String getTransmision() {
		return transmision;
	}
	/**
	 * @param transmision the transmision to set
	 */
	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}
	/**
	 * @return the capacidad_de_personas
	 */
	public int getCapacidad_de_personas() {
		return capacidad_de_personas;
	}
	/**
	 * @param capacidad_de_personas the capacidad_de_personas to set
	 */
	public void setCapacidad_de_personas(int capacidad_de_personas) {
		this.capacidad_de_personas = capacidad_de_personas;
	}
	/**
	 * @return the full_extras
	 */
	public String getFull_extras() {
		return full_extras;
	}
	/**
	 * @param full_extras the full_extras to set
	 */
	public void setFull_extras(String full_extras) {
		this.full_extras = full_extras;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	@Override
	public String toString() {
		return "Vehiculo [tipo_de_vehiculo=" + tipo_de_vehiculo + ", marca=" + marca + ", modelo=" + modelo + ", color="
				+ color + ", year=" + year + ", transmision=" + transmision + ", capacidad_de_personas="
				+ capacidad_de_personas + ", full_extras=" + full_extras + ", codigo=" + codigo + "]";
	}

		
}
