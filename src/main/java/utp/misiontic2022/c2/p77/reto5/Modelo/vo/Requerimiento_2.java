package utp.misiontic2022.c2.p77.reto5.Modelo.vo;

public class Requerimiento_2 {
    private int ID_MaterialConstruccion;
    private String Nombre_Material;
    private int Cantidad;
    private int Precio_Unidad;
    private int Precio_Total;
       
    public Requerimiento_2() {
    }
    
    public int getID_MaterialConstruccion() {
        return ID_MaterialConstruccion;
    }
    public void setID_MaterialConstruccion(int iD_MaterialConstruccion) {
        ID_MaterialConstruccion = iD_MaterialConstruccion;
    }
    public String getNombre_Material() {
        return Nombre_Material;
    }
    public void setNombre_Material(String nombre_Material) {
        Nombre_Material = nombre_Material;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
    public int getPrecio_Unidad() {
        return Precio_Unidad;
    }
    public void setPrecio_Unidad(int precio_Unidad) {
        Precio_Unidad = precio_Unidad;
    }
    public int getPrecio_Total() {
        return Precio_Total;
    }
    public void setPrecio_Total(int precio_Total) {
        Precio_Total = precio_Total;
    }
}
