package sprint;

import java.time.LocalDate;

public class Cliente extends Usuario {

	private int sistSalud;

	private String apellidos,
				telefono,
				afp,
				direccion,
				comuna;
	
	public Cliente(String nombres, LocalDate fechaNacimiento, int run,
			String apellidos, String telefono, String afp, int sistSalud,
			String direccion, String comuna) {
		super(nombres, fechaNacimiento, run);
		this.sistSalud = sistSalud;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.direccion = direccion;
		this.comuna = comuna;
	}

	public Cliente () {}

	public String obtenerNombre() {
		return super.getNombres() + " " + apellidos;
	}

	public String obtenerSistemaSalud() {
		switch (this.sistSalud) {
			case 1:
				return "Sistema Fonasa";
			case 2:
				return "Sistema Isapre";
		}
		return "";
	}
	
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println( "Direccion: " + getDireccion() + ", " + getComuna() );	
	}

	//---------------------------------------------------------------------------
	public int getSistSalud() {
		return sistSalud;
	}
	public void setSistSalud(int sistSalud) {
		this.sistSalud = sistSalud;
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
		return "Cliente:\n"
				+ "\nNombre: " + obtenerNombre()
				+ "\nRUN: " + super.getRun()
				+ "\nFecha Nacimiento: " + super.getFechaNacimiento()
				+ "\nEdad: " +	super.mostrarEdad()
				+ "\nSistSalud: " + obtenerSistemaSalud()
				+ "\nTelefono: " + telefono
				+ "\nAFP: " + afp
				+ "\nDireccion: " + direccion
				+ "\nComuna: " + comuna
				+ "\n_______________________________________";
	}

}
