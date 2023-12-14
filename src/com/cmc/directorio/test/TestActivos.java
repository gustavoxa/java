package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf = new Telefono("movi","09941234123",10); 
		Contacto cont = new Contacto("Karina","Arcos",telf,45.5);
		AdminContacto admin = new AdminContacto();
		AdminTelefono admintel = new AdminTelefono();
		System.out.println("El nombre es: "+cont.getNombre()+" "+cont.getApellido()+" y su estado es: "+cont.isActivo());
		System.out.println("la información del telefono es");
		System.out.println("Operadora: "+cont.getTelefono().getOperadora());
		System.out.println("Numero: "+cont.getTelefono().getNumero());
		System.out.println("Código: "+cont.getTelefono().getCodigo());
		System.out.println("Tiene whatsapp: "+cont.getTelefono().isTieneWhatsapp() );
		System.out.println("-------------------------------");
		System.out.println("Al activar el metodo con false en whatsapp");
		admin.activarUsuario(cont);
		System.out.println("El nombre es: "+cont.getNombre()+" "+cont.getApellido()+" y su estado es: "+cont.isActivo());
		System.out.println("la información del telefono es");
		System.out.println("Operadora: "+cont.getTelefono().getOperadora());
		System.out.println("Numero: "+cont.getTelefono().getNumero());
		System.out.println("Código: "+cont.getTelefono().getCodigo());
		System.out.println("Tiene whatsapp: "+cont.getTelefono().isTieneWhatsapp() );
		System.out.println("-------------------------------");
		System.out.println("Activando la mensajeria ");
		admintel.activarMensajeria(cont.getTelefono());
		admin.activarUsuario(cont);
		System.out.println("El nombre es: "+cont.getNombre()+" "+cont.getApellido()+" y su estado es: "+cont.isActivo());
		System.out.println("la información del telefono es");
		System.out.println("Operadora: "+cont.getTelefono().getOperadora());
		System.out.println("Numero: "+cont.getTelefono().getNumero());
		System.out.println("Código: "+cont.getTelefono().getCodigo());
		System.out.println("Tiene whatsapp: "+cont.getTelefono().isTieneWhatsapp() );
		
	}

}
