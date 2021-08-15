/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p77.reto5.Vista;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

import utp.misiontic2022.c2.p77.reto5.Modelo.vo.Requerimiento_1;
//import utp.misiontic2022.c2.p77.reto5.Modelo.dao.Requerimiento_1Dao;
//import utp.misiontic2022.c2.p77.reto5.Modelo.vo.Requerimiento_1;

/**
 *
 * @author cbecerra
 */
public class Req1TM extends AbstractTableModel {
    
    private ArrayList<Requerimiento_1> requerimiento1;

    public Req1TM(){
        this(new ArrayList<>());
    }

    public Req1TM (ArrayList<Requerimiento_1> requerimiento1) {
        this.requerimiento1 =requerimiento1;
    }

    //public void setReq1(int row, Requerimiento_1 requerimiento_1){
    //    requerimiento1.set(row, Requerimiento_1);
    //}
    public Requerimiento_1 getReq1 (int row) {
        return requerimiento1.get(row);
    }
    @Override
    public int getRowCount (){
        return requerimiento1.size();
    }
    @Override
    public int getColumnCount (){
        return 3;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Requerimiento_1 requerimiento_1 = requerimiento1.get(row);
        switch (column) {
            case 0:
                return requerimiento_1.getLider();
            case 1:
                return requerimiento_1.getCargo();
            case 2:
                return requerimiento_1.getProyectos();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
    
        switch (column) {
            case 0:
                return "Lider";
            case 1:
                return "Cargo";
            case 2:
                return "# Proyectos";
        }
        return super.getColumnName(column);
    }
}
