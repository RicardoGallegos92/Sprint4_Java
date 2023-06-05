package sprint;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.ArrayList;

public class VisitaTerreno {
	private ArrayList<Revision> revisiones;

	private String lugar,
							comentarios;
	private int id, rut;
	
	private LocalDate dia;
	private LocalTime hora;	

	public VisitaTerreno(int id, int rut, LocalDate dia,
			LocalTime hora, String lugar, String comentarios) {
		this.id = id;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
		this.revisiones = new ArrayList<Revision>();
	}

	public VisitaTerreno() {}

 	public int getid() {
		return id;
	}
	public void setid(int id) {
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

//____________________________________________________
	
	public void crearRevision() {
		this.revisiones.add(SolicitarDatos.revision());
	}
	
	@Override
	public String toString() {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/uuuu")
				.withResolverStyle(ResolverStyle.STRICT);
		return "VisitaTerreno:"
				+ "\nID :" + id
				+ "\nLugar: " + lugar
				+ "\nComentarios: " + comentarios
				+ "\nRUT: " + rut
				+ "\nDia=" + dia.format(f)
				+ "\nHora=" + hora
				+ "\n_______________________________________";
	}

	
}
