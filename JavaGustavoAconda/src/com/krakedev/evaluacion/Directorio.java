package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private Date fechaModificacion;
	private ArrayList<Contacto> contacto;
	private SimpleDateFormat formateador = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;
	public Directorio() 
	{
		fechaModificacion = new Date();
		contacto = new ArrayList<Contacto>();
		correctos = new ArrayList<Contacto>();
		incorrectos = new ArrayList<Contacto>();
	}
	
	public boolean agregarContacto(Contacto contacto) 
	{
		Contacto contactoBuscado = null;
		int contador=this.contacto.size();
		boolean respuesta = false;
		if(this.contacto.size() == 0) 
		{
			this.contacto.add(contacto);
			respuesta = true;

		}else 
		{
			for(int i=0;i< this.contacto.size();i++)
			{
				contactoBuscado=this.contacto.get(i);
				if(contactoBuscado.getCedula() != contacto.getCedula() && i == contador-1 )
				{
					this.contacto.add(contacto);
					respuesta=true;
				}
			}
		}
		return respuesta;
	}
	public Contacto buscarPorCedula(String cedula) 
	{
		Contacto contactoBuscado = null;
		Contacto contactoEncontrado = null;
		for(int i=0; i<contacto.size();i++)
		{
			contactoBuscado = contacto.get(i);
			if(cedula.equals(contactoBuscado.getCedula()))
			{
				contactoEncontrado = contactoBuscado;
			}
		}
		return contactoEncontrado;
	}
	public String consultarUltimaModificacion() 
	{
		String fechaResultante;
		
		fechaResultante = formateador.format(fechaModificacion);
	
		return fechaResultante;
	}
	public int contarPerdidos() 
	{
		Contacto contactoPerdido = null;
		int contador=0;
		for(int i=0; i< contacto.size();i++)
		{
			contactoPerdido = contacto.get(i);
			if(contactoPerdido.getDireccion() == null) 
			{
				contador=contador+1;
			}
		}
		return contador;
	}
	public int contarFijos()
	{
		Contacto contactoPerdido = null;
		Telefono telefonoFijo = null;
		int contador=0;
		for(int i=0; i< contacto.size();i++)
		{
			contactoPerdido = contacto.get(i);
			for(int j=0; j < contactoPerdido.getTelefono().size();j++)
			{
				telefonoFijo = contactoPerdido.getTelefono().get(j);
				if(telefonoFijo.getTipo()=="Convencional") 
				{
					contador=contador+1;
				}
		
			}
		}
		return contador;
	}
	public void depurar() 
	{
		Contacto contactoDepurado = null;
		for(int i=0;i<contacto.size();i++)
		{
			contactoDepurado= contacto.get(i);
			if(contactoDepurado.getDireccion() == null) 
			{
				incorrectos.add(contactoDepurado);
			}else 
			{
				correctos.add(contactoDepurado);
			}
			
			
		}
		contacto.removeAll(contacto);
	
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

	public ArrayList<Contacto> getContactos() {
		return contacto;
	}

	public void setContacto(ArrayList<Contacto> contacto) {
		this.contacto = contacto;
	}
	

}
