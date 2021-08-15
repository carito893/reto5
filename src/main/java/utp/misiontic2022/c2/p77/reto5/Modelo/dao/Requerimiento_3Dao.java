package utp.misiontic2022.c2.p77.reto5.Modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p77.reto5.Modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p77.reto5.Util.JDBCUtilities;


public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        ArrayList<Requerimiento_3> requerimiento3 = new ArrayList<>();

        String sql = "SELECT C.ID_Proyecto, p.Ciudad, p.Clasificacion, "
        +"SUM(C.Cantidad*mc.Precio_Unidad) AS Costo_Proyecto "
        +"FROM Compra C, Proyecto p "
        +"JOIN MaterialConstruccion mc "
        +"ON mc.ID_MaterialConstruccion = C.ID_MaterialConstruccion "
        +"AND C.ID_Proyecto = p.ID_Proyecto "
        +"WHERE p.Ciudad IN ('Salento', 'Armenia') "
        +"GROUP BY C.ID_Proyecto "
        +"HAVING Costo_Proyecto > 85000 "
        +"ORDER BY p.Ciudad, p.Clasificacion";
        
        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
         ) {
            while (rs.next()) {
                Requerimiento_3 requerimiento_3 = new Requerimiento_3();

                requerimiento_3.setID_Proyecto(rs.getInt("ID_Proyecto"));
                requerimiento_3.setCiudad(rs.getString("Ciudad"));
                requerimiento_3.setClasificacion(rs.getString("Clasificacion"));
                requerimiento_3.setCosto_Proyecto(rs.getInt("Costo_Proyecto"));

                requerimiento3.add(requerimiento_3);


            }    
        }
        return requerimiento3;
    }    
}
