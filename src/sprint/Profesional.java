package sprint;


public class Profesional extends Usuario{

	private String titulo,
							fechaIngreso;

	public Profesional(String nombre, String fechaNacimiento, int run, 
			String titulo, String fechaIngreso) {
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
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
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
		System.out.println(super.toString()
				+ this.toString());
	}	
	
}