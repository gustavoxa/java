package com.krakedev;

public class Calculadora {
	public double multiplicar(double valor1, double valor2) 
	{
		double resultado;
		resultado = valor1*valor2; 
		return resultado;
	}
	public double division(double dividendo, double divisor) 
	{
		double cociente;
		cociente = dividendo/divisor;
		return cociente;
	}
	public double promedio(double valor1, double valor2, double valor3) 
	{
		double suma,resultado;
		suma = valor1+valor2+valor3;
		resultado = suma/3;
		return resultado;
	}
	public void mostrarResultado() 
	{
		System.out.println("Ahorita no joven, Sali al almuerzo. Regreso en 15 minutos");
	}
	
}
