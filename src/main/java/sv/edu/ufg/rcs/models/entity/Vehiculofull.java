package sv.edu.ufg.rcs.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class Vehiculofull {
	
	@Id
	@Column(name = "Placa")
	private Integer placa;
	
	@Column(name = "tipo")
	private String tipo_de_vehiculo;
	@Column(name = "Disponibilidad")
	private boolean disponibilidad;
	private String Marca;
	private String Modelo;
	private String Color;
	private Integer year;
	@Column(name = "Km_inicial")
	private Integer kmInicial;
	@Column(name = "Km_final")
	private Integer kmFinal;
	@Column(name = "Transmision")
	private String transmision;
	@Column(name = "Capacidad_de_Personas")
	private Integer capacidadPersonas;
	@Column(name = "Full_Extras")
	private String full;
	@Column(name = "Combustible")
	private String combustion;
	@Column(name = "Implementos_de_seguridad")
	private Integer seguridad;
	@Column(name = "Estado")
	private String estado;
	@Column(name = "Empresa_Aseguradora")
	private String aseguradora;
	/**
	 * @return the placa
	 */
	public Integer getPlaca() {
		return placa;
	}
	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(Integer placa) {
		this.placa = placa;
	}
	/**
	 * @return the tipo_de_vehiculo
	 */
	public String getTipo_de_vehiculo() {
		return tipo_de_vehiculo;
	}
	/**
	 * @param tipo_de_vehiculo the tipo_de_vehiculo to set
	 */
	public void setTipo_de_vehiculo(String tipo_de_vehiculo) {
		this.tipo_de_vehiculo = tipo_de_vehiculo;
	}
	/**
	 * @return the disponibilidad
	 */
	public boolean isDisponibilidad() {
		return disponibilidad;
	}
	/**
	 * @param disponibilidad the disponibilidad to set
	 */
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return Marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		Marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return Modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return Color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		Color = color;
	}
	/**
	 * @return the year
	 */
	public Integer getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(Integer year) {
		this.year = year;
	}
	/**
	 * @return the kmInicial
	 */
	public Integer getKmInicial() {
		return kmInicial;
	}
	/**
	 * @param kmInicial the kmInicial to set
	 */
	public void setKmInicial(Integer kmInicial) {
		this.kmInicial = kmInicial;
	}
	/**
	 * @return the kmFinal
	 */
	public Integer getKmFinal() {
		return kmFinal;
	}
	/**
	 * @param kmFinal the kmFinal to set
	 */
	public void setKmFinal(Integer kmFinal) {
		this.kmFinal = kmFinal;
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
	 * @return the capacidadPersonas
	 */
	public Integer getCapacidadPersonas() {
		return capacidadPersonas;
	}
	/**
	 * @param capacidadPersonas the capacidadPersonas to set
	 */
	public void setCapacidadPersonas(Integer capacidadPersonas) {
		this.capacidadPersonas = capacidadPersonas;
	}
	/**
	 * @return the full
	 */
	public String getFull() {
		return full;
	}
	/**
	 * @param full the full to set
	 */
	public void setFull(String full) {
		this.full = full;
	}
	/**
	 * @return the combustion
	 */
	public String getCombustion() {
		return combustion;
	}
	/**
	 * @param combustion the combustion to set
	 */
	public void setCombustion(String combustion) {
		this.combustion = combustion;
	}
	/**
	 * @return the seguridad
	 */
	public Integer getSeguridad() {
		return seguridad;
	}
	/**
	 * @param seguridad the seguridad to set
	 */
	public void setSeguridad(Integer seguridad) {
		this.seguridad = seguridad;
	}
	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	/**
	 * @return the aseguradora
	 */
	public String getAseguradora() {
		return aseguradora;
	}
	/**
	 * @param aseguradora the aseguradora to set
	 */
	public void setAseguradora(String aseguradora) {
		this.aseguradora = aseguradora;
	}
	@Override
	public String toString() {
		return "Vehiculofull [placa=" + placa + ", tipo_de_vehiculo=" + tipo_de_vehiculo + ", disponibilidad="
				+ disponibilidad + ", Marca=" + Marca + ", Modelo=" + Modelo + ", Color=" + Color + ", year=" + year
				+ ", kmInicial=" + kmInicial + ", kmFinal=" + kmFinal + ", transmision=" + transmision
				+ ", capacidadPersonas=" + capacidadPersonas + ", full=" + full + ", combustion=" + combustion
				+ ", seguridad=" + seguridad + ", estado=" + estado + ", aseguradora=" + aseguradora + "]";
	}
	
	

}
