package sprint;

import java.time.LocalDate;
import java.time.Period;

public class Usuario implements IAsesoria{

	private String nombres,
							fechaNacimiento;
	private int run;
	
	public Usuario(String nombres, String fechaNacimiento, int run) {
		this.nombres = nombres;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}
	
	public Usuario() {}
// Setter y Getter
	public String mostrarEdad() {
		LocalDate nacimiento = LocalDate.parse(fechaNacimiento);
		Period tiempoTranscurrido = Period.between(nacimiento, LocalDate.now());
		return tiempoTranscurrido.getYears() + " años";
	}
	public String getNombres() {
		return nombres;	
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
    }
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;			
	}
//---------------------------------------------------------------------------
	@Override
	public void analizarUsuario() {
		System.out.println("Nombres: "+this.nombres);
	}

	@Override
	public String toString() {
		return "Nombres: " + nombres
					+ "\nFechaNacimiento: "	+ fechaNacimiento
					+ "\nRun: " + run
//					+"\n----------------------------------------------------------------"
					;
	}

}
