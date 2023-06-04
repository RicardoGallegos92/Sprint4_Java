package sprint;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.ResolverStyle;

public class Validaciones {

//________________Booleanos_____________________
// Validacion general por longitud si cumple los parametros ]min , max[
	// min será 0 si el campo es obligatorio, 1 si no lo es.
	public static boolean largoValido(String texto, int largoMinimo, int largoMaximo) {
		texto = texto.trim();
		if ( texto.length() > largoMinimo-1 && texto.length() < largoMaximo+1 ) {
			return true;
		}
		return false;
	}

// Podemos agregar funcion para validar con DV
	public static boolean rutValido(int rut) {
		if ( rut > 1000000 && rut < 100000000 ) {
			return true;
		}
		return false;		
	}
	
	public static boolean horaValida(String hora) {
		try {
			DateTimeFormatter format = DateTimeFormatter.ISO_TIME;
			LocalTime horaParseada = LocalTime.parse(hora, format);
			System.out.println(horaParseada);
			return true;
		} catch ( Exception e ) {
			return false;
		}
	}
	
	public static boolean fechaValida(String fecha) {
		try {
			DateTimeFormatter f = DateTimeFormatter
					.ofPattern("dd/MM/uuuu")
					.withResolverStyle(ResolverStyle.STRICT);
	        LocalDate d = LocalDate.parse(fecha, f);
	        System.out.println(d.format(f));
	        return true;
		} catch ( Exception e ) {
			System.out.println("No sea payaso");
			return false;
		}
	}
	
//_________________Usuario______________________
	public static boolean usuarioNombre(String nombre) {
		return largoValido(nombre, 10,  50);
	}

	public static boolean usuarioFechaNacimiento(String fechaNacimiento) {
		fechaNacimiento = fechaNacimiento.trim();
		return fechaValida(fechaNacimiento);
    }

	public static boolean usuarioRun(int run) {
		return rutValido( run );
	}

//_______________Administrativo_________________
	public static boolean admExperiencia(String experienciaPrevia) {
		return largoValido( experienciaPrevia, 0, 100 );
	}
	
	public static boolean admArea(String area) {
		return largoValido( area, 5, 20 );
	}
	
//_________________Profesional__________________
	
	public static boolean proTitulo(String titulo) {
		return largoValido(titulo, 10, 50);
	}
	
	public static boolean proFechaIngreso(String fechaIngreso) {
		return fechaValida(fechaIngreso);
	}

//_________________Cliente______________________
	
	public static boolean clienteComuna(String comuna) {
		return largoValido(comuna, 0, 50);
	}
	
	public static boolean clienteDireccion(String direccion) {
		return largoValido( direccion, 0, 70 );
	}
	
	public static boolean clienteTelefono(String telefono) {
		if (telefono.startsWith("56")) {
			return largoValido( telefono, 11, 11 );
		}
		return false;
	}
	
	public static boolean clienteAFP(String afp) {
		return largoValido(afp, 4, 30);
	}
	
	public static boolean clienteSistSalud (int sistema) {
		if ( sistema == 1 || sistema == 2 ){
			return true;
		}
		return false;
	}
	
	public static boolean clienteApellidos(String apellidos) {
		return largoValido( apellidos, 5, 30);
	}
	
	public static boolean clienteNombres(String nombres) {
		return largoValido( nombres, 5, 30 );
	}
	
	public static boolean clienteEdad(int edad) {
		if (edad >= 18 && edad < 150) {
			return true;
		}
		return false;
	}
	
	public static boolean  clienteRut(int rut) {
		return rutValido(rut);
	}
	
//_______________VisitaTerreno________________
	
	public static boolean visitaTerrenoComentarios(String comentarios) {
		return largoValido( comentarios, 0, 100 );
	}
	
	public static boolean visitaTerrenoLugar(String lugar) {
		return largoValido( lugar, 10, 50);
	}
	
	public void visitaTerrenoHora(String hora) {
		if ( horaValida(hora) ) {
			System.out.println("Hora válida");
		}
	}
	
	public static boolean visitaTerrenoRut(int rutCliente) {
		return rutValido(rutCliente);
	}
	
//________________Capacitacion________________

	public static boolean capacitacionRut(int rut){
		return rutValido( rut );
	}
	
	public static boolean capacitacionDia(String texto){
		String[] dias = { "Lunes", "Martes", "Miercoles",
				"Jueves", "Viernes", "Sabado", "Domingo" };
		for ( String dia : dias ) {
			if ( dia.equals(texto) ) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean capacitacionHora(String hora){
		hora = hora.trim();
		return horaValida(hora);
	}
	
	public static boolean capacitacionLugar(String lugar){
		return largoValido(lugar, 10, 50);
	}
	
	public static boolean capacitacionDuracion(String duracion){
		return largoValido(duracion, 1, 70);
	}
	
	public static boolean capacitacionCantAsistentes(int asistentes){
		if ( asistentes > 0 && asistentes < 1001 ) {
			return true;
		}
		return false;
	}

}
