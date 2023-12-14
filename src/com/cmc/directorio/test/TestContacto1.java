package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf = new Telefono("movi", "09941234123", 10);
		Contacto c = new Contacto("Pedro", "Picapiedra", telf, 2.4);

		System.out.println("El nombre es: " + c.getNombre() + " " + c.getApellido() + " el numero de telefono es: "
				+ c.getTelefono().getNumero() + " la operadora es: " + c.getTelefono().getOperadora());

	}

}
