package sprint;

import java.time.LocalDate;

public class Usuario implements IAsesoria{

	private String nombres;
	private LocalDate fechaNacimiento;
	private int run;
	
	public Usuario(String nombres, LocalDate fechaNacimiento, int run) {
		this.nombres = nombres;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}
	
	public Usuario() {}
//______________Setter y Getter_______________
	public String getNombres() {
		return nombres;	
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
    }
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
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
		System.out.println("Nombres: " + this.nombres + "\nRun: " + this.run);
	}
	
	public String mostrarEdad() {
		return 
				( LocalDate.now().getYear() - getFechaNacimiento().getYear() )
				+ " años";
	}

	@Override
	public String toString() {
		return "Nombres: " + nombres
					+ "\nFechaNacimiento: " + fechaNacimiento
					+ "\nRun: " + run
					+ "\n_______________________________________";
	}

}
