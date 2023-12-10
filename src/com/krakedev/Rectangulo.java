package com.krakedev;

public class Rectangulo {
	public double base;
	public double altura;
	
	public double calcularArea() 
	{
	    double area;
	    area=base*altura;
		return area;
	}
	public double calcularPerimetro() 
	{
		double perimetro= base+base+altura+altura;
		return perimetro;
	}

}
