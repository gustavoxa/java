package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validacion validador = new Validacion();
		boolean valor1,valor2,valor3;
		valor1=validador.validarMonto(0.0);
		valor2=validador.validarMonto(100.0);
		valor3=validador.validarMonto(-233.0);
		System.out.println("Para cero es: "+valor1);
		System.out.println("Para un valor mayor a cero: "+valor2);
		System.out.println("Para un valor menor a cero: "+valor3);

	}

}
