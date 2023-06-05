package sprint;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class VisitaTerreno {
	private ArrayList<Revision> revisiones;

	private String id,
							lugar,
							comentarios;
	private int rut;
	
	private LocalDate dia;
	private LocalTime hora;	

	public VisitaTerreno(String id, int rut, LocalDate dia,
			LocalTime hora, String lugar, String comentarios) {
		this.id = id;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
		this.revisiones = new ArrayList<Revision>();
	}

	public VisitaTerreno() {}

 	public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id = id;
	}
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	public LocalDate getDia() {
		return dia;
	}
	public void setDia(LocalDate dia) {
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
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "VisitaTerreno:"
				+ "\nID :" + id
				+ "\nLugar: " + lugar
				+ "\nComentarios: " + comentarios
				+ "\nRUT: " + rut
				+ "\nDia=" + dia
				+ "\nHora=" + hora
				+ "\n_______________________________________";
	}

	
	
}
