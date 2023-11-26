package sv.edu.ufg.rcs.models.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pago_alquiler")
public class Pagos {
	
	@Id
	@Column(name="numero_de_documento")
	private String dui;
	
	@Column(name="Forma_de_Pago")
	private String formaPago;
	
	@Column(name="Anticipo")
	private Integer pagoAnticipado;
	
	@Column(name="fecha_cancelacion")
	private LocalDate fechaCancelacion;
	
	@Column(name="cancelado")
	private Boolean cancelacion;
	
	@Column(name="monto_total")
	private Integer montoTotal;

	/**
	 * @return the dui
	 */
	public String getDui() {
		return dui;
	}

	/**
	 * @param dui the dui to set
	 */
	public void setDui(String dui) {
		this.dui = dui;
	}

	/**
	 * @return the formaPago
	 */
	public String getFormaPago() {
		return formaPago;
	}

	/**
	 * @param formaPago the formaPago to set
	 */
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	/**
	 * @return the pagoAnticipado
	 */
	public Integer getPagoAnticipado() {
		return pagoAnticipado;
	}

	/**
	 * @param pagoAnticipado the pagoAnticipado to set
	 */
	public void setPagoAnticipado(Integer pagoAnticipado) {
		this.pagoAnticipado = pagoAnticipado;
	}

	/**
	 * @return the fechaCancelacion
	 */
	public LocalDate getFechaCancelacion() {
		return fechaCancelacion;
	}

	/**
	 * @param fechaCancelacion the fechaCancelacion to set
	 */
	public void setFechaCancelacion(LocalDate fechaCancelacion) {
		this.fechaCancelacion = fechaCancelacion;
	}

	/**
	 * @return the cancelacion
	 */
	public Boolean getCancelacion() {
		return cancelacion;
	}

	/**
	 * @param cancelacion the cancelacion to set
	 */
	public void setCancelacion(Boolean cancelacion) {
		this.cancelacion = cancelacion;
	}

	/**
	 * @return the montoTotal
	 */
	public Integer getMontoTotal() {
		return montoTotal;
	}

	/**
	 * @param montoTotal the montoTotal to set
	 */
	public void setMontoTotal(Integer montoTotal) {
		this.montoTotal = montoTotal;
	}

	@Override
	public String toString() {
		return "Pagos [dui=" + dui + ", formaPago=" + formaPago + ", pagoAnticipado=" + pagoAnticipado
				+ ", fechaCancelacion=" + fechaCancelacion + ", cancelacion=" + cancelacion + ", montoTotal="
				+ montoTotal + "]";
	}
	
	
}
