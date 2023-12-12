package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante estudiante1= new Estudiante("Pedro");
		Estudiante estudiante2= new Estudiante("Juanito");
		estudiante1.calificar(7.3);
		estudiante2.calificar(8.9);
		System.out.println("El nombre del estudiante: "+estudiante1.getNombre());
		System.out.println("La calificacion : "+estudiante1.getNota());
		System.out.println("El resultado es: "+estudiante1.getResultado());
		System.out.println("El nombre del estudiante: "+estudiante2.getNombre());
		System.out.println("La calificacion : "+estudiante2.getNota());
		System.out.println("El resultado es: "+estudiante2.getResultado());

	}

}
