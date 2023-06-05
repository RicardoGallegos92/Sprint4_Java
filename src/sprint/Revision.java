package sprint;

public class Revision {
	int estado,
			id,
			idVisitaTerreno;
	String nombreRevision, detalleRevision;
	
	
	
	public Revision( int id, int idVisitaTerreno, int estado,
			String nombreRevision, String detalleRevision ) {
		super();
		this.estado = estado;
		this.id = id;
		this.idVisitaTerreno = idVisitaTerreno;
		this.nombreRevision = nombreRevision;
		this.detalleRevision = detalleRevision;
	}
	
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdVisitaTerreno() {
		return idVisitaTerreno;
	}
	public void setIdVisitaTerreno(int idVisitaTerreno) {
		this.idVisitaTerreno = idVisitaTerreno;
	}
	public String getNombreRevision() {
		return nombreRevision;
	}
	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}
	public String getDetalleRevision() {
		return detalleRevision;
	}
	public void setDetalleRevision(String detalleRevision) {
		this.detalleRevision = detalleRevision;
	}

	private String estadoTexto() {
		switch (this.getEstado()) {
		case 1:
			return "Sin Problemas";
		case 2:
			return "Con Observaciones";
		case 3:
			return "No Aprueba";
		}
		return "Este texto no es visible";
	}
	
	@Override
	public String toString() {
		return "Revision:"
				+ "\nEstado: " + estadoTexto()
				+ "\nID: " + id
				+ "\nID Visita Terreno: " + idVisitaTerreno
				+ "\nNombre Revision: " + nombreRevision
				+ "\nDetalle Revision: " + detalleRevision
				+ "\n_______________________________________";
	}

}
