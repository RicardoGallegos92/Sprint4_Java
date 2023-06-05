package sprint;

import java.util.ArrayList;
import java.util.Scanner;

// Estos metodos deben retornar listas con los datos o 
//	equivalentes en HashMap para que ubicar el dato visiblemente

public class SolicitarDatos extends Validaciones{
	static String input = null;
	static int numero = 0;
	
	private void pedirTexto ( String solicitud ) {
		do {
			input = null;
			System.out.println(solicitud+":");
			input = new Scanner(System.in).nextLine().trim();
		} while ( true );
	}
	
	private void pedirNumero ( String solicitud ) {
		input = null;
		numero = 0;
		System.out.println(solicitud+":");
		try {
			input = new Scanner(System.in).nextLine().trim();
			numero =  Integer.parseInt( input );
		} catch ( Exception e ) {
			System.out.println("formato erróneo");
		}
	}
	
	public static ArrayList<Object> usuario() {
		ArrayList<Object> datos = new ArrayList<Object>(); 
		
		pedirTexto("Nombres");
		
// 1- nombres (obligatorio)
		do {
			input = null;
			System.out.println("Nombres: ");
			input = new Scanner(System.in).nextLine().trim();
		} while ( ! Validaciones.usuarioNombre( input ) );
		datos.add(input);
		
// 2 - fecha nacimiento DD/MM/YYYY (obligatorio)
		do {
			input = null;
			System.out.println("[DD/MM/AAAA] - Fecha Nacimiento:");
			input = new Scanner(System.in).nextLine().trim();
		} while ( ! Validaciones.usuarioFechaNacimiento(input) );
		datos.add(input);
		
// 3 - run
		do {
			input = null;
			numero = 0;
			System.out.println("RUN:");
			try {
				input = new Scanner(System.in).nextLine().trim();
				numero =  Integer.parseInt( input );
			} catch ( Exception e ) {
				System.out.println("formato erróneo");
			}
		} while ( ! Validaciones.usuarioRun(numero) );
		datos.add(numero);
		
		return datos;
	}
	
	public static IAsesoria cliente() {
		ArrayList<Object> datos = new ArrayList<Object>(); 
		Cliente cliente;
		datos = usuario();
// 4 - apellidos (obligatorio)
		do {
			input = null;
			System.out.println("Apellidos:");
			input = sc.nextLine();
		} while ( ! Validaciones.clienteApellidos(input) );
		datos.add(input);
		
// 5 - telefono (obligatorio)
		do {
			input = null;
			System.out.println("[56XXX XXX XXX] - Telefono:");
			input = sc.nextLine();
		} while ( ! Validaciones.clienteTelefono(input) );
		datos.add(input);
		
// 6 - afp [4,30] char
		do {
			input = null;
			System.out.println("AFP:");
			input = sc.nextLine();
		} while ( ! Validaciones.clienteAFP(input) );
		datos.add(input);
		
// 7 - sist salud 1, 2 (obligatorio)
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
		datos.add(numero);
		
// 8 - direccion
		do {
			input = null;
			System.out.println("Dirección:");
			input = sc.nextLine();
		} while ( ! Validaciones.clienteDireccion(input) );
		datos.add(input);
		
// 9 - comuna
		do {
			input = null;
			System.out.println("Comuna:");
			input = sc.nextLine();
		} while ( ! Validaciones.clienteComuna(input) );
		datos.add(input);
//		System.out.println(datos);
// edad - innecesaria => funcion que la calcula (obligatorio)

		cliente = new Cliente(
				datos.get(0).toString() ,
				datos.get(1).toString() ,
				Integer.parseInt(datos.get(2).toString()) ,
				datos.get(3).toString() ,
				datos.get(4).toString() ,
				datos.get(5).toString() ,
				Integer.parseInt(datos.get(6).toString()) ,
				datos.get(7).toString() ,
				datos.get(8).toString()
				);

		return cliente;
	}

	public static IAsesoria profesional() {
		ArrayList<Object> datos = new ArrayList<Object>();
		Profesional profesional; 
		datos = usuario();
// Titulo (obligatorio)
		do {
			input = null;
			System.out.println("");
			input = sc.nextLine();
		} while ( ! Validaciones.proTitulo(input) );
		
// fecha ingreso DD/MM/YYYY
		do {
			input = null;
			System.out.println("[DD/MM/AAAA] - Fecha de Ingreso:");
			input = sc.nextLine();
		} while ( ! Validaciones.proFechaIngreso(input) );
		datos.add(input);
		
		profesional = new Profesional(
				datos.get(0).toString(),
				datos.get(1).toString(),
				Integer.parseInt(datos.get(2).toString()) ,
				datos.get(3).toString(),
				datos.get(4).toString()
				);
		return profesional;
	}
	
	public static IAsesoria admin() {
		ArrayList<Object> datos = new ArrayList<Object>();
		datos = usuario();
		Administrativo admin;
// area (obligatorio)
		do {
			input = null;
			System.out.println("Area:");
			input = sc.nextLine();
		} while ( ! Validaciones.admArea(input) );
		datos.add(input);
		
// exp. previa
		do {
			input = null;
			System.out.println("Experiencia Previa:");
			input = sc.nextLine();
		} while ( ! Validaciones.admExperiencia(input) );
		datos.add(input);
		
		admin = new Administrativo(
								datos.get(0).toString() ,
								datos.get(1).toString() ,
								Integer.parseInt(datos.get(2).toString()) ,
								datos.get(3).toString() ,
								datos.get(4).toString()
							);
		return admin;
	}
	
	public static Capacitacion capacitacion() {
		ArrayList<Object> datos = new ArrayList<Object>();
		Capacitacion capa;
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
		datos.add(numero);
		
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
		datos.add(numero);
		
//	- Día: Debe ser un valor permitido entre “lunes” y “Domingo” (en ese formato)
		do {
			input = null;
			System.out.println("[Lunes ... Domingo] - Día:");
			input = sc.nextLine();
		} while ( ! Validaciones.capacitacionDia(input) );
		datos.add(input);
		
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

		capa = new Capacitacion (
				Integer.parseInt( datos.get(0).toString() ),
				Integer.parseInt( datos.get(1).toString() ),
				datos.get(2).toString(),
				datos.get(3).toString(),
				datos.get(4).toString(),
				Double.parseDouble( datos.get(5).toString() ),
				Integer.parseInt( datos.get(6).toString() )
				);

		return capa;
	}


}
