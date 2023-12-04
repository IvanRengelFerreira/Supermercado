package dominio;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto{

    public ProductoPerecedero(String nombre, String unidad,double precio,LocalDate fechaCaducidad){
        super(nombre,unidad,precio,fechaCaducidad);
    }

    public String toString(){
        return " Unidad: "+ unidad + nombre   + " Precio: " + precio + " Fecha de Caducidad: " + fechaCaducidad;
    }

}
