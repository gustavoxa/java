package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado cua1= new Cuadrado();
		double area,perimetro;
		cua1.lado=3;
		area=cua1.area();
		perimetro=cua1.perimetro();
		System.out.println("El area del cuadrado es: "+area);
		System.out.println("El perimetro del cuadrado es: "+perimetro);

	}

}
