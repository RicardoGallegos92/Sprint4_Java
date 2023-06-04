package sprint;

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
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
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
		this.rut = rut;
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
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

}
