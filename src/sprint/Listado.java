package sprint;

import java.util.ArrayList;

public class Listado{
	
	ArrayList<Administrativo> listado;
		
	public Listado(ArrayList<Administrativo> listado) {
		this.listado = listado;
	}
	public Listado(){
		this.listado = new ArrayList<Administrativo>();
	}
	
	public ArrayList<Administrativo> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Administrativo> listado) {
		this.listado = listado;
	}
	

	public void agregarElemento(Administrativo nuevo ) {
		this.listado.add(nuevo);
	}

	public void mostrarDatos() {
		for ( Administrativo registro : this.listado) {
			registro.analizarUsuario();
		}
	}
	
}
