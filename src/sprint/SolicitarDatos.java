package sprint;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

// Estos metodos deben retornar listas con los datos o 
//	equivalentes en HashMap para que ubicar el dato visiblemente

public class SolicitarDatos extends Validaciones{
	private static LocalDate fecha;
	
	private static LocalTime pedirHora() {
		LocalTime hora;
		String input;
		
		do {
			input = pedirTexto("[HH:MM]\nHora"); 
		} while ( ! Validaciones.horaValida( input ) );
		
		hora = Validaciones.hora(input);
		return hora;
	}
	
	private static LocalDate pedirFecha(String pedir) {
		LocalDate fecha;
		String input;

		do {
			input = pedirTexto("[DD/MM/AAAA]\n"+pedir); 
		} while ( ! Validaciones.fechaValida( input ) );

		fecha = Validaciones.fecha(input);

		return fecha;
	}
	
	private static String pedirTexto ( String solicitud ) {
		String input;
		Scanner scan = new Scanner(System.in);
		do {
			input = null;
			System.out.println(solicitud+":");
			input = scan.nextLine().trim();
		} while ( input.length() == 0 );
//		scan.close();
		return input;
	}

	private static double pedirDoble (String solicitud) {
		String input = null;
		double numero = 0;
		boolean seguir = true;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println(solicitud+":");
			try {
				input = scan.nextLine().trim();
				numero =  Double.parseDouble( input );
				seguir = false;
			} catch ( Exception e ) {
				System.out.println("formato erróneo");
			}
		} while ( seguir );
//		scan.close();
		return numero;
	}

	private static int pedirNumero ( String solicitud ) {
		String input = null;
		int numero = 0;
		boolean seguir = true;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println(solicitud+":");
			try {
				input = scan.nextLine().trim();
				numero =  Integer.parseInt( input );
				seguir = false;
			} catch ( Exception e ) {
				System.out.println("formato erroneo");
			}
		} while ( seguir );
