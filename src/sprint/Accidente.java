package sprint;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Accidente {

	private int idAccidente;
	private String fechaAccidente;
	private String horaAccidente;
	private String lugar;
	private String origen;
	private String consecuencias;
	
	
	//Constructors
	
	public Accidente(int idAccidente,String fechaAccidente,String horaAccidente,String lugar,String origen,String consecuencias ) {
		this.idAccidente=idAccidente;
		this.fechaAccidente=fechaAccidente;
		this.horaAccidente=horaAccidente;
		this.lugar=lugar;
		this.origen=origen;
		this.consecuencias=consecuencias;
		
	}
	
	public Accidente() {
		
	}


	//Getter && Setter
	
	
	public int getIdAccidente() {
		return idAccidente;
	}

	public void setIdAccidente(int idAccidente) {
		if(idAccidente==0) {
			System.out.println("es obligatorio y no puede ser 0");
		}else
		{
			this.idAccidente = idAccidente;
		}
		
		
	}

	public String getFechaAccidente() {
		return fechaAccidente;
		
	}

	public void setFechaAccidente(String fechaAccidente) {
		
		this.fechaAccidente = fechaAccidente;
	}

	public String getHoraAccidente() {
		SimpleDateFormat simpleformat = new SimpleDateFormat("HH:MM");
		String horaFormateada = simpleformat.format(this.horaAccidente);
		return horaAccidente;
	}

	public void setHoraAccidente(String horaAccidente) {
		this.horaAccidente = horaAccidente;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		if(lugar.length()<10 && lugar.length()>50 ) {
		System.out.println("Debe tener mas de 10 caracteres y menor a 50 caracteres");
	 }else {
		this.lugar = lugar;
	 }
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		if(origen.length()>100) 
		{
			System.out.println("No debe ser mayor a 100 caracteres");
		}else {
		
		this.origen = origen;
		}
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		if(consecuencias.length()>100) {
		     System.out.println("No debe ser mayor a 100 caracteres");
		}else {
			
		this.consecuencias = consecuencias;
		}
	}
		
}

