package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda  celda1;
	private Celda  celda2;
	private Celda  celda3;
	private Celda  celda4;
	private double saldo;

	public Celda getCelda1() {
		return celda1;
	}
	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}
	public Celda getCelda2() {
		return celda2;
	}
	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}
	public Celda getCelda3() {
		return celda3;
	}
	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}
	public Celda getCelda4() {
		return celda4;
	}
	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void configurarMaquina(String codigo1,String codigo2,String codigo3,String codigo4) 
	{
		celda1 = new Celda(codigo1);
		celda2 = new Celda(codigo2);
		celda3 = new Celda(codigo3);
		celda4 = new Celda(codigo4);
	} 
	public void mostrarConfiguracion() 
	{
		System.out.println("Celda 1: "+celda1.getCodigo());
		System.out.println("Celda 2: "+celda2.getCodigo());
		System.out.println("Celda 3: "+celda3.getCodigo());
		System.out.println("Celda 4: "+celda4.getCodigo());
		System.out.println("Saldo : "+saldo);
	}
	public Celda buscarCelda(String codigo) 
	{
		if (celda1.getCodigo()== codigo) 
		{
			return celda1;
		}else if(celda2.getCodigo()== codigo) 
		{
			return celda2;
		}else if(celda3.getCodigo()==codigo) 
		{
			return celda3;
		}else if(celda4.getCodigo()==codigo) 
		{
			return celda4;
		}else 
		{
			return null;
		}
	}
	public void cargarProducto(Producto producto,String codigo,int cantidadItems) 
	{
		Celda celdaRecuperada;
		celdaRecuperada = buscarCelda(codigo);
		if(celdaRecuperada == null) 
		{
			System.out.println("No existe el codigo de celda");
		}else {
			celdaRecuperada.ingresarProducto(producto, cantidadItems);
			
		}
		
	}
	public void mostrarProductos() 
	{
		System.out.println("Celda 1");
		System.out.println("El codigo de la celda: "+celda1.getCodigo());
		if(celda1.getProducto()==null) 
		{
			System.out.println("No existe el producto");
			System.out.println("-------------------------------------");
		}else 
		{
			System.out.println("El nombre del producto: "+celda1.getProducto().getNombre());
			System.out.println("El precio del producto: "+celda1.getProducto().getPrecio());
			System.out.println("El codigo del producto: "+celda1.getProducto().getCodigo());
			System.out.println("El stock actual es: "+celda1.getStock());
			System.out.println("------------------------");
			
		}
		System.out.println("Celda 2");
		System.out.println("El codigo de la celda: "+celda2.getCodigo());
		if(celda2.getProducto()==null) 
		{
			System.out.println("No existe el producto");
			System.out.println("-------------------------------------");
		}else 
		{
			System.out.println("El nombre del producto: "+celda2.getProducto().getNombre());
			System.out.println("El precio del producto: "+celda2.getProducto().getPrecio());
			System.out.println("El codigo del producto: "+celda2.getProducto().getCodigo());
			System.out.println("El stock actual es: "+celda2.getStock());
			System.out.println("-------------------------------------");
						
		}
		System.out.println("Celda 3");
		System.out.println("El codigo de la celda: "+celda3.getCodigo());
		if(celda3.getProducto()==null) 
		{
			System.out.println("No existe el producto");
			System.out.println("-------------------------------------");
		}else 
		{
			System.out.println("El nombre del producto: "+celda3.getProducto().getNombre());
			System.out.println("El precio del producto: "+celda3.getProducto().getPrecio());
			System.out.println("El codigo del producto: "+celda3.getProducto().getCodigo());
			System.out.println("El stock actual es: "+celda3.getStock());
			System.out.println("-----------------------------------------");			
		}
		
		System.out.println("Celda 4");
		System.out.println("El codigo de la celda: "+celda4.getCodigo());
		if(celda4.getProducto()==null) 
		{
			System.out.println("No existe el producto");
			System.out.println("-------------------------------------");
		}else 
		{
			System.out.println("El nombre del producto: "+celda4.getProducto().getNombre());
			System.out.println("El precio del producto: "+celda4.getProducto().getPrecio());
			System.out.println("El codigo del producto: "+celda4.getProducto().getCodigo());
			System.out.println("El stock actual es: "+celda4.getStock());
			
			System.out.println("------------");
						
		}
		System.out.println("El saldo actual es: "+ saldo);
		
	}
	public Producto buscarProductoEnCelda(String codigo) 
	{
		Celda celdaBuscada = buscarCelda(codigo);
		if(celdaBuscada == null) 
		{
			return null;
		}else 
		{
			return celdaBuscada.getProducto();
		}
	}
	public double consultarPrecio(String codigo) 
	{
		Celda celdaBuscada = buscarCelda(codigo);
		if(celdaBuscada == null) 
		{
			return 0;
		}else 
		{
			return celdaBuscada.getProducto().getPrecio();
		}
		
	}
	public Celda buscarCeldaProducto(String codigo)
	{
		
		if (celda1.getProducto()!= null && celda1.getProducto().getCodigo()== codigo) 
		{
			return celda1;
		}else if(celda2.getProducto()!=null && celda2.getProducto().getCodigo()== codigo) 
		{
			return celda2;
		}else if(celda3.getProducto()!=null && celda3.getProducto().getCodigo()==codigo) 
		{
			return celda3;
		}else if(celda4.getProducto()!=null && celda4.getProducto().getCodigo()==codigo) 
		{
			return celda4;
		}else 
		{
			return null;
		}
	}
	public void incrementarProductos(String codigo,int cantidadItems)
	{
		Celda celdaEncontrada= buscarCeldaProducto(codigo);
		if(celdaEncontrada == null) 
		{
			System.out.println("No existe el codigo del producto");
		}else 
		{
			celdaEncontrada.setStock(celdaEncontrada.getStock() +cantidadItems);
		}
		
	}
	public void vender(String codigo) 
	{
		Celda celdaVendida = buscarCelda(codigo);
		if(celdaVendida==null) 
		{
			System.out.println("El codigo de la celda esta incorrecto");
		}else {
			celdaVendida.setStock(celdaVendida.getStock()-1);
			saldo=saldo+celdaVendida.getProducto().getPrecio();
			mostrarProductos();
		}
		
	}
	public double venderConCambio(String codigo,double pago) 
	{
		Celda celdaVendida = buscarCelda(codigo);
		double cambio = 0;
		if(celdaVendida==null) 
		{
			System.out.println("El codigo de la celda esta incorrecto");
		}else {
			celdaVendida.setStock(celdaVendida.getStock()-1);
			cambio=pago-celdaVendida.getProducto().getPrecio();
			saldo=saldo+celdaVendida.getProducto().getPrecio();
			mostrarProductos();
		}
		return cambio;
	}
	

}
