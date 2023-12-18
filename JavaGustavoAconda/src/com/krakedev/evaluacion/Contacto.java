package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefono;
	public Contacto(String cedula, String nombre, String apellido, Direccion direccion) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		telefono = new ArrayList<Telefono>();
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	public ArrayList<Telefono> getTelefono() {
		return telefono;
	}
	public void setTelefono(ArrayList<Telefono> telefono) {
		this.telefono = telefono;
	}
	
	public void imprimir() 
	{
		System.out.println("Cédula: "+cedula);
		System.out.println("Nombre: "+nombre );
		System.out.println("Apellido: "+apellido);
		System.out.println("Dirección: ");
		System.out.println(" Calle Principal: "+direccion.getCallePrincipal());
		System.out.println(" Calle Secundaria: "+direccion.getCalleSecundaria());
	}
	/*
	public void imprimir() 
	{
		System.out.println("***** "+ nombre +" "+apellido+" *****");
		if(direccion == null) 
		{
			System.out.println("No tiene asociada una dirección");
		}else 
		{
			System.out.println("Dirección: "+direccion.getCallePrincipal()+" y "+direccion.getCalleSecundaria());
			
		}
	}*/
	public void agregarTelefono(Telefono telefono) 
	{
		this.telefono.add(telefono);
	}
	public void mostrarTelefonos()
	{
		Telefono telefonoBuscado=null;
		System.out.println("Los telefonos de estado C:");
		for(int i=0; i<telefono.size();i++)
		{
			telefonoBuscado = telefono.get(i);
			if(telefonoBuscado.getEstado().equals("C"))
			{
				System.out.println("Numero: "+telefonoBuscado.getNumero()+" ,Tipo: "+telefonoBuscado.getTipo());
			}
		}
	}
	public ArrayList<Telefono> recuperarIncorrectos()
	{
		ArrayList<Telefono> telefonoRecuperado = new ArrayList<Telefono>();
		Telefono telefonoBuscado = null;
		
		for(int i=0; i<telefono.size();i++)
		{
			telefonoBuscado = telefono.get(i);
			if(telefonoBuscado.getEstado().equals("E"))
			{
				telefonoRecuperado.add(telefonoBuscado);
			}
		}
		return telefonoRecuperado;
		
	}

}
