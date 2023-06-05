package sprint;

public class Capacitacion {
	private String dia,		// [Lunes...Domingo]
				hora,  // HH:MM
				lugar // length [10-50] 
				;
	private int rutCliente, // validacion de rango
						identificador, // id propio de la empresa
						cantidadAsistentes; // [0-1000[

	private double duracion; // cantidad  en horas ( 2 / 1.5 )
	
	public Capacitacion() {}
	
	public Capacitacion( int identificador, int rutCliente,String dia,
			String hora, String lugar, double duracion, int cantidadAsistentes ) {
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.rutCliente = rutCliente;
		this.identificador = identificador;
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

	public int getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
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
				+ "\n dia: " + dia
				+ "\n hora=" + hora
				+ "\n lugar=" + lugar
				+ "\n rutCliente=" + rutCliente
				+ "\n identificador=" + identificador
				+ "\n cantidadAsistentes=" + cantidadAsistentes
				+ "\n duracion=" + duracion
				+ "\n----------------------------------------------------------------"
				;
	}

	

}
