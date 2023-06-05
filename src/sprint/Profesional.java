package sprint;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

public class Profesional extends Usuario{

	private String titulo;

	private LocalDate fechaIngreso;

	public Profesional(String nombre, LocalDate fechaNacimiento, int run, 
			String titulo, LocalDate fechaIngreso) {
		super(nombre, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	public Profesional() {}
	
//------------------------------Validaciones--------
//--------------------------------------------------

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Profesional:\n"
				+ super.toString()
				+ "\nTitulo: " + titulo
				+ "\nFechaIngreso: " + fechaIngreso
				+ "\n----------------------------------------------------------------"
				;
	}
	
	@Override
	public void analizarUsuario() {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/uuuu")
				.withResolverStyle(ResolverStyle.STRICT);
		super.analizarUsuario();
		System.out.println("Titulo: " + getTitulo()
									+ "\nFecha Ingreso: " + getFechaIngreso().format(f));	
	}	
	
}