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
	
	public Cliente(String nombre, String fechaNacimiento, int run, int rut, 
			int sistSalud, int edad, String nombres, String apellidos, 
			String telefono, String afp, String direccion, String comuna) {
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
		if (rut < 99999999 && rut > 1000000) {
			this.rut = rut;
		} else {
			throw new IllegalArgumentException("Ingrese el R.U.T. sin puntos ni"
					+ " dígito verificador");
		}
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
		if (edad >= 0 && edad < 150) {
			this.edad = edad;
		} else {
			throw new IllegalArgumentException("Ingrese su edad correctamente");
		}
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		if (nombres.length() > 5 && nombres.length() < 30) {
			this.nombres = nombres;
		} else {
			throw new IllegalArgumentException("Los nombres del usuario no"
					+ " deben poseer menos de 5 y más de 30 carácteres.");
		}
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		if (apellidos.length() > 5 && apellidos.length() < 30) {
			this.apellidos = apellidos;
		} else {
			throw new IllegalArgumentException("Los apellidos del usuario no "
					+ "deben poseer menos de 5 y más de 30 carácteres.");
		}
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		if (telefono.length() == 11 && telefono.startsWith("56")) {
	        this.telefono = telefono;
	    } else {
	        throw new IllegalArgumentException("El número de teléfono debe "
	        		+ "tener 11 caracteres y comenzar con el código país Chile "
	        		+ "56.");
	    }
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
		if (direccion.length() < 70) {
			this.direccion = direccion;
		} else {
			throw new IllegalArgumentException("El domicilio no debe poseer más"
					+ " de 70 caracteres.");
		}
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		if (comuna.length() < 50) {
			this.comuna = comuna;
		} else {
			throw new IllegalArgumentException("La comuna no debe poseer más de"
					+ " 50 caracteres.");
		}
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
