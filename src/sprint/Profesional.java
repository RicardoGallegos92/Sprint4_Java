package sprint;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
	
public class validarProfesional{
	public static boolean validarTitulo(String titulo) {
		if(titulo.isEmpty()) {
			return false;
		}
		if(titulo.length() <10 || titulo.length() >50) {
			return false;
		}
		return true;
	}
	public static boolean validarFechaIngreso(String fechaIngreso) {
		if (fechaIngreso.isEmpty()) {
			return false;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		sdf.setLenient(false);
		
		try {
			Date date = sdf.parse(fechaIngreso);
			return true;
		} catch (ParseException e) {
			return false;
		}
	}
}
	
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
		return "Profesional:\nTitulo: " + titulo
				+ "\nFechaIngreso: " + fechaIngreso
				+"\n----------------------------------------------------------------";
	}
	
	@Override
	public void analizarUsuario() {
		System.out.println(super.toString()
				+ this.toString());
	}	
	
}