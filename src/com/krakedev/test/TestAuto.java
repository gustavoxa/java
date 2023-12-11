package com.krakedev.test;
import com.krakedev.*;
public class TestAuto {

	public static void main(String[] args) {
		// Metodos del auto
		Auto auto1= new Auto("Hyundai",2020,1400.50);
		Auto auto2= new Auto("Chevrolet",2021,20000);
		System.out.println("-------------------");
		System.out.println("Caracteristicas inciales del primer auto");
		System.out.println("Marca: "+auto1.getMarca());
		System.out.println("Año: "+auto1.getAnio());
		System.out.println("Precio: "+auto1.getPrecio());
		System.out.println("Caracteristicas inciales del segundo auto");
		System.out.println("Marca: "+auto2.getMarca());
		System.out.println("Año: "+auto2.getAnio());
		System.out.println("Precio: "+auto2.getPrecio());
		//Modificiacion  de atributos
		auto1.setMarca("KYA");
		auto1.setAnio(2013);
		auto1.setPrecio(15.602);
		auto2.setMarca("Chevrolet");
		auto2.setAnio(2021);
		auto2.setPrecio(20000);
		System.out.println("-------------------");
		System.out.println("Caracteristicas modificadas del primer auto");
		System.out.println("Marca: "+auto1.getMarca());
		System.out.println("Año: "+auto1.getAnio());
		System.out.println("Precio: "+auto1.getPrecio());
		System.out.println("Caracteristicas modificadas del segundo auto");
		System.out.println("Marca: "+auto2.getMarca());
		System.out.println("Año: "+auto2.getAnio());
		System.out.println("Precio: "+auto2.getPrecio());
		

	}

}
