/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p77.reto5.Vista;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.c2.p77.reto5.Modelo.vo.Requerimiento_3;

/**
 *
 * @author cbecerra
 */
public class Req3TM extends AbstractTableModel{
    private ArrayList<Requerimiento_3> requerimiento3;

    public Req3TM(){
        this(new ArrayList<>());
    }
    
    public Req3TM (ArrayList<Requerimiento_3> requerimiento3) {
        this.requerimiento3 =requerimiento3;
    }

    public Requerimiento_3 getReq3 (int row) {
        return requerimiento3.get(row);
    }
 
    @Override
    public int getRowCount() {
        return requerimiento3.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Requerimiento_3 requerimiento_3 = requerimiento3.get(row);
        switch (column) {
            case 0:
                return requerimiento_3.getID_Proyecto();
            case 1:
                return requerimiento_3.getCiudad();
            case 2:
                return requerimiento_3.getClasificacion();
            case 3:
                return requerimiento_3.getCosto_Proyecto();
            case 4:
        }
        return null;    
    }
    
    @Override
    public String getColumnName(int column) {
    
        switch (column) {
            case 0:
                return "ID Proyecto";
            case 1:
                return "Ciudad";
            case 2:
                return "Clasificación";
            case 3:
                return "Costo Proyecto";
        }
        return super.getColumnName(column);
    } 
}

