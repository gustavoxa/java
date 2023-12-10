package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// Declaración de las variables para los productos
		Producto productoA; 
		Producto productoB;
		Producto productoC;
		// Instancio los 3 productos
		productoA = new Producto();
		productoB = new Producto();
		productoC = new Producto();
		// Modificacion de las productos
		// Producto 1
		productoA.setNombre("Curitas");
		productoA.setDescripcion("Bandas utilizadas para pequeños cortes");
		productoA.setPrecio(0.10);
		productoA.setStockActual(20);
		// Producto 2
		productoB.setNombre("X-Ray Dolor");
		productoB.setDescripcion("Utilizado para aliviar dolores");
		productoB.setPrecio(1.50);
		productoB.setStockActual(100);
		// Producto 3
		productoC.setNombre("Paracetamol");
		productoC.setDescripcion("Utilizado para el dolor");
		productoC.setPrecio(0.80);
		productoC.setStockActual(10);
		System.out.println("-------------------------");
		System.out.println("Producto 1");
		System.out.println("Nombre del producto: " +productoA.getNombre());
		System.out.println("Descripción del producto: "+ productoA.getDescripcion());
		System.out.println("Precio: "+productoA.getPrecio());
		System.out.println("Stock Actual: "+productoA.getStockActual());
		System.out.println("-------------------------");
		System.out.println("Producto 2");
		System.out.println("Nombre del producto: " +productoB.getNombre());
		System.out.println("Descripción del producto: "+ productoB.getDescripcion());
		System.out.println("Precio: "+productoB.getPrecio());
		System.out.println("Stock Actual: "+productoB.getStockActual());
		System.out.println("-------------------------");
		System.out.println("Producto 3");
		System.out.println("Nombre del producto: " +productoC.getNombre());
		System.out.println("Descripción del producto: "+ productoC.getDescripcion());
		System.out.println("Precio: "+productoC.getPrecio());
		System.out.println("Stock Actual: "+productoC.getStockActual());

		
	}

}
