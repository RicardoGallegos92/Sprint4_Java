package sprint;

public class Cliente extends Usuario {

	private int rut,
		sistSalud,
		edad;

	private String nombres,
				apellidos,
				telefono,
				afp,
				direccion,
				comuna;

	public Cliente(String nombre, String fechaNacimiento, int run, int rut, int sistSalud, int edad, String nombres,
			String apellidos, String telefono, String afp, String direccion, String comuna) {
		super(nombre, fechaNacimiento, run);
		this.rut = rut;
		this.sistSalud = sistSalud;
		this.edad = edad;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.direccion = direccion;
		this.comuna = comuna;
	}

	public Cliente () {}

	public String obtenerNombre() {
		return nombres + " " + apellidos;
	}

	public String obtenerSistemaSalud() {
		switch (this.sistSalud) {
			case 1:
				return "Sistema Fonasa";
			case 2:
				return "Sistema Isapre";
			default:
				return "Registro inválido";
		}
	}
//---------------------------------------------------------------------------
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	public int getSistSalud() {
		return sistSalud;
	}
	public void setSistSalud(int sistSalud) {
		this.sistSalud = sistSalud;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getAfp() {
		return afp;
	}
	public void setAfp(String afp) {
		this.afp = afp;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
//---------------------------------------------------------------------------
	@Override
	public String toString() {
		return "Cliente:\nRut: " + rut
				+ "\nSistSalud: " + sistSalud
				+ "\nEdad: " +	edad
				+ "\nNombres: " + nombres
				+ "\nApellidos: " + apellidos
				+ "\nTelefono: " + telefono
				+ "\nAFP: " + afp
				+ "\nDireccion: " + direccion
				+ "\nComuna: " + comuna
				+"\n----------------------------------------------------------------";
	}
	
	@Override
	public void analizarUsuario() {
		System.out.println(super.toString()
				+ this.toString());
	}

}
