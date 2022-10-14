package ar.edu.unju.fi.practico2;

import java.util.Date;

public class Empleado {

	private int legajo;
	private String documento;
	private String nombre;
	private Date fechaIngreso;
	private double salarioBasico;
	private int categoria;
	private int cantidadHijos;
	private int porcentajeDescuento;
	
	
	//Getter y Setter de los atributos
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public double getSalarioBasico() {
		return salarioBasico;
	}
	public void setSalarioBasico(double salarioBasico) {
		this.salarioBasico = salarioBasico;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public int getCantidadHijos() {
		return cantidadHijos;
	}
	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}
	public int getPorcentajeDescuento() {
		return porcentajeDescuento;
	}
	public void setPorcentajeDescuento(int porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	
	//CONSTRUCTOR  
	public Empleado(int legajo, String documento, String nombre, Date fechaIngreso, double salarioBasico, int categoria,
		int cantidadHijos, int porcentajeDescuento) {
		super();
		this.legajo = legajo;
		this.documento = documento;
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.salarioBasico = salarioBasico;
		this.categoria = categoria;
		this.cantidadHijos = cantidadHijos;
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	
	//Metodo para calcular el importe a descontar
	public double getImporteDescuento() {
		double importeDescuento = this.salarioBasico * (this.porcentajeDescuento / 100d);
		return importeDescuento;
		
	}


	//Metodo para calcular el Salario Neto
	public void getSalarioNeto(Empleado unEmpleado) {
		switch (unEmpleado.categoria) {
			case 0: {
				
				double salarioFamiliar = unEmpleado.cantidadHijos * 400;
				double salarioNeto = unEmpleado.getSalarioBasico() + salarioFamiliar +  0 - unEmpleado.getImporteDescuento();
				System.out.println("El salario Neto es de "+ salarioNeto);
				break;
				
			}
			case 1: {
				double salarioFamiliar = unEmpleado.cantidadHijos * 400;
				double salarioNeto = unEmpleado.getSalarioBasico() + salarioFamiliar +  1000 - unEmpleado.getImporteDescuento();
				System.out.println("El salario Neto es de "+ salarioNeto);
				break;
			}
			case 2:{
				double salarioFamiliar = unEmpleado.cantidadHijos * 400;
				double salarioNeto = unEmpleado.getSalarioBasico() + salarioFamiliar +  1500 - unEmpleado.getImporteDescuento();
				System.out.println("El salario Neto es de "+ salarioNeto);
				break;
				
			}
			case 3: {
				double salarioFamiliar = unEmpleado.cantidadHijos * 400;
				double salarioNeto = unEmpleado.getSalarioBasico() + salarioFamiliar + (unEmpleado.categoria * 2000) - unEmpleado.getImporteDescuento();
				System.out.println("El salario Neto es de "+ salarioNeto);
				break;
				
			}
		
		}
	}
	
	
	
	
	
	
}
