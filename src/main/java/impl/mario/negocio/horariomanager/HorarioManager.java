package impl.mario.negocio.horariomanager;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;

import com.mario.modelo.Horario;
import com.mario.negocio.HorarioManagerService;
import com.mario.persistencia.HorarioDataService;

public class HorarioManager implements HorarioManagerService {
	
	@Autowired
	private HorarioDataService horarioDataService = null;

	public void setHorarioDataService(HorarioDataService horarioDataService) {
		System.out.println("Estableciendo la bean del horarioDataService");
		this.horarioDataService = horarioDataService;
	}

	@Override
	public Vector<Horario> getHorarios() throws Exception {
		Vector<Horario> horarios = horarioDataService.getHorarios();
		return horarios;
	}

	@Override
	public void setHorario(Horario horario) throws Exception {
		this.horarioDataService.setHorario(horario);
	}

	@Override
	public ArrayList<Horario> generarDatosTest() throws Exception {
		
		int estacionSalida;
		int estacionLlegada;
		long minDay = LocalDate.now().toEpochDay();
		long maxDay = LocalDate.of(2018, 12, 31).toEpochDay();
		long randomDay;
		LocalDate randomDate;
		Date date;
		Time horaSalida = Time.valueOf("15:00:00");
		Time horaLlegada = Time.valueOf("20:00:00");
		Random random = new Random();
		ArrayList<Horario> horariosArray = new ArrayList<Horario>();
		
		for (int i=1; i<11; i++) 
		{
			estacionSalida = random.nextInt(10);
			estacionLlegada = random.nextInt(10);
			randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
			randomDate = LocalDate.ofEpochDay(randomDay);
			date = Date.valueOf(randomDate);
			if (estacionSalida==estacionLlegada) {
				break;
			}
			horariosArray.add(new Horario(estacionLlegada, estacionSalida, date, date, horaSalida, horaLlegada));
		}
		
		return horariosArray;
	}
	
	

}
