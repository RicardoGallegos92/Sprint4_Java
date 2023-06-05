package sprint;

import java.time.LocalDate;
import java.time.LocalTime;

public class Accidente {

	private int id;
	private LocalDate fechaAccidente;
	private LocalTime horaAccidente;
	private String lugar;
	private String origen;
	private String consecuencias;
	
	//Constructors
	
	public Accidente(int id,LocalDate fechaAccidente,LocalTime horaAccidente,
			String lugar,String origen,String consecuencias ) {
		this.id = id;
		this.fechaAccidente = fechaAccidente;
		this.horaAccidente = horaAccidente;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
		
	}
	
	public Accidente() {}


	//Getter && Setter
	
	
	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public LocalDate getFechaAccidente() {
		return fechaAccidente;
	}

	public void setFechaAccidente(LocalDate fechaAccidente) {
		this.fechaAccidente = fechaAccidente;
	}

	public LocalTime getHoraAccidente() {
		return horaAccidente;
	}

	public void setHoraAccidente(LocalTime horaAccidente) {
		this.horaAccidente = horaAccidente;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getConsecuencias() {
		return consecuencias;
	}
	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}

	@Override
	public String toString() {
		return "Accidente:\n"
				+ "\nID Accidente: " + id
				+ "\nFecha Accidente: " + fechaAccidente
				+ "\nhora Accidente: "+ horaAccidente
				+ "\nLugar: " + lugar
				+ "\nOrigen: " + origen
				+ "\nConsecuencias: " + consecuencias
				+ "\n_______________________________________";
	}

	
	
}
