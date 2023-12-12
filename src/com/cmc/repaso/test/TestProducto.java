package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto1= new Producto("Arroz",-23.54);
		Producto producto2 = new Producto("Cerveza",13.4);
		double preciopromocion;
		System.out.println("El primer producto:"+producto1.getNombre());
		System.out.println("El precio del producto: "+producto1.getPrecio());
		System.out.println("--------------------");
		System.out.println("El segundo producto: "+producto2.getNombre());
		System.out.println("El precio del producto: "+producto2.getPrecio());
		System.out.println("Aplicando un descuento del 20%");
		preciopromocion=producto2.calcularPrecioPromo(20);
		System.out.println(preciopromocion);
	}

}
