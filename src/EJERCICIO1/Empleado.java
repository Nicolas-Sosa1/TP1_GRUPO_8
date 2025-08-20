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
	
	
}
