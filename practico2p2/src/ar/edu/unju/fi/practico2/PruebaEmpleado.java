package ar.edu.unju.fi.practico2;

public class PruebaEmpleado {

	public static void main(String[] args) {
		
		Empleado unEmpleado = new Empleado(123,"42168199", "Juan",null,10000, 2, 2, 20);
		System.out.println("Salario actual es de: "+ unEmpleado.getSalarioBasico());
		System.out.println("El importe a descontar es de: "+ unEmpleado.getImporteDescuento());
		unEmpleado.getSalarioNeto(unEmpleado);
		
	}

}
