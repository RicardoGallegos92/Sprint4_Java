package sprint;

import java.time.LocalDate;
import java.time.Period;

public class Usuario implements IAsesoria{

	private String nombre,
							fechaNacimiento;
	private int run;
	
	public Usuario(String nombre, String fechaNacimiento, int run) {
		this.nombre = nombre;
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
	public String getNombre() {
		return nombre;	
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		System.out.println("Nombre: "+this.nombre);
	}

	@Override
	public String toString() {
		return "Usuario:\nNombre: " + nombre
					+ "\nFechaNacimiento: "	+ fechaNacimiento
					+ "\nRun: " + run
//					+"\n----------------------------------------------------------------"
					;
	}

}
