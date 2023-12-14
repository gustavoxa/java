package com.cmc.directorio.entidades;

public class AdminContacto {
	public Contacto buscarMasPesado(Contacto contacto1,Contacto contacto2) 
	{
		if(contacto1.getPeso()> contacto2.getPeso())
		{
			return contacto1;
		}else if(contacto2.getPeso()>contacto1.getPeso()) 
		{
			return contacto2;
		}else 
		{
			return null;
		}
			
	}
	public boolean compararOperadoras(Contacto contacto1,Contacto contacto2) 
	{
		if(contacto1.getTelefono() != null && contacto2.getTelefono() != null)
		{
			if(contacto1.getTelefono().getOperadora() == contacto2.getTelefono().getOperadora()) 
			{
				return true;
				
			}else 
			{
				return false;
			}
		}else 
		{
			return false;
		}
			
	}
	public void activarUsuario(Contacto contacto1) 
	{
		if(contacto1.getTelefono().isTieneWhatsapp() == true) 
		{
			contacto1.setActivo(true);
		}else 
		{
			contacto1.setActivo(false);
		}
	}
	

}
