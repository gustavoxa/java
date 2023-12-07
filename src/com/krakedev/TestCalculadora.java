package com.krakedev;

public class TestCalculadora {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calculadora = new Calculadora();
		double resultadoMultiplicacion, resultadoDivision,resultadoPromedio;
		resultadoMultiplicacion=calculadora.multiplicar(10, 5);
		resultadoDivision = calculadora.division(10, 2);
		resultadoPromedio = calculadora.promedio(10, 8, 9);
		System.out.println("Resultado Multiplicacion: "+resultadoMultiplicacion);
		System.out.println("Resultado Division: "+resultadoDivision);
		System.out.println("Resultado Promedio: "+resultadoPromedio);
		System.out.println("Mensaje");
		calculadora.mostrarResultado();
	}


}
