/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p77.reto5.Vista;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.c2.p77.reto5.Modelo.vo.Requerimiento_2;

/**
 *
 * @author cbecerra
 */
public class Req2TM extends AbstractTableModel{

    private ArrayList<Requerimiento_2> requerimiento2;
    
    public Req2TM(){
        this(new ArrayList<>());
    }
    
    public Req2TM (ArrayList<Requerimiento_2> requerimiento2) {
        this.requerimiento2 =requerimiento2;
    }

    public Requerimiento_2 getReq2 (int row) {
        return requerimiento2.get(row);
    }
    
    @Override
    public int getRowCount() {
        return requerimiento2.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Requerimiento_2 requerimiento_2 = requerimiento2.get(row);
        switch (column) {
            case 0:
                return requerimiento_2.getID_MaterialConstruccion();
            case 1:
                return requerimiento_2.getNombre_Material();
            case 2:
                return requerimiento_2.getCantidad();
            case 3:
                return requerimiento_2.getPrecio_Unidad();
            case 4:
                return requerimiento_2.getPrecio_Total();
        }
        return null;
    }
 @Override
    public String getColumnName(int column) {
    
        switch (column) {
            case 0:
                return "ID Material Construcción";
            case 1:
                return "Nombre Material";
            case 2:
                return "Cantidad";
            case 3:
                return "Precio Unidad";
            case 4:
                return "Precio Total";
        }
        return super.getColumnName(column);
    } 
}
