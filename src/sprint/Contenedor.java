package sprint;

import java.util.ArrayList;
import java.util.Scanner;

public class Contenedor extends SolicitarDatos{
	private ArrayList<Usuario> asesorias;
	private ArrayList<Capacitacion> capacitaciones;
	private ArrayList<Accidente> accidentes;
	private ArrayList<VisitaTerreno> visitas;

	public Contenedor() {
		this.asesorias = new ArrayList<Usuario>();
		this.capacitaciones = new ArrayList<Capacitacion>();
		this.accidentes = new ArrayList<Accidente>();
		this.visitas = new ArrayList<VisitaTerreno>();
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
// funciona 
	public void eliminaUsuario () {
		int run;
		do {
			System.out.println("Ingrese el Rut a eliminar:");
			try {
				run = Integer.parseInt( new Scanner(System.in).nextLine() );
				break;
			} catch ( Exception e ) {
				System.out.println(e);
				System.out.println("opción inválida");
			}			
		} while ( true );
		
		for ( int i = 0; i < asesorias.size(); ++i ) {
			if ( asesorias.get(i).getRun() == run ) {
				System.out.println( "Borranding" );
				asesorias.remove(i);				
				break;
			}
		}
	}
// funciona
	public void listarUsuarios () {
		for ( Usuario individuo : asesorias ) {
			System.out.println( individuo.toString() );
		}
	}
// funciona
	public void listarUsuariosTipo () {
		boolean seguir = true;
		String txt;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("[1] Clientes");
			System.out.println("[2] Profesionales");
			System.out.println("[3] Administrativos");
			System.out.println("Seleccione tipo a mostrar:");
			try {
				txt = scan.nextLine();
				switch ( Integer.parseInt( txt ) ) {
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
				System.out.println( e );
			}
		} while ( seguir );
	}
// debería funcar
	public void listarCapacitacion () {
		for ( Capacitacion capacitacion : capacitaciones ) {
			System.out.println( capacitacion );
		}
	}

	public void crearAccidente () {
//	Agregar Metodo
		this.accidentes.add(super.accidente());
	}
	
	public void crearVisitaTerreno () {
//	Agregar Metodos
		this.visitas.add(super.visitaTerreno());
	}
	
	
}
