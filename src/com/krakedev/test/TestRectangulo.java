package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1=new Rectangulo(4,2);
		double perimetro;
		r1.setAltura(4);
		r1.setBase(2);
		perimetro=r1.calcularPerimetro();
		System.out.println("El perimetro es: "+perimetro);
	}

}
