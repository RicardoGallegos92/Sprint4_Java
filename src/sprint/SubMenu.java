package sprint;

import java.util.Scanner;

public class SubMenu {
	
	public static void subMenu(Contenedor cont) {
		int opcion = 0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("*******************************");
			System.out.println("*[1] Nuevo Cliente            *");
			System.out.println("*[2] Crear Capacitacion       *");
			System.out.println("*[3] Crear Accidente          *");
			System.out.println("*[4] Crear Visita a Terreno   *");
//			System.out.println("*                             *");
			System.out.println("*******************************");
			System.out.println("*[9] Salir                    *");
			System.out.println("*******************************");
			try {
				opcion =  Integer.parseInt( scan.nextLine() );
				switch ( opcion ) {
				case 1:
					cont.almacenarCliente();
					break;
				case 2:
					System.out.println("Crear Capacitación...");
					break;
				case 3:
					System.out.println("Crear Accidente...");
					break;
				case 4:
					System.out.println("Crear Visita a Terreno...");
					break;
				case 9:
					System.out.println("Adiosin ;D");
//					scan.close();
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
