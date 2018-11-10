package impl.mario.persistencia.estacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import com.mario.modelo.Estacion;
import com.mario.persistencia.EstacionDataService;

public class EstacionDAO implements EstacionDataService {
	
	/**
	 * Metodo que accede a la base de datos para recuerar la lista de libros
	 * presentes en la base de datos.
	 */
	public Vector<Estacion> getEstaciones() throws Exception {
		//Inicializamos el Vector de retorno.
		Vector<Estacion> resultado = new Vector<Estacion>();

		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
 
		try {
			String SQL_DRV = "org.hsqldb.jdbcDriver";
			String SQL_URL = "jdbc:hsqldb:hsql://localhost/autobusdb";

			//Obtenemos la conexionn a la base de datos.
			Class.forName(SQL_DRV);
			con = DriverManager.getConnection(SQL_URL, "MMORANOO", "MIW2018");

			ps = con.prepareStatement("select * from ESTACION");
			rs = ps.executeQuery();

			while (rs.next()) {
				//Completamos los datos del Libro en la entidad
				Estacion estacion = new Estacion();
				estacion.setEstacionId(rs.getInt("estacion_id"));
				estacion.setNombre(rs.getString("nombre"));
				//La a�adimos al Vector de resultado
				resultado.add(estacion);
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
