package sprint;

import java.util.Scanner;

// Estos metodos deben retornar listas con los datos o 
//	equivalentes en HashMap para que ubicar el dato visiblemente
public class SolicitarDatos {
	static Scanner sc = new Scanner(System.in);
	static String input = null;
	static int numero = 1;
	
	public static void usuario() {
// nombre (obligatorio)
		do {
			input = null;
			System.out.println("Nombres: ");
			input = sc.nextLine();
		} while ( ! Validaciones.usuarioNombre( input ) );
// fecha nacimiento DD/MM/YYYY (obligatorio)
		do {
			input = null;
			System.out.println("[DD/MM/AAAA] - Fecha Nacimiento:");
			input = sc.nextLine();
		} while ( ! Validaciones.usuarioFechaNacimiento(input) );
// run
		do {
			input = null;
			numero = 0;
			System.out.println("RUN:");
			try {
				input = sc.nextLine();
				numero =  Integer.parseInt( input );
			} catch ( Exception e ) {
				System.out.println("formato erróneo");
			}
		} while ( ! Validaciones.usuarioRun(numero) );
	}
	
	public static void cliente() {
		usuario();
// apellidos (obligatorio)
		do {
			input = null;
			System.out.println("Apellidos:");
			input = sc.nextLine();
		} while ( ! Validaciones.clienteApellidos(input) );
// telefono (obligatorio)
		do {
			input = null;
			System.out.println("[56XXX XXX XXX] - Telefono:");
			input = sc.nextLine();
		} while ( ! Validaciones.clienteTelefono(input) );
// afp [4,30] char
		do {
			input = null;
			System.out.println("AFP:");
			input = sc.nextLine();
		} while ( ! Validaciones.clienteAFP(input) );
// sist salud 1, 2 (obligatorio)
		do {
			input = null;
			numero = 0;
			System.out.println("1) Fonasa / 2) Isapre\nSistema de Salud:");
			try {
				input = sc.nextLine();
				numero =  Integer.parseInt( input );
			} catch ( Exception e ) {
				System.out.println("formato erróneo");
			}
		} while ( ! Validaciones.clienteSistSalud(numero) );
// direccion
		do {
			input = null;
			System.out.println("Dirección:");
			input = sc.nextLine();
		} while ( ! Validaciones.clienteDireccion(input) );
// comuna
		do {
			input = null;
			System.out.println("Comuna:");
			input = sc.nextLine();
		} while ( ! Validaciones.clienteComuna(input) );
// edad - innecesaria => funcion que la calcula (obligatorio)
	}

	public static void profesional() {
		usuario();
// Titulo (obligatorio)
		do {
			input = null;
			System.out.println("");
			input = sc.nextLine();
		} while ( ! Validaciones.proTitulo(input) );
// fecha ingreso DD/MM/YYYY
	}
	
	public static void admin() {
		usuario();
// area (obligatorio)
		input = null;
		do {
			System.out.println("Area:");
			input = sc.nextLine();
		} while ( ! Validaciones.admArea(input) );
// exp. previa
		input = null;
		do {
			System.out.println("Experiencia Previa:");
			input = sc.nextLine();
		} while ( ! Validaciones.admExperiencia(input) );
	}
	
	public static void capacitacion() {
		boolean valido = false;
//	- Identificador (numero): obligatorio
		do {
			input = null;
			numero = 0;
			System.out.println("Identificador:");
			try {
				input = sc.nextLine();
				numero =  Integer.parseInt( input );
				valido = true;
			} catch ( Exception e ) {
				System.out.println("formato erróneo");
			}
		} while ( ! valido );
//	- RUT cliente: obligatorio
		do {
			input = null;
			numero = 0;
			System.out.println("RUT:");
			try {
				input = sc.nextLine();
				numero =  Integer.parseInt( input );
			} catch ( Exception e ) {
				System.out.println("formato erróneo");
			}
		} while ( ! Validaciones.capacitacionRut(numero) );
//	- Día: Debe ser un valor permitido entre “lunes” y “Domingo” (en ese formato)
		do {
			input = null;
			System.out.println("[Lunes ... Domingo] - Día:");
			input = sc.nextLine();
		} while ( ! Validaciones.capacitacionDia(input) );
//	- Hora: hora formato HH:MM (hora desde 0 a 23, minutos entre 0 y 59)
		do {
			input = null;
			System.out.println("[HH:MM] - Hora:");
			input = sc.nextLine();
		} while ( ! Validaciones.capacitacionHora(input) );
//	- Lugar: obligatorio, 10-50
		do {
			input = null;
			System.out.println("Lugar:");
			input = sc.nextLine();
		} while ( ! Validaciones.capacitacionLugar(input) );
//	- Duración: 1-70
		do {
			input = null;
			System.out.println("Duración:");
			input = sc.nextLine();
		} while ( ! Validaciones.capacitacionDuracion(input) );
//	- Cantidad de asistentes: obligatorio, 1-1000
		do {
			input = null;
			numero = 0;
			System.out.println("Cantidad de Asistentes:");
			try {
				input = sc.nextLine();
				numero =  Integer.parseInt( input );
			} catch ( Exception e ) {
				System.out.println("formato erróneo");
			}
		} while ( ! Validaciones.capacitacionCantAsistentes(numero) );
		
	}

	
}
