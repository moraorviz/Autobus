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
		
		for (int i=0; i<100; i++) 
		{
			estacionSalida = random.nextInt(11);
			estacionLlegada = getRandomWithExclusion(random, 1, 10, estacionSalida);
			randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
			randomDate = LocalDate.ofEpochDay(randomDay);
			date = Date.valueOf(randomDate);
			
			horariosArray.add(new Horario(estacionLlegada, estacionSalida, date, date, horaSalida, horaLlegada));
		}
		
		return horariosArray;
	}
	
	public static int getRandomWithExclusion(Random rnd, int start, int end, int... exclude) {
	    int random = start + rnd.nextInt(end - start + 1 - exclude.length);
	    for (int ex : exclude) {
	        if (random < ex) {
	            break;
	        }
	        random++;
	    }
	    return random;
	}
	
	

}
