package impl.mario.persistencia.horario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import com.mario.modelo.Horario;
import com.mario.persistencia.HorarioDataService;

public class HorarioDAO implements HorarioDataService {
	
	/**
	 * Metodo que accede a la base de datos para recuerar la lista de libros
	 * presentes en la base de datos.
	 */
	public Vector<Horario> getHorarios() throws Exception {
		//Inicializamos el Vector de retorno.
		Vector<Horario> resultado = new Vector<Horario>();

		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
 
		try {
			String SQL_DRV = "org.hsqldb.jdbcDriver";
			String SQL_URL = "jdbc:hsqldb:hsql://localhost/autobusdb";

			//Obtenemos la conexion a la base de datos.
			Class.forName(SQL_DRV);
			con = DriverManager.getConnection(SQL_URL, "MMORANOO", "MIW2018");

			ps = con.prepareStatement("select * from HORARIO");
			rs = ps.executeQuery();

			while (rs.next()) {
				//Completamos los datos del horario en la entidad
				Horario horario = new Horario();
				horario.setHorarioId(rs.getInt("horario_id"));
				horario.setEstacionSalidaId(rs.getInt("estacion_salida_id"));
				horario.setFechaSalida(rs.getDate("fecha_salida"));
				horario.setHoraSalida(rs.getTime("hora_salida"));
				horario.setFechaLlegada(rs.getDate("fecha_llegada"));
				horario.setHoraLlegada(rs.getTime("hora_llegada"));
				//Le ponemos al Vector de resultado
				resultado.add(horario);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		} finally {
			try {
				ps.close();
				con.close();
			} catch (Exception e) {
			}
		}
		//Retornamos el vector de resultado.
		return resultado;
	}
	
	public synchronized void setHorario(Horario horario) throws Exception {

		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;

		try {
			String SQL_DRV = "org.hsqldb.jdbcDriver";
			String SQL_URL = "jdbc:hsqldb:hsql://localhost/autobusdb";

			// We crate the database connection
			Class.forName(SQL_DRV);
			con = DriverManager.getConnection(SQL_URL, "MMORANOO", "MIW2018");

			ps = con.prepareStatement("select max(id) as maximo from horario");
			rs = ps.executeQuery();
			Integer id=0;
			while (rs.next()) {
				 id = rs.getInt("maximo");
			}
			
			System.out.println("Max id found: "+id);
			
			horario.setHorarioId(id);
			//Creamos el horario
			ps = con.prepareStatement("insert into horario values (?,?,?,?,?,?,?)");
			ps.setInt(1, id+1);
			ps.setInt(2, horario.getEstacionSalidaId());
			ps.setInt(3, horario.getEstacionLlegadaId());
			ps.setDate(4, horario.getFechaSalida());
			ps.setTime(5, horario.getHoraSalida());
			ps.setDate(6, horario.getFechaLlegada());
			ps.setTime(7, horario.getHoraLlegada());
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		} finally {
			try {
				ps.close();
				con.close();
			} catch (Exception e) {
			}
		}
	}
}