//		scan.close();
		return numero;
	}
	
	public static ArrayList<Object> usuario() {
		String input;
		int numero;
		ArrayList<Object> datos = new ArrayList<Object>();

// 1- nombres (obligatorio)
		do {
			input = pedirTexto("Nombres");
		} while ( ! Validaciones.usuarioNombre( input ) );
		datos.add(input);

// 2 - fecha nacimiento DD/MM/YYYY (obligatorio)
		
		fecha = pedirFecha("Fecha de Nacimiento");
		datos.add(fecha);
/*
		do {
			input = pedirTexto("[DD/MM/AAAA]\n- Fecha Nacimiento:");
		} while ( ! Validaciones.usuarioFechaNacimiento(input) );
		datos.add(input);
*/
		
// 3 - run
		do {
				numero =  pedirNumero("RUN");
		} while ( ! Validaciones.run(numero) );
		datos.add(numero);

		return datos;
	}
	
	public static Usuario cliente() {
		Cliente cliente;
		String input;
		int numero;
		ArrayList<Object> datos = new ArrayList<Object>(); 
		datos = usuario();
// 4 - apellidos (obligatorio)
		do {
			input = pedirTexto("Apellidos");
		} while ( ! Validaciones.clienteApellidos( input ) );
		datos.add(input);
		
// 5 - telefono (obligatorio)
		do {
			input = pedirTexto("[56XXX XXX XXX]\nTelefono");
		} while ( ! Validaciones.clienteTelefono( input ) );
		datos.add(input);
		
// 6 - afp [4,30] char
		do {
			input = pedirTexto("AFP");
		} while ( ! Validaciones.clienteAFP( input ) );
		datos.add(input);
		
// 7 - sist salud 1, 2 (obligatorio)
		do {
			numero =  pedirNumero("[1] Fonasa\n[2] Isapre\nSistema de Salud");
		} while ( ! Validaciones.clienteSistSalud(numero) );
		datos.add(numero);

// 8 - direccion
		do {
			input = pedirTexto("Direccion");
		} while ( ! Validaciones.clienteDireccion( input ) );
		datos.add(input);

// 9 - comuna
		do {
			input = pedirTexto("Comuna");
		} while ( ! Validaciones.clienteComuna( input ) );
		datos.add(input);

// edad - innecesaria => funcion que la calcula (obligatorio)

		cliente = new Cliente(
				datos.get(0).toString() ,
				fecha ,
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

	public static Usuario profesional() {
		Profesional profesional;
		String input;
		LocalDate fecha;
		ArrayList<Object> datos = new ArrayList<Object>();
		datos = usuario();
// 4 - Titulo (obligatorio)
		do {
			input = pedirTexto("Titulo");
		} while ( ! Validaciones.proTitulo( input ) );
		datos.add(input);

// 5 - fecha ingreso DD/MM/YYYY
		
		fecha = pedirFecha("Fecha de Ingreso");
/*
		do {
			input = pedirTexto("[DD/MM/AAAA]\\n- Fecha de Ingreso");
		} while ( ! Validaciones.proFechaIngreso( input ) );
		datos.add(input);
*/
		profesional = new Profesional(
				datos.get(0).toString(),
				fecha,
				Integer.parseInt(datos.get(2).toString()) ,
				datos.get(3).toString(),
				fecha
				);
		return profesional;
	}
	
	public static Usuario admin() {
		Administrativo admin;
		String input;
		ArrayList<Object> datos = new ArrayList<Object>();
		datos = usuario();
// 4 - area (obligatorio)
		do {
			input = pedirTexto("Area");
		} while ( ! Validaciones.admArea( input ) );
		datos.add(input);
		
// 5 - Exp. previa
		do {
			input = pedirTexto("Experiencia Previa");
		} while ( ! Validaciones.admExperiencia( input ) );
		datos.add(input);

		admin = new Administrativo(
								datos.get(0).toString() ,
								fecha ,
								Integer.parseInt(datos.get(2).toString()) ,
								datos.get(3).toString() ,
								datos.get(4).toString()
							);
		return admin;
	}
	
	public static Capacitacion capacitacion() {
		Capacitacion capa;
		LocalTime hora;
		String input;
		int numero;
		double duracion;
		ArrayList<Object> datos = new ArrayList<Object>();
		
//	1 - Identificador (numero): obligatorio
		do {
			numero =  pedirNumero("Identificador");
		} while ( ! Validaciones.capacitacionID(numero) );
		datos.add(numero);

		
//	2 - RUT cliente: obligatorio
		do {
			numero =  pedirNumero("RUT");
		} while ( ! Validaciones.run(numero) );
		datos.add(numero);
		
//	3 - Día: Debe ser un valor permitido entre “lunes” y “Domingo” (en ese formato)
		do {
			input = pedirTexto("[Lunes ... Domingo]\n- Día");
		} while ( ! Validaciones.capacitacionDia( input ) );
		datos.add(input);
		
//	4 - Hora: hora formato HH:MM (hora desde 0 a 23, minutos entre 0 y 59)
//		input = pedirTexto("[HH:MM]\n- Hora");
		hora = pedirHora();
		datos.add(hora);

//	5 - Lugar: obligatorio, 10-50
		do {
			input = pedirTexto("Lugar");
		} while ( ! Validaciones.capacitacionLugar( input ) );
		datos.add(input);
		
//	6 - Duración: 1-70  tiempo
		duracion = pedirDoble("[a,b] hrs.\nDuracion");
		datos.add(duracion);
		
//	7 - Cantidad de asistentes: obligatorio, 1-1000
		do {
			numero =  pedirNumero("Cantidad de Asistentes");
		} while ( ! Validaciones.capacitacionCantAsistentes(numero) );
		datos.add(numero);

		capa = new Capacitacion (
				Integer.parseInt( datos.get(0).toString() ),
				Integer.parseInt( datos.get(1).toString() ),
				datos.get(2).toString(),
				hora,
				datos.get(4).toString(),
				Double.parseDouble( datos.get(5).toString() ),
				Integer.parseInt( datos.get(6).toString() )
				);

		return capa;
	}

	public static Accidente accidente() {
		String input;
		int id, rutCliente, numero;
		String lugar, origen, consecuencias;
		LocalDate fechaAccidente;
		LocalTime hora;
		Accidente accident;
// ID
		do {
			numero =  pedirNumero("Identificador");
		} while ( ! Validaciones.capacitacionID(numero) );
		id = numero;
// rutCliente
		do {
			numero =  pedirNumero("RUT Cliente");
		} while ( ! Validaciones.run(numero) );
		rutCliente = numero;
// fechaAccidente
		fechaAccidente = pedirFecha("Fecha Accidente");
// horaAccidente
		hora = pedirHora();
// lugar
		do {
			input = pedirTexto("Lugar");
		} while ( ! Validaciones.accidenteLugar( input ) );
		lugar = input;
// origen
		do {
			input = pedirTexto("Origen");
		} while ( ! Validaciones.accidenteOrigen( input ) );
		origen = input;
// consecuencias
		do {
			input = pedirTexto("Consecuencias");
		} while ( ! Validaciones.accidenteConsecuencias( input ) );
		consecuencias = input;
		
		accident = new Accidente(
						id,
						rutCliente,
						fechaAccidente,
						hora,
						lugar,
						origen,
						consecuencias
						);
		
		return accident;		
	}
	
	public static VisitaTerreno visitaTerreno() {
		VisitaTerreno visita;
		int numero,idVisitaTerreno,run;
		String input,lugar,comentarios;
		LocalTime hora;
		LocalDate fechaAccidente;
		
//ID Cliente
		do {
			numero =  pedirNumero("RUN Cliente");
		} while ( ! Validaciones.run(numero) );
		run = numero;
//ID Visita Terreno
		do {
			numero =  pedirNumero("Identificador visita en terreno");
		} while ( ! Validaciones.visitaID(numero) );
		idVisitaTerreno = numero;
//Fecha Accidente
		
		fechaAccidente = pedirFecha("Fecha Accidente");
		
//Hora accidente
		hora = pedirHora();
		//lugar
		do {
			input = pedirTexto("Lugar");
		} while ( ! Validaciones.lugar(input) );
		lugar = input;
		//comentarios
		do {
			input = pedirTexto("Detalle");
		} while ( ! Validaciones.comentarios(input) );
		comentarios = input;
		
		visita = new VisitaTerreno(
				idVisitaTerreno,
				run,
				fechaAccidente,
				hora,
				lugar,
				comentarios
				);
				
		
		return visita;		
	}
	
	public static Revision revision() {
		Revision revision;
		int numero,idRevision,idVisitaTerreno,estadoRevision;
		String input,nombreRevision,detalle;

//	ID REVISION
		do {
			numero =  pedirNumero("Identificador de Revision");
		} while ( ! Validaciones.revisionID(numero) );
		idRevision = numero;
		
//id visita en terreno
		
		do {
			numero =  pedirNumero("Identificador visita en terreno");
		} while ( ! Validaciones.revisionID(numero) );
		idVisitaTerreno = numero;
		
//nombre min 10 max 50
		do {
			input = pedirTexto("Nombre Revision");
		} while ( ! Validaciones.nombreRevision(input) );
		nombreRevision = input;
		
//detalle para revisar 100 max
		
		do {
			input = pedirTexto("Detalle Revision");
		} while ( ! Validaciones.detalle(input) );
		detalle = input;
		
		//estado 1 sin problemas 2 con observaciones 3 no aprueba (booleano
		do {
			numero =  pedirNumero("[1] Sin problemas\n[2] Con Observaciones\n[3] No aprueba");
		} while ( ! Validaciones.estadoRevision(numero) );
		estadoRevision = numero;
		
		revision = new Revision (
				idRevision,
				idVisitaTerreno,
				estadoRevision,
				nombreRevision,
				detalle);
		
		return revision;
	}

}
