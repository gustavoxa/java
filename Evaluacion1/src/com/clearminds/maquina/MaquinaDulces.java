package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celda;
	double saldo;
	
	public MaquinaDulces() 
	{
		this.celda = new ArrayList<Celda>();
	}
	
	public void agregarCelda(Celda celda) 
	{
		this.celda.add(celda);
		
	}
	public void mostrarConfiguracion() 
	{
		Celda celdaEncontrada = null;
		
		for( int i=0; i< this.celda.size(); i++)
		{
			celdaEncontrada=this.celda.get(i);
			System.out.println("CELDA: "+ celdaEncontrada.getCodigo());
		}
	}
	
	public Celda buscarCelda(String codigo) 
	{
		Celda celdaEncontrada=null;
		Celda celdaBusqueda= null;
		for(int i=0; i < this.celda.size();i++)
		{
			celdaBusqueda = celda.get(i);
			if(codigo.equals(celdaBusqueda.getCodigo())) 
			{
				celdaEncontrada=celdaBusqueda;
			}
		}
		
		return celdaEncontrada;
	}
	public void cargarProducto(Producto producto,String codigo,int stock ) 
	{
		Celda celdaEncontrada = buscarCelda(codigo);
		if(celdaEncontrada== null) 
		{
			System.out.println("No existe la celda");
		}else 
		{
			celdaEncontrada.ingresarProducto(producto, stock);
		}
		
	}
	
	public void mostrarProductos() 
	{
		Celda celdaEncontrada = null;
		Producto productoEncontrado = null;
		for ( int i=0; i< celda.size();i++) 
		{
			celdaEncontrada = celda.get(i);
			System.out.println("Codigo de Celda: "+celdaEncontrada.getCodigo());
			if(celdaEncontrada.getProducto()==null) 
			{
				System.out.println("No existe Producto");
				System.out.println("-----------------");
			}else 
			{
				System.out.println("Nombre del Producto: "+celdaEncontrada.getProducto().getNombre());
				System.out.println("Codigo del Producto: "+celdaEncontrada.getProducto().getCodigo());
				System.out.println("Precio del Producto: "+celdaEncontrada.getProducto().getPrecio());
				System.out.println("Stock: "+celdaEncontrada.getStock());
				System.out.println("-------------------------------");
			}
		}
		System.out.println("El saldo actual es: "+saldo);
	}
	
	public Producto buscarProductoEnCelda(String codigo) 
	{
		Celda celdaEncontrada= buscarCelda(codigo);
		Producto productoEncontrado = null;
		if(celdaEncontrada == null) 
		{
			productoEncontrado = null;
		}else 
		{
			productoEncontrado = celdaEncontrada.getProducto();
		}
		
		return productoEncontrado;
	}
	public double consultarPrecio(String codigo) 
	{
		Celda celdaEncontrada= buscarCelda(codigo);
		Producto productoEncontrado = null;
		double precio;
		if(celdaEncontrada == null) 
		{
			precio = 0;
		}else 
		{
			precio = celdaEncontrada.getProducto().getPrecio();
		}
		
		return precio;
	}
	public Celda buscarCeldaProducto(String codigo) 
	{
		Celda celdaBuscada= null;
		Celda celdaEncontrada= null;
		for(int i=0 ; i< celda.size();i++) 
		{
			celdaBuscada = celda.get(i);
			
			if(celdaBuscada.getProducto() != null) 
			{
				
				if(codigo.equals(celdaBuscada.getProducto().getCodigo())) 
				{
					celdaEncontrada = celdaBuscada;
					
				}
			}
			
		}
				
		return celdaEncontrada;
	
		
	}
	
	public void incrementarProductos(String codigo, int stock) 
	{
		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		celdaEncontrada.setStock(celdaEncontrada.getStock()+stock);
		
	}
	public void vender(String codigo)
	{
		Celda celdaBuscada =  buscarCelda(codigo);
		double precio;
		if(celdaBuscada == null) 
		{
			System.out.println("No existe la celda");
		}else 
		{
			precio = celdaBuscada.getProducto().getPrecio();
			saldo= saldo + precio;
			celdaBuscada.setStock(celdaBuscada.getStock()-1);
			mostrarProductos();
		}
	}
	
	public double venderConCambio(String codigo,double pago) 
	{
		double cambio = 0;
		Celda celdaBuscada =  buscarCelda(codigo);
		double precio;
		if(celdaBuscada == null) 
		{
			System.out.println("No existe la celda");
		}else 
		{
			precio = celdaBuscada.getProducto().getPrecio();
			saldo= saldo + precio;
			cambio = pago-precio;
			celdaBuscada.setStock(celdaBuscada.getStock()-1);
			mostrarProductos();
		}
		return cambio;
	}
	
	
	public ArrayList<Producto> buscarMenores(double limite)
	{
		ArrayList<Producto> productosMenores = new ArrayList<Producto>();
		Celda celdaEncontrada = null;
		for(int i=0; i<celda.size();i++) 
		{
			celdaEncontrada = celda.get(i);
			if(celdaEncontrada.getProducto()!= null) 
			{
				if(celdaEncontrada.getProducto().getPrecio() <= limite) 
				{
					productosMenores.add(celdaEncontrada.getProducto());
				}
			}
		}
		return productosMenores;
		
	}

}
