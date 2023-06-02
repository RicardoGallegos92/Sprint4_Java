package sprint;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.lang.IllegalArgumentException;

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
		if (nombre.length() > 10 && nombre.length() < 50) {
			this.nombre = nombre;
		} else {
			throw new IllegalArgumentException("El nombre del usuario no debe "
					+ "poseer menos de 10 y más de 50 carácteres.");
		}
	}
	public String getFechaNacimiento() {
		LocalDate fechaNacimientoLocalDate = LocalDate.parse(fechaNacimiento);
        return fechaNacimientoLocalDate.format(DateTimeFormatter.ofPattern("dd/"
        		+ "MM/yyyy"));
    }
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		if (run < 99999999 && run > 1000000) {
			this.run = run;
		} else {
			throw new IllegalArgumentException("Ingrese el R.U.N. sin puntos ni"
					+ " dígito verificador");
		}
			
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
