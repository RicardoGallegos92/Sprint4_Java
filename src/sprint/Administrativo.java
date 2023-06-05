package sprint;

import java.time.LocalDate;

public class Administrativo extends Usuario{
	
	private String area,
							experienciaPrevia;
	
	public Administrativo(String nombre, LocalDate fechaNacimiento, int run,
												String area, String experienciaPrevia) {
		super(nombre, fechaNacimiento, run);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

	public Administrativo(){};

//---------------------------------------------------------------------------
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}
	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}
//---------------------------------------------------------------------------
	
	@Override
	public String toString() {
		return "Administrativo:\n"
				+ super.toString()
				+ "\nArea: " + area
				+ "\nExperiencia Previa: " + experienciaPrevia
				+ "\n----------------------------------------------------------------";
	}	
	
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println( "Area: " + area
				+ "\nExperiencia Previa: " + experienciaPrevia );
	}

//----------------------------------------------------------------------------
	

}
