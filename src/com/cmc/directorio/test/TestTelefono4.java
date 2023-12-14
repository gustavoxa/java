package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi","0994123444",10);
		Telefono telf2 = new Telefono("claro","0994123333",30); 
		Telefono telf3 = new Telefono("claro","099412224",40); 
		Telefono telf4 = new Telefono("movi","09941238765",60);
		int nunmovi1;
		AdminTelefono at = new AdminTelefono();
		nunmovi1=at.contarClaro(telf1, telf2, telf3, telf4);
		System.out.println("El primer telefono");
		System.out.println("Operadora: "+telf1.getOperadora());
		System.out.println("Numero: "+telf1.getNumero());
		System.out.println("Código: "+telf1.getCodigo());
		System.out.println("El segundo telefono");
		System.out.println("Operadora: "+telf2.getOperadora());
		System.out.println("Numero: "+telf2.getNumero());
		System.out.println("Código: "+telf2.getCodigo());
		System.out.println("El tercer telefono");
		System.out.println("Operadora: "+telf3.getOperadora());
		System.out.println("Numero: "+telf3.getNumero());
		System.out.println("Código: "+telf3.getCodigo());
		System.out.println("El cuarto telefono");
		System.out.println("Operadora: "+telf4.getOperadora());
		System.out.println("Numero: "+telf4.getNumero());
		System.out.println("Código: "+telf4.getCodigo());
		System.out.println("El numero de operadoras claro "+nunmovi1);

	}

}
