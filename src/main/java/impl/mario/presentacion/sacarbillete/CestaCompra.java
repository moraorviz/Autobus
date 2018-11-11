package impl.mario.presentacion.sacarbillete;

import java.util.HashMap;

import com.mario.modelo.BilleteRegistro;

public class CestaCompra {

	public CestaCompra()
	{
		System.out.println("Inicializando CestaCompra");
	}
	
	private HashMap<BilleteRegistro,Integer> cart = new HashMap<BilleteRegistro,Integer>();
	
	public void add(BilleteRegistro billeteRegistro, Integer units)
	{
		if ( cart.get(billeteRegistro) == null )
		{
			cart.put(billeteRegistro, 0);
		}
		
		cart.put(billeteRegistro, cart.get(billeteRegistro) + units);
	}
	
	public String toString()
	{
		return cart.keySet().toString();
	}
	
}
