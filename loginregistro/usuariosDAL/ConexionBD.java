package loginregistro.usuariosDAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author chris
 */
public class ConexionBD {

    //Declaracion e inicializacion de variables
    Connection conectarbd = null;
    String url = "jdbc:mysql://localhost:3306/gestionusuarios";
    String username = "root";
    String password = "Chris#2006";

    public ConexionBD() {
        try {
            conectarbd = DriverManager.getConnection(url, username, password);
            System.out.println("La conexion ha sido realizada con exito");

        } catch (Exception e) {

            System.out.println("El intento de conexion ha fracasado" + e.getMessage());

        }
    }

    // Método para ejecutar una sentencia SQL en la base de datos y manejar posibles errores.
    public int ejecutarSentenciaSQL(String strSentenciaSQL) {
        try {
            PreparedStatement pstm = conectarbd.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;

        } catch (SQLException e) {
            System.out.println(e);
            return 0;

        }
    }

    //Metodo para realizar una consulta
    public ResultSet consultarRegistros(String strSentenciaSQL) {
        //Devuelve una informacion
        try {
            PreparedStatement pstm = conectarbd.prepareStatement(strSentenciaSQL);
            

            ResultSet respuesta = pstm.executeQuery();
            return respuesta;

        } //validar que esa informacion exista o no
        catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }

}
