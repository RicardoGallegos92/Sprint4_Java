package sprint;

public class Capacitacion {
	private String identificador,	// id propio de la empresa
				rutCliente, // validacion de rango
				dia,		// [Lunes...Domingo]
				hora,  // HH:MM
				lugar // length [10-50] 
				;
	private int cantidadAsistentes; // [0-1000[

	private double duracion; // cantidad  en horas ( 2 / 1.5 )
	
	public Capacitacion() {}

	public Capacitacion(String identificador, String rutCliente, String dia,
			String hora, String lugar, Double duracion, int cantidadAsistentes) {
		this.identificador = identificador;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}

	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public Double getDuracion() {
		return duracion;
	}
	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}
	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}
	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

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


}
