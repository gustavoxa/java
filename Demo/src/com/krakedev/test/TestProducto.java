package com.krakedev.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto1 = new Producto(1234,"Manzanas");
		producto1.setDescripcion("Esto es una fruta");
		producto1.setPeso(0.23);
		
		System.out.println("Descripción del Producto");
		System.out.println("El codigo del producto es: "+producto1.getCodigo());
		System.out.println("Descripcion: "+producto1.getDescripcion());
		System.out.println("Nombre: "+producto1.getNombre());
		System.out.println("Peso: "+producto1.getPeso());

	}

}
