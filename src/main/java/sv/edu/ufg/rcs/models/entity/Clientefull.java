package sv.edu.ufg.rcs.models.entity;

import java.io.Serializable;
import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Clientefull implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name = "Nombre_de_solicitante")
	private String nombreSolicitante;
	@Column(name = "Nacionalidad")
	private String nacionalidad;
	@Column(name = "Numero_de_contacto")
	private String telefono;
	@Column(name = "Tipo_de_documento_de_Identidad")
	private String tipoDocumento;
	@Column(name = "Nombre_de_una_referencia")
	private String referenciapersonal;
	@Column(name = "Contacto_de_una_referencia")
	private String numeroreferencia;
	@Column(name = "Fecha_de_Firma_de_Contrato")
	private LocalDate fechacontrato;
	@Column(name = "Plazo_pactado_de_pago")
	private String plazopago;
	@Column(name = "Monto_a_cancelar")
	private Integer monto;
	@Column(name = "Fecha_de_devolucion")
	private LocalDate devolucion;
	@Column(name = "Placa")
	private Integer placa;
	@Column(name = "Forma_de_Pago")
	private String formadepago;
	@Column(name = "Anticipo_de_pago")
	private Integer anticipo;
	@Column(name = "numero_doc")
	private String  numdoc;
	@Column(name = "correoelectronico")
	private String email;
	
	
	
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the nombreSolicitante
	 */
	public String getNombreSolicitante() {
		return nombreSolicitante;
	}
	/**
	 * @param nombreSolicitante the nombreSolicitante to set
	 */
	public void setNombreSolicitante(String nombreSolicitante) {
		this.nombreSolicitante = nombreSolicitante;
	}
	/**
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}
	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
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
	 * @return the tipoDocumento
	 */
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	/**
	 * @param tipoDocumento the tipoDocumento to set
	 */
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	/**
	 * @return the referenciapersonal
	 */
	public String getReferenciapersonal() {
		return referenciapersonal;
	}
	/**
	 * @param referenciapersonal the referenciapersonal to set
	 */
	public void setReferenciapersonal(String referenciapersonal) {
		this.referenciapersonal = referenciapersonal;
	}
	/**
	 * @return the numeroreferencia
	 */
	public String getNumeroreferencia() {
		return numeroreferencia;
	}
	/**
	 * @param numeroreferencia the numeroreferencia to set
	 */
	public void setNumeroreferencia(String numeroreferencia) {
		this.numeroreferencia = numeroreferencia;
	}
	/**
	 * @return the fechacontrato
	 */
	public LocalDate getFechacontrato() {
		return fechacontrato;
	}
	/**
	 * @param fechacontrato the fechacontrato to set
	 */
	public void setFechacontrato(LocalDate fechacontrato) {
		this.fechacontrato = fechacontrato;
	}
	/**
	 * @return the plazopago
	 */
	public String getPlazopago() {
		return plazopago;
	}
	/**
	 * @param plazopago the plazopago to set
	 */
	public void setPlazopago(String plazopago) {
		this.plazopago = plazopago;
	}
	/**
	 * @return the monto
	 */
	public Integer getMonto() {
		return monto;
	}
	/**
	 * @param monto the monto to set
	 */
	public void setMonto(Integer monto) {
		this.monto = monto;
	}
	/**
	 * @return the devolucion
	 */
	public LocalDate getDevolucion() {
		return devolucion;
	}
	/**
	 * @param devolucion the devolucion to set
	 */
	public void setDevolucion(LocalDate devolucion) {
		this.devolucion = devolucion;
	}
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
	 * @return the formadepago
	 */
	public String getFormadepago() {
		return formadepago;
	}
	/**
	 * @param formadepago the formadepago to set
	 */
	public void setFormadepago(String formadepago) {
		this.formadepago = formadepago;
	}
	/**
	 * @return the anticipo
	 */
	public Integer getAnticipo() {
		return anticipo;
	}
	/**
	 * @param anticipo the anticipo to set
	 */
	public void setAnticipo(Integer anticipo) {
		this.anticipo = anticipo;
	}
	/**
	 * @return the numdoc
	 */
	public String getNumdoc() {
		return numdoc;
	}
	/**
	 * @param numdoc the numdoc to set
	 */
	public void setNumdoc(String numdoc) {
		this.numdoc = numdoc;
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
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Clientefull [nombreSolicitante=" + nombreSolicitante + ", nacionalidad=" + nacionalidad + ", telefono="
				+ telefono + ", tipoDocumento=" + tipoDocumento + ", referenciapersonal=" + referenciapersonal
				+ ", numeroreferencia=" + numeroreferencia + ", fechacontrato=" + fechacontrato + ", plazopago="
				+ plazopago + ", monto=" + monto + ", devolucion=" + devolucion + ", placa=" + placa + ", formadepago="
				+ formadepago + ", anticipo=" + anticipo + ", numdoc=" + numdoc + ", email=" + email + "]";
	}
	
	
	
}
