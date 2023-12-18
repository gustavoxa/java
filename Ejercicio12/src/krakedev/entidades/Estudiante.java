package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> nota;
	
	public Estudiante(String cedula, String nombre,String apellido) 
	{
		nota = new ArrayList<Nota>();
		this.nombre=nombre;
		this.apellido = apellido;
		this.cedula = cedula;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	public void agregarNota(Nota nota)
	{
		Nota notaBuscada = null;
		if(this.nota.size() == 0 )
		{
			if(nota.getCalificacion() >= 0 && nota.getCalificacion() <=10 ) 
			{
				this.nota.add(nota);
			}
			
			
		}else 
		{
			int limite = this.nota.size();
			for(int i=0; i<this.nota.size();i++)
			{
				notaBuscada = this.nota.get(i);
				if(notaBuscada.getMateria() !=null )
				{
					if(notaBuscada.getMateria().getCodigo() != nota.getMateria().getCodigo() && nota.getCalificacion() >= 0 && nota.getCalificacion() <=10 && i== limite-1)
					{
					  this.nota.add(nota);
					 
					}
				}
			}

			
		}	
	}
	public void modificarNota(String codigo,double notaNueva) 
	{
		Nota notaBuscada = null;
		for(int i=0; i<this.nota.size();i++)
		{
			notaBuscada = this.nota.get(i);
			if(codigo.equals(notaBuscada.getMateria().getCodigo()) && notaNueva >= 0 && notaNueva <=10) 
			{
				notaBuscada.setCalificacion(notaNueva);
			}
		}
	}
	public double calcularPromedioNotasEstudiante() 
	{
		double promedio;
		double suma=0;
		Nota notaEncontrada = null;
		
		for(int i=0; i< nota.size(); i++) 
		{
			notaEncontrada = nota.get(i);
			suma = suma + notaEncontrada.getCalificacion();
			
		}
		promedio = suma/nota.size();
		return promedio;
	}
	public void mostrar() 
	{
		Nota notaEncontrada = null;
		String mensaje="";
		for( int i=0; i<nota.size();i++)
		{
			notaEncontrada = nota.get(i);
			mensaje = mensaje+notaEncontrada.getMateria().getNombre()+" "+Double.toString(notaEncontrada.getCalificacion())+" ";
		}
		System.out.println("Estudiante: "+nombre+" "+apellido+" "+"Notas: "+mensaje);
	}
	
	

}
