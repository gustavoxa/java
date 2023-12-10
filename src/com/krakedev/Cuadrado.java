package com.krakedev;

public class Cuadrado {
	private double lado;
	public Cuadrado(double lado) 
	{
		this.lado = lado;
	}
	
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
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	

}
