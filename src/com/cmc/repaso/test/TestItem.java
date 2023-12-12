package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item1=new Item();
		Item item2=new Item();
		item1.setNombre("Papas");
		item1.setProductosActuales(20);
		System.out.println("Valores Iniciales del item 1");
		item1.imprimir();
		System.out.println("Si vendemos 10 unidades");
		item1.vender(10);
		item1.imprimir();
		System.out.println("Si devuelven 5 unidades");
		item1.devolver(5);
		item1.imprimir();
		//----------------------
		item2.setNombre("Doritos");
		item2.setProductosActuales(50);
		System.out.println("Valores Iniciales del item 2");
		item2.imprimir();
		System.out.println("Si vendemos 30 unidades");
		item2.vender(30);
		item2.imprimir();
		System.out.println("Si devuelven 20 unidades");
		item2.devolver(20);
		item2.imprimir();
		

	}

}
