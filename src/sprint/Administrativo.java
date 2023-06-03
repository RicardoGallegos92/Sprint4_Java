package sprint;

public class Administrativo extends Usuario{
	
	private String area,
							experienciaPrevia;
	
	public Administrativo(String nombre, String fechaNacimiento, int run, String area, String experienciaPrevia) {
		super(nombre, fechaNacimiento, run);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

	public Administrativo(){};
	
//-------------------------------------Validaciones--------	
	public class validacionArea{
		public static boolean validarArea(String area) {
			if (area.isEmpty()) {
				return false;
			}
			if (area.length() <5 || area.length() >20) {
				return false;
			}

			return true;
		}
		
		public static boolean validarExperiencia(String experienciaPrevia) {
			if(experienciaPrevia.isEmpty()) {
				return false;
			}
			if (experienciaPrevia.length() >100) {
				return false;
			}
			return true;
		}
	}
	
	
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
		return "\nAdministrativo \nArea: " + area
				+ "\nExperienciaPrevia: " + experienciaPrevia
				+"\n----------------------------------------------------------------";
	}	
	
	@Override
	public void analizarUsuario() {
		System.out.println(super.toString() + this.toString());
	}

//----------------------------------------------------------------------------
	

}
