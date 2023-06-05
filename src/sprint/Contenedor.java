package sprint;

import java.util.ArrayList;
import java.util.Scanner;

public class Contenedor extends SolicitarDatos{
	private ArrayList<IAsesoria> asesorias;
	private ArrayList<Capacitacion> capacitaciones;

	public Contenedor() {
		this.asesorias = new ArrayList<IAsesoria>();
		this.capacitaciones = new ArrayList<Capacitacion>();
	}
	
// funciona
	public void almacenarCliente () {
		asesorias.add( super.cliente() );
	}
// funciona	
	public void almacenarProfesional () {
		asesorias.add( super.profesional() );
	}
// funciona
	public void almacenarAdministrativo () {
		asesorias.add(super.admin());
	}
// funciona
	public void almacenarCapacitacion () {
		capacitaciones.add(super.capacitacion());
	}
// NO funca 
	public void eliminaUsuario () {
		int run;
		do {
			try {
				run = Integer.parseInt( new Scanner(System.in).nextLine() );
				break;
			} catch ( Exception e ) {
				System.out.println(e);
				System.out.println("opción inválida");
			}			
		} while ( true );
		
		for ( IAsesoria individuo : asesorias ) {
			if ( individuo.getRun() == run ) {
				System.out.println( "Borranding" );
				break;
			}
		}
	}
// funciona
	public void listarUsuarios () {
		for ( IAsesoria individuo : asesorias ) {
			System.out.println( individuo.toString() );
		}
	}
// NO funca
	public void listarUsuariosTipo () {
		boolean seguir = true;
		String txt;
		do {
			System.out.println("[1] Clientes");
			System.out.println("[2] Profesionales");
			System.out.println("[3] Administrativos");
			System.out.println("Seleccione tipo a mostrar:");
			try {
				switch ( Integer.parseInt( new Scanner(System.in).toString() ) ) {
					case 1:
						txt = "Cliente";
						break;
					case 2:
						txt = "Profesional";
						break;
					case 3:
						txt = "Administrativo";
						break;
					default:
						continue;
				}
				for ( IAsesoria individuo : asesorias ) {
// mostrar según filtro seleccionado
					if ( individuo.getClass().toString().contains(txt) ) {
						System.out.println( individuo.toString() );
					}
				}
				seguir = false;
			} catch( Exception e ) {
				System.out.println("-_-ª");
			}
		} while ( seguir );
	}
// debería funcar
	public void listarCapacitacion () {
		for ( Capacitacion capacitacion : capacitaciones ) {
			System.out.println( capacitacion );
		}
	}

}
