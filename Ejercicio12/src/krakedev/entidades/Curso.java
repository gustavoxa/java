package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiante;
	
	
	public Curso() 
	{
		estudiante = new ArrayList<Estudiante>();
		
	}
	
	
	
	
	public ArrayList<Estudiante> getEstudiante() {
		return estudiante;
	}




	public void setEstudiante(ArrayList<Estudiante> estudiante) {
		this.estudiante = estudiante;
	}




	public String buscarEstudiantePorCedula(Estudiante estudiante) 
	{
		String mensaje = null;
		Estudiante estudianteBuscado = null;
		for(int i =0; i<this.estudiante.size();i++) 
		{
			estudianteBuscado= this.estudiante.get(i);
			if(estudianteBuscado.getCedula()==estudiante.getCedula())
			{
				mensaje="Estudiante matriculado";
			}
		}
		return mensaje;
	}
	
	public void matricularEstudiante(Estudiante estudiante) 
	{
		String mensaje= buscarEstudiantePorCedula(estudiante);
		if(mensaje == null) 
		{
			this.estudiante.add(estudiante);
		}
	}
	public double calcularPromedioCurso() 
	{
		Estudiante estudiantePromedio=null;
		double suma =0,promedio;
		for(int i= 0; i<estudiante.size();i++)
		{
			estudiantePromedio = estudiante.get(i);
			suma = suma+estudiantePromedio.calcularPromedioNotasEstudiante(); 
		}
		promedio=suma/estudiante.size();
		return promedio;
	}
	public void mostrar() 
	{
		String mensaje = "";
		Estudiante estudianteEncontrado=null;
		
		for(int i =0; i<estudiante.size();i++)
		{
			estudianteEncontrado = estudiante.get(i);
			mensaje=mensaje+estudianteEncontrado.getNombre()+" "+estudianteEncontrado.getApellido()+" "+"Cedula: "+estudianteEncontrado.getCedula()+" "; 
		}
		System.out.println("Los estudiantes del curso son:"+mensaje );
	}

}
