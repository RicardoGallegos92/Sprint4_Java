package sprint;

import java.time.LocalDate;

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
		super.analizarUsuario();
		System.out.println("Titulo = " + getTitulo()
											+ "\nFecha Ingreso = " + getFechaIngreso());	
	}	
	
}