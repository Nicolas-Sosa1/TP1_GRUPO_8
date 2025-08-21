package EJERCICIO1;

import java.time.LocalDate;

public class Principal {
	
	public static void main(String[] args) {
		
		
		//Empleados constructor vacío
		
		Empleado empleado1 = new Empleado();
		Empleado empleado2 = new Empleado();
		Empleado empleado3 = new Empleado();
		
		//Empleados constructor con parámetros
		
		Empleado empleado4 = new Empleado("dni4", "nombre4", "apellido4", LocalDate.of(2000, 4,4), 
				"genero4", "direccion4", "telefono4", "email4", "puesto4");
		
		Empleado empleado5 = new Empleado("dni5", "nombre5", "apellido5", LocalDate.of(2000, 5,5), 
				"genero5", "direccion5", "telefono5", "email5", "puesto5");
				
		System.out.println(empleado1);
		System.out.println(empleado2);
		System.out.println(empleado3);
		System.out.println(empleado4);
		System.out.println(empleado5);
		
		System.out.println("El próximo legajo será el " + Empleado.devuelveProximoLegajo());
	}
}
