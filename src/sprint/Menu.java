package sprint;

import java.util.Scanner;

public class Menu {
	public static void menu() {
//		Contenedor sintenedor = new Contenedor();
		int opcion = 0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("_______________________________");
			System.out.println("_[1] Almacer Cliente___________");
			System.out.println("_[2] Almacenar Profesional_____");
			System.out.println("_[3] Almacenar Administrativo__");
			System.out.println("_[4] Almacenar Capacitacion____");
			System.out.println("_[5] Eliminar Usuario__________");
			System.out.println("_[6] Listar Usuarios___________");
			System.out.println("_[7] Listar Usuarios por tipo__");
			System.out.println("_[8] Listar Capacitaciones_____");
			System.out.println("_[9] Salir_____________________");
			System.out.println("_______________________________");
			try {
				opcion =  Integer.parseInt( scan.nextLine() );
				switch ( opcion ) {
				case 1:
					System.out.println("Falta funcion Cliente");
//					sintenedor.almacenarCliente();
					break;
				case 2:
					System.out.println("Falta funcion Profesional");
//					sintenedor.almacenarProfesional();
					break;
				case 3:
					System.out.println("Falta funcion  Admin");
//					sintenedor.almacenarAdministrativo();
					break;
				case 4:
					System.out.println("Falta funcion Capacitacion ");
//					sintenedor.almacenarCapacitacion();
					break;
				case 5:
					System.out.println("Falta funcion Eliminar User");
//					sintenedor.eliminarUsuario();
					break;
				case 6:
					System.out.println("Falta funcion Lista User");
//					sintenedor.listarUsuario();
					break;
				case 7:
					System.out.println("Falta funcion Lista por Tipo");
//					sintenedor.listarUsuarioTipo();
					break;
				case 8:
					System.out.println("Falta funcion Capaciitaciones");
//					sintenedor.listarCapacitacion();
					break;
				case 9:
					System.out.println("Adiosin");
					return;
				default:
					opcion = 2/0;
				}
			}catch ( Exception e ) {
				System.out.println("Opción inválida ÒwÓ");
			}
		} while (true);

	}
}
