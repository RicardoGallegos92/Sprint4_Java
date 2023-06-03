package sprint;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VisitaTerreno {

	private String idVisitaTerreno,
							dia, //formato fecha
							hora,
							lugar,
							comentarios;
	private int rut; 

	public VisitaTerreno(String idVisitaTerreno, int rut, String dia,
											String hora, String lugar, String comentarios) {
		this.idVisitaTerreno = idVisitaTerreno;
		setRut(rut);
		this.dia = dia;
//		this.hora = hora;
		setHora(hora);
//		this.lugar = lugar;
		setLugar(lugar);
//		this.comentarios = comentarios;
		setComentarios(comentarios);
	}

	public VisitaTerreno() {}

 	public String getIdVisitaTerreno() {
		return idVisitaTerreno;
	}
	public void setIdVisitaTerreno(String idVisitaTerreno) {
		this.idVisitaTerreno = idVisitaTerreno;
	}
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		if ( rut > 1000000 && rut < 99999999 ) {
			this.rut = rut;
		}
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getHora() {
//		System.out.println("Hour in HH:MM format = "+horaFormateada);
		return hora;
	}
	public void setHora(String hora) {
		SimpleDateFormat simpleformat = new SimpleDateFormat("HH:MM");
		String horaFormateada = simpleformat.format(hora);
		this.hora = horaFormateada;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		if ( lugar.length() > 10 && lugar.length() < 51) { 
			this.lugar = lugar;
		}
	}
	public String getComentarios() {
		if ( comentarios.length() < 101 ) {
			return comentarios;
		}
		return "";
	}
	public void setComentarios(String comentarios) {
		if ( comentarios.length() < 101 ) {
			this.comentarios = comentarios;
		}else {
			System.out.println("Comentario demasiado largo");
		}
	}

}
