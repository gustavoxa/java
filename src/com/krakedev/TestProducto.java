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
		productoA.nombre = "Curitas";
		productoA.descripcion = "Bandas utilizadas para pequeños cortes";
		productoA.precio = 0.10;
		productoA.stockActual = 20;
		// Producto 2
		productoB.nombre = "X-Ray Dolor";
		productoB.descripcion = "Utilizado para aliviar dolores";
		productoB.precio = 1.50;
		productoB.stockActual = 100;
		// Producto 3
		productoC.nombre = "Paracetamol";
		productoC.descripcion = "Utilizado para el dolor";
		productoC.precio = 0.80;
		productoC.stockActual = 10;
		System.out.println("-------------------------");
		System.out.println("Producto 1");
		System.out.println("Nombre del producto: " +productoA.nombre);
		System.out.println("Descripción del producto: "+ productoA.descripcion);
		System.out.println("Precio: "+productoA.precio);
		System.out.println("Stock Actual: "+productoA.stockActual);
		System.out.println("-------------------------");
		System.out.println("Producto 2");
		System.out.println("Nombre del producto: " +productoB.nombre);
		System.out.println("Descripción del producto: "+ productoB.descripcion);
		System.out.println("Precio: "+productoB.precio);
		System.out.println("Stock Actual: "+productoB.stockActual);
		System.out.println("-------------------------");
		System.out.println("Producto 3");
		System.out.println("Nombre del producto: " +productoC.nombre);
		System.out.println("Descripción del producto: "+ productoC.descripcion);
		System.out.println("Precio: "+productoC.precio);
		System.out.println("Stock Actual: "+productoC.stockActual);

		
	}

}
