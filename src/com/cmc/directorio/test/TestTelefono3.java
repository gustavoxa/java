package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf1 = new Telefono("movi","0994123444",10);
		Telefono telf2 = new Telefono("movi","0994123333",30); 
		Telefono telf3 = new Telefono("claro","099412224",40); 
		Telefono telf4 = new Telefono("movi","09941238765",60);
		Telefono telf5 = new Telefono("claro","0994122113",40); 
		Telefono telf6 = new Telefono("claro","0994122111",80); 
		int nunmovi1,nunmovi2;
		AdminTelefono at = new AdminTelefono();
		nunmovi1=at.contarMovi(telf1, telf2, telf3);
		nunmovi2=at.contarMovi(telf4, telf5, telf6);
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
		System.out.println("El numero de operadoras movi "+nunmovi1);
		
        System.out.println("-----------------------"); 
		System.out.println("El primer telefono");
		System.out.println("Operadora: "+telf4.getOperadora());
		System.out.println("Numero: "+telf4.getNumero());
		System.out.println("Código: "+telf4.getCodigo());
		System.out.println("El segundo telefono");
		System.out.println("Operadora: "+telf5.getOperadora());
		System.out.println("Numero: "+telf5.getNumero());
		System.out.println("Código: "+telf5.getCodigo());
		System.out.println("El tercer telefono");
		System.out.println("Operadora: "+telf6.getOperadora());
		System.out.println("Numero: "+telf6.getNumero());
		System.out.println("Código: "+telf6.getCodigo());
		System.out.println("El numero de operadoras movi "+nunmovi2);


	}

}
