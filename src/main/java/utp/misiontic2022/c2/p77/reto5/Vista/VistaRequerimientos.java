package utp.misiontic2022.c2.p77.reto5.Vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p77.reto5.Controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p77.reto5.Modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p77.reto5.Modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p77.reto5.Modelo.vo.Requerimiento_3;



public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try {
            ArrayList<Requerimiento_1> registroRequerimiento_1 = controlador.consultarRequerimiento1();
            
            for (Requerimiento_1 req1 : registroRequerimiento_1){
                System.out.printf("%s %s %d\n",
                    req1.getLider(),
                    req1.getCargo(),
                    req1.getProyectos()
                );
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
            ArrayList<Requerimiento_2> registroRequerimiento_2 = controlador.consultarRequerimiento2();
            
            for (Requerimiento_2 req2 : registroRequerimiento_2){
                System.out.printf("%d %s %d %d %d \n",
                    req2.getID_MaterialConstruccion(),
                    req2.getNombre_Material(),
                    req2.getCantidad(),
                    req2.getPrecio_Unidad(),
                    req2.getPrecio_Total()
                );
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            ArrayList<Requerimiento_3> registroRequerimiento_3 = controlador.consultarRequerimiento3();
            
            for (Requerimiento_3 req3 : registroRequerimiento_3){
                System.out.printf("%d %s %s %d \n",
                    req3.getID_Proyecto(),
                    req3.getCiudad(),
                    req3.getClasificacion(),
                    req3.getCosto_Proyecto()
                );
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}

