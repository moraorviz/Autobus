package impl.mario.persistencia.billeteregistro;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import com.mario.modelo.BilleteRegistro;
import com.mario.modelo.Estacion;
import com.mario.modelo.Horario;
import com.mario.persistencia.BilleteRegistroDataService;

public class BilleteRegistroDAO implements BilleteRegistroDataService {

	@Override
	public Vector<BilleteRegistro> getBilleteRegistros() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBilleteRegistro(BilleteRegistro billeteRegistro) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vector<Horario> getDisponibles(BilleteRegistro billeteRegistro) throws Exception {
		
		//Inicializamos el Vector de retorno.
		Vector<Horario> resultado = new Vector<Horario>();

		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
 
		try {
			String SQL_DRV = "org.hsqldb.jdbcDriver";
			String SQL_URL = "jdbc:hsqldb:hsql://localhost/autobusdb";

			//Obtenemos la conexionn a la base de datos.
			Class.forName(SQL_DRV);
			con = DriverManager.getConnection(SQL_URL, "MMORANOO", "MIW2018");

			ps = con.prepareStatement("select * from HORARIO WHERE estacion_salida_id = ? AND estacion_llegada_id = ? AND fecha_salida = ?");
			ps.setInt(1, billeteRegistro.getEstacionSalidaId());
			ps.setInt(2, billeteRegistro.getEstacionLlegadaId());
			ps.setDate(3, Date.valueOf(billeteRegistro.getFechaSalida().toLocalDate()));
			rs = ps.executeQuery();

			while (rs.next()) {
				//Completamos los datos de la en la entidad
				Horario horario = new Horario();
				horario.setHorarioId(rs.getInt("horario_id"));
				horario.setEstacionSalidaId(rs.getInt("estacion_salida_id"));
				horario.setEstacionLlegadaId(rs.getInt("estacion_llegada_id"));
				horario.setFechaLlegada(rs.getDate("fecha_llegada"));
				horario.setFechaSalida(rs.getDate("fecha_salida"));
				horario.setHoraLlegada(rs.getTime("hora_llegada"));
				horario.setHoraSalida(rs.getTime("hora_salida"));
				//La a�adimos al Vector de resultado
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

}
