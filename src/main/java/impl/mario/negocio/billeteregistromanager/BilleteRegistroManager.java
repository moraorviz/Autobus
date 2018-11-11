package impl.mario.negocio.billeteregistromanager;

import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;

import com.mario.modelo.BilleteRegistro;
import com.mario.modelo.Horario;
import com.mario.negocio.BilleteRegistroManagerService;
import com.mario.persistencia.BilleteRegistroDataService;

public class BilleteRegistroManager implements BilleteRegistroManagerService {
	
	@Autowired
	private BilleteRegistroDataService billeteRegistroDataService = null;

	public void setBilleteRegistroDataService(BilleteRegistroDataService billeteRegistroDataService) {
		System.out.println("Estableciendo la bean de billeteRegistroDataService");
		this.billeteRegistroDataService = billeteRegistroDataService;
	}

	@Override
	public Vector<BilleteRegistro> getBilleteRegistros() throws Exception {
		Vector<BilleteRegistro> registros = billeteRegistroDataService.getBilleteRegistros();
		return registros;
	}

	@Override
	public void setBilleteRegistro(BilleteRegistro billeteRegistro) throws Exception {
		this.billeteRegistroDataService.setBilleteRegistro(billeteRegistro);
	}

	@Override
	public Vector<Horario> getDisponibles(BilleteRegistro billeteRegistro) throws Exception {
		Vector<Horario> horariosDisponibles = billeteRegistroDataService.getDisponibles(billeteRegistro);
		return horariosDisponibles;
	}

	
	
}
