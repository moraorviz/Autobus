package impl.mario.negocio.billeteregistromanager;

import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;

import com.mario.modelo.BilleteRegistro;
import com.mario.modelo.Horario;
import com.mario.negocio.BilleteRegistroManagerService;

public class BilleteRegistroManagerEJBService implements BilleteRegistroManagerService {
	
	@Autowired
	private BilleteRegistroManager billeteRegistroManager = null;

	public void setBilleteRegistroManager(BilleteRegistroManager billeteRegistroManager) {
		System.out.println("Estableciendo la bean de billeteRegistroManager");
		this.billeteRegistroManager = billeteRegistroManager;
	}
	
	@Override
	public Vector<BilleteRegistro> getBilleteRegistros() throws Exception {
		Vector<BilleteRegistro> registros = billeteRegistroManager.getBilleteRegistros();
		return registros;
	}

	@Override
	public void setBilleteRegistro(BilleteRegistro billeteRegistro) throws Exception {
		this.billeteRegistroManager.setBilleteRegistro(billeteRegistro);
	}

	@Override
	public Vector<Horario> getDisponibles(BilleteRegistro billeteRegistro) throws Exception {
		Vector<Horario> disponibles = this.billeteRegistroManager.getDisponibles(billeteRegistro);
		return disponibles;
	}

}
