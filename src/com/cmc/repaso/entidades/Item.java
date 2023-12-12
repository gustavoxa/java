package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	public void imprimir() 
	{
		System.out.println("El nombre de producto es:"+nombre);
		System.out.println("El número de productos actuales: "+productosActuales);
		System.out.println("El número de productos devueltos:"+productosDevueltos);
		System.out.println("El número de productos vendidos: "+productosVendidos);
		System.out.println("----------------");
	}
	public void vender(int productosVendidos)
	{
		productosActuales=productosActuales-productosVendidos;
		this.productosVendidos= this.productosVendidos + productosVendidos;
	}
	public void devolver(int productosDevueltos)
	{
		productosActuales=productosActuales+productosDevueltos;
		productosVendidos=productosVendidos-productosDevueltos;
		this.productosDevueltos = this.productosDevueltos+productosDevueltos;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}
	

}
