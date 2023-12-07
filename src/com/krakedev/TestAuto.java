package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// Metodos del auto
		Auto auto1= new Auto();
		Auto auto2= new Auto();
		System.out.println("-------------------");
		System.out.println("Caracteristicas inciales del primer auto");
		System.out.println("Marca: "+auto1.marca);
		System.out.println("Año: "+auto1.anio);
		System.out.println("Precio: "+auto1.precio);
		System.out.println("Caracteristicas inciales del segundo auto");
		System.out.println("Marca: "+auto2.marca);
		System.out.println("Año: "+auto2.anio);
		System.out.println("Precio: "+auto2.precio);
		//Modificiacion  de atributos
		auto1.marca = "KYA";
		auto1.anio = 2013;
		auto1.precio = 15.602;
		auto2.marca = "Chevrolet";
		auto2.anio = 2021;
		auto2.precio= 20000;
		System.out.println("-------------------");
		System.out.println("Caracteristicas modificadas del primer auto");
		System.out.println("Marca: "+auto1.marca);
		System.out.println("Año: "+auto1.anio);
		System.out.println("Precio: "+auto1.precio);
		System.out.println("Caracteristicas modificadas del segundo auto");
		System.out.println("Marca: "+auto2.marca);
		System.out.println("Año: "+auto2.anio);
		System.out.println("Precio: "+auto2.precio);
		

	}

}
