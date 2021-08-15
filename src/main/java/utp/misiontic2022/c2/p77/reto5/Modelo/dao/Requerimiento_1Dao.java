package utp.misiontic2022.c2.p77.reto5.Modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p77.reto5.Modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p77.reto5.Util.JDBCUtilities;



public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        ArrayList<Requerimiento_1> requerimiento1 = new ArrayList<>();

        String sql = "SELECT Nombre || ' ' || Primer_Apellido as 'Lider',"
                    +"Cargo, COUNT(Proyecto.ID_Lider) AS 'Proyectos' "
                    +"FROM Lider "
                    +"JOIN Proyecto "
                    +"ON Proyecto.ID_Lider = Lider.ID_Lider "
                    +"WHERE Constructora = 'Edificios y Edificios' "
                    +"GROUP BY Lider, Cargo "
                    +"ORDER BY Cargo, Lider";
        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
         ) {
            while (rs.next()) {
                Requerimiento_1 requerimiento_1 = new Requerimiento_1();

                requerimiento_1.setLider(rs.getString("Lider"));
                requerimiento_1.setCargo(rs.getString("Cargo"));
                requerimiento_1.setProyectos(rs.getInt("Proyectos"));

                requerimiento1.add(requerimiento_1);
            }    
        }
        return requerimiento1;
    }
}
