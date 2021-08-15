package utp.misiontic2022.c2.p77.reto5.Modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p77.reto5.Modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p77.reto5.Util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        ArrayList<Requerimiento_2> requerimiento2 = new ArrayList<>();

        String sql = "SELECT mc.ID_MaterialConstruccion, mc.Nombre_Material,"
        +" Cantidad, mc.Precio_Unidad, Cantidad*mc.Precio_Unidad AS 'Precio_Total' "
        +"FROM Compra "
        +"INNER JOIN MaterialConstruccion mc "
        +"ON mc.ID_MaterialConstruccion = Compra.ID_MaterialConstruccion "
        +"WHERE ID_Proyecto IN (19,24,37,39,58,63) "
        +"ORDER BY ID_Proyecto, mc.Precio_Unidad DESC; ";
        
        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
         ) {
            while (rs.next()) {
                Requerimiento_2 requerimiento_2 = new Requerimiento_2();

                requerimiento_2.setID_MaterialConstruccion(rs.getInt("ID_MaterialConstruccion"));
                requerimiento_2.setNombre_Material(rs.getString("Nombre_Material"));
                requerimiento_2.setCantidad(rs.getInt("Cantidad"));
                requerimiento_2.setPrecio_Unidad(rs.getInt("Precio_Unidad"));
                requerimiento_2.setPrecio_Total(rs.getInt("Precio_Total"));

                requerimiento2.add(requerimiento_2);
            }    
        }
        return requerimiento2;
    }        

}