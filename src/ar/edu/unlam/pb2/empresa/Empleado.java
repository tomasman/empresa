package ar.edu.unlam.pb2.empresa;

public class Empleado {
	private String nombre;
  	private double salario;
  	private String fechaDeCumpleaņos;
  	
 	
 	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getFechaDeCumpleaņos() {
		return fechaDeCumpleaņos;
	}


	public void setFechaDeCumpleaņos(String fechaDeCumpleaņos) {
		this.fechaDeCumpleaņos = fechaDeCumpleaņos;
	}


	public Empleado(String nombre, double salario, String fechaDeCumpleaņos) {
 		this.nombre = nombre;
    	this.salario = salario;
 		this.fechaDeCumpleaņos = fechaDeCumpleaņos;
  	}


	public Empleado() {
	}


	public char[] brindarDetalles() {
		return null;
	}
}
