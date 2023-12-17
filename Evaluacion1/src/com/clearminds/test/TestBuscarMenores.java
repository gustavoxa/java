package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaquinaDulces maquina=new MaquinaDulces();
		ArrayList<Producto> menores= null;
		maquina.agregarCelda(new Celda("A1"));
        maquina.agregarCelda(new Celda("A2"));
        maquina.agregarCelda(new Celda("B1"));
        maquina.agregarCelda(new Celda("B2"));
        maquina.agregarCelda(new Celda("C1"));
        maquina.agregarCelda(new Celda("C2"));
        maquina.agregarCelda(new Celda("D1"));
        
    	Producto producto1=new Producto("KE34","Papitas",0.85);
    	Producto producto2=new Producto("D456","Doritos",0.70);
    	Producto producto3=new Producto("E456","Cueritos",1.25);
    	Producto producto4=new Producto("F456","Wisky",4.70);
    	Producto producto5=new Producto("G456","Cerveza",2.75);
    	
    	maquina.cargarProducto(producto1, "A1", 4);
		maquina.cargarProducto(producto2, "A2", 6);
		maquina.cargarProducto(producto3, "B1", 7);
		maquina.cargarProducto(producto4, "B2", 8);
		maquina.cargarProducto(producto5, "C1", 3);
		
		menores = maquina.buscarMenores(1);
		Producto productoEncontrado= null;
		System.out.println("El numero de productos menores o iguales a dos son: "+menores.size());
		for(int i=0; i< menores.size();i++) 
		{
			productoEncontrado = menores.get(i);
			System.out.println("El nombre del producto es: "+productoEncontrado.getNombre()+ " El precio es: "+productoEncontrado.getPrecio());
		}
			

	}

}
