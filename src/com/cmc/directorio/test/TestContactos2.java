package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacto contpesado;
		Telefono telf1 = new Telefono("movi", "09941234123", 10);
		Contacto c1 = new Contacto("Pedro", "Hoyos", telf1, 3.4);
		Telefono telf2 = new Telefono("claro", "09228834123", 30);
		Contacto c2 = new Contacto("Pablo", "Paredes", telf2, 3.4);
		AdminContacto admc = new AdminContacto();
		contpesado = admc.buscarMasPesado(c1, c2);
		if (contpesado == null) {
			System.out.println("Ambos pesan lo mismo");
		} else {
			System.out.println("El contacto mas pesado es :");
			System.out.println("Nombre: " + contpesado.getNombre() + " " + contpesado.getApellido()
					+ " el número de telefono es: " + contpesado.getTelefono().getNumero() + " la operadora es: "
					+ contpesado.getTelefono().getOperadora());
		}
		boolean operadores;
		operadores = admc.compararOperadoras(c1, c2);
		System.out.println("Las operadoras son las mismas: "+operadores);
	}

}
