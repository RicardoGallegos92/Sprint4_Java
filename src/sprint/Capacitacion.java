package sprint;

import java.time.LocalTime;

public class Capacitacion {
	private String dia,		// [Lunes...Domingo]
				lugar // length [10-50] 
				;
	
	private LocalTime hora;   // HH:MM
	
	private int rutCliente, // validacion de rango
						id, // id propio de la empresa
						cantidadAsistentes; // [0-1000[

	private double duracion; // cantidad  en horas ( 2 / 1.5 )
	
	public Capacitacion() {}
	
	public Capacitacion( int id, int rutCliente,String dia,
			LocalTime hora, String lugar, double duracion, int cantidadAsistentes ) {
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.rutCliente = rutCliente;
		this.id = id;
		this.cantidadAsistentes = cantidadAsistentes;
		this.duracion = duracion;
	}	

//___________Metodos______________________

	public Double duracionMinutos() {
		return getDuracion()*60;
	}

	public void mostrarDetalle() {
		System.out.println("La capacitación será en : "
				+ getLugar()+"\n"
				+ "a las : "+getHora()+"\n"
				+ "del día: "+getDia()+"\n"
				+ "y durará: "+duracionMinutos()+"minutos");
	}
//___________Getter & Setter_______________
	
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public int getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}
	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Capacitacion:"
				+ "\nDia: " + dia
				+ "\nHora: " + hora
				+ "\nLugar: " + lugar
				+ "\nRut Cliente: " + rutCliente
				+ "\nID: " + id
				+ "\nCantidad Asistentes: " + cantidadAsistentes
				+ "\nDuracion: " + duracion
				+ "\n_______________________________________"
				;
	}

	

}
