package sprint;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

public class Accidente {

	private int id, rutCliente;
	private LocalDate fechaAccidente;
	private LocalTime horaAccidente;
	private String lugar;
	private String origen;
	private String consecuencias;
	
//Constructors
	
	public Accidente(int id, int rutCliente, LocalDate fechaAccidente,
			LocalTime horaAccidente, String lugar,
			String origen, String consecuencias) {
		this.id = id;
		this.rutCliente = rutCliente;
		this.fechaAccidente = fechaAccidente;
		this.horaAccidente = horaAccidente;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
	}
	
	public Accidente() {}

//______________Getter && Setter__________________

	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public int getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
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
//________________________________________________________
	@Override
	public String toString() {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/uuuu")
				.withResolverStyle(ResolverStyle.STRICT);
		return "Accidente:\n"
				+ "\nID Accidente: " + id
				+ "\nRun Cliente: " + rutCliente
				+ "\nFecha Accidente: " + fechaAccidente.format(f)
				+ "\nhora Accidente: "+ horaAccidente
				+ "\nLugar: " + lugar
				+ "\nOrigen: " + origen
				+ "\nConsecuencias: " + consecuencias
				+ "\n_______________________________________";
	}

	
	
}
