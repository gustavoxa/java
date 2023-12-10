package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1=new Rectangulo();
		double perimetro;
		r1.altura=4;
		r1.base=2;
		perimetro=r1.calcularPerimetro();
		System.out.println("El perimetro es: "+perimetro);
	}

}
