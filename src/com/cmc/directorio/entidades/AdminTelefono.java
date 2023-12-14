package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono tel) 
	{
		if(tel.getOperadora()== "movi") 
		{
			tel.setTieneWhatsapp(true);
		}
	}
	public int contarMovi(Telefono telf1,Telefono telf2,Telefono telf3) 
	{
		int ntelefono=0;
		if(telf1.getOperadora()=="movi" && telf2.getOperadora() == "movi" && telf3.getOperadora() == "movi" ) 
		{
			ntelefono=ntelefono+3;
		}else if(telf1.getOperadora()=="movi" && telf2.getOperadora() == "movi") 
		{
			ntelefono=ntelefono+2;
		}else if(telf1.getOperadora()=="movi" && telf3.getOperadora() == "movi") 
		{
			ntelefono=ntelefono+2;
		}else if(telf2.getOperadora()=="movi" && telf3.getOperadora() == "movi")
		{
			ntelefono=ntelefono+2;
		}else if(telf1.getOperadora() == "movi")
		{
			ntelefono=ntelefono+1;
		}else if(telf2.getOperadora() == "movi")
		{
			ntelefono=ntelefono+1;
		}else if(telf3.getOperadora()==  "movi")
		{
			ntelefono=ntelefono+1;
		}
		return ntelefono;
	}
	public int contarClaro(Telefono telf1,Telefono telf2,Telefono telf3,Telefono telf4) 
	{
		int ntelefono=0;
		if(telf1.getOperadora()=="claro" && telf2.getOperadora() == "claro" && telf3.getOperadora() == "claro" && telf4.getOperadora()=="claro") 
		{
			ntelefono=ntelefono+4;
		}else if(telf1.getOperadora()=="claro" && telf2.getOperadora() == "claro" && telf3.getOperadora() == "claro" ) 
		{
			ntelefono=ntelefono+3;
		}else if(telf1.getOperadora()=="claro" && telf2.getOperadora() == "claro" && telf4.getOperadora() == "claro" ) 
		{
			ntelefono=ntelefono+3;
		}else if(telf1.getOperadora()=="claro" && telf3.getOperadora() == "claro" && telf4.getOperadora() == "claro" ) 
		{
			ntelefono=ntelefono+3;
		}else if(telf2.getOperadora()=="claro" && telf3.getOperadora() == "claro" && telf4.getOperadora() == "claro" ) 
		{
			ntelefono=ntelefono+3;
		}else if(telf1.getOperadora()=="claro" && telf2.getOperadora() == "claro") 
		{
			ntelefono=ntelefono+2;
		}else if(telf1.getOperadora()=="claro" && telf3.getOperadora() == "claro") 
		{
			ntelefono=ntelefono+2;
		}else if(telf1.getOperadora()=="claro" && telf4.getOperadora() == "claro")
		{
			ntelefono=ntelefono+2;
		}else if(telf2.getOperadora()=="claro" && telf3.getOperadora() == "claro") 
		{
			ntelefono=ntelefono+2;
		}else if(telf2.getOperadora()=="claro" && telf4.getOperadora() == "claro") 
		{
			ntelefono=ntelefono+2;
		}else if(telf3.getOperadora()=="claro" && telf4.getOperadora() == "claro")
		{
			ntelefono=ntelefono+2;
		}else if(telf1.getOperadora() == "claro")
		{
			ntelefono=ntelefono+1;
		}else if(telf2.getOperadora() == "claro")
		{
			ntelefono=ntelefono+1;
		}else if(telf3.getOperadora()==  "claro")
		{
			ntelefono=ntelefono+1;
		}else if(telf4.getOperadora()==  "claro")
		{
			ntelefono=ntelefono+1;
		}
		return ntelefono;
	}

}
