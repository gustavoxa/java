package com.krakedev;

public class Cuadrado {
	double lado;
	public double area()
	{
		double area=Math.pow(lado, 2);
		return area;
	}
	public double perimetro()
	{
		double perimetro=lado*4;
		return perimetro;
	}
	
	

}
