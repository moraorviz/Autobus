package impl.mario.presentacion.sacarbillete;

import com.mario.modelo.BilleteRegistro;

public class CestaCompra {
	
	private BilleteRegistro cestaCompra;

	public CestaCompra()
	{
		System.out.println("Inicializando CestaCompra");
	}
	
	public String toString()
	{
		return cestaCompra.toString();
	}
	
}
