package sprint;

public class Revision {
	int estado,
			id,
			idVisitaTerreno;
	String nombreRevision, detalleRevision;
	
	
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

	@Override
	public String toString() {
		return "Revision:"
				+ "\nEstado: " + estado
				+ "\nID: " + id
				+ "\nID Visita Terreno: " + idVisitaTerreno
				+ "\nNombre Revision: " + nombreRevision
				+ "\nDetalle Revision: " + detalleRevision
				+ "\n_______________________________________";
	}

}
