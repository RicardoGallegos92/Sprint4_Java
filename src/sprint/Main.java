package sprint;

public class Main {

	public static void main(String[] args) {

		Administrativo admin1 = new Administrativo(
				"Luis",
				"2000-08-14",
				18223214,
				"Servicios legales",
				"Varios"
				);
		Administrativo admin2 = new Administrativo(
				"Juan",
				"1992-04-11",
				18245789,
				"Comercial",
				"Mucha"
				);
		Administrativo admin3 = new Administrativo(
				"Carlos",
				"1992-12-12",
				30318824,
				"Innovación",
				"Poquita"
				);
		Administrativo admin4 = new Administrativo(
				"Jose",
				"1985-12-04",
				2582759,
				"Logística",
				"2 años viendo tutoriales"
				);
		Administrativo admin5 = new Administrativo(
				"Pablo",
				"1972-11-09",
				56646655,
				"Ventas",
				"Ninguna pero se ve buen cabro"
				);

		Listado lista = new Listado();
		lista.agregarElemento(admin1);
		lista.agregarElemento(admin2);
		lista.agregarElemento(admin3);
		lista.agregarElemento(admin4);
		lista.agregarElemento(admin5);
		lista.mostrarDatos();

	}

}