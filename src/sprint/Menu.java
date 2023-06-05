package sprint;

import java.util.Scanner;

public class Menu {
	public static void menu() {
		Contenedor sintenedor = new Contenedor();
		int opcion = 0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("*******************************");
			System.out.println("*[1] Almacenar Cliente        *");
			System.out.println("*[2] Almacenar Profesional    *");
			System.out.println("*[3] Almacenar Administrativo *");
			System.out.println("*[4] Almacenar Capacitacion   *");
			System.out.println("*[5] Eliminar Usuario         *");
			System.out.println("*[6] Listar Usuarios          *");
			System.out.println("*[7] Listar Usuarios por tipo *");
			System.out.println("*[8] Listar Capacitaciones    *");
			System.out.println("*[9] Salir                    *");
			System.out.println("*******************************");
			try {
				opcion =  Integer.parseInt( scan.nextLine() );
				switch ( opcion ) {
				case 1:
					SubMenu.subMenu(sintenedor);
//					sintenedor.almacenarCliente();
//					System.out.println( sintenedor.toString() );
					break;
				case 2:
					sintenedor.almacenarProfesional();
					break;
				case 3:
					sintenedor.almacenarAdministrativo();
					break;
				case 4:
					sintenedor.almacenarCapacitacion();
					break;
				case 5:
					sintenedor.eliminaUsuario();
					break;
				case 6:
					sintenedor.listarUsuarios();
					break;
				case 7:
					sintenedor.listarUsuariosTipo();
					break;
				case 8:
					sintenedor.listarCapacitacion();
					break;
				case 9:
					System.out.println("Adiosin ;D");
					scan.close();
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
