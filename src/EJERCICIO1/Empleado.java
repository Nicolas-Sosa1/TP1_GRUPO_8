package EJERCICIO1;
import java.time.LocalDate;

public class Empleado extends Persona {

// atributos
	private final int legajo;
	private String puesto;
	
// estáticos
	private static int ultimoLegajo = 999;
	
	public static int devuelveProximoLegajo() {
		return ultimoLegajo +1;
	}
	
//getters and setters

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getLegajo() {
		return legajo;
	}

//constructor 1
	public Empleado() {
		super();
		this.legajo = ++ultimoLegajo;
		this.puesto = "sin puesto";
		
	}


	
}
