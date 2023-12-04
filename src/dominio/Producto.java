package dominio;
import java.time.LocalDate;

public abstract class Producto {
    protected String nombre;
    protected String unidad;
    protected double precio;
    protected LocalDate fechaCaducidad;

    public Producto(String nombre, String unidad,double precio, LocalDate fechaCaducidad2){
        this.nombre = nombre;
        this.unidad = unidad;
        this.precio = precio;
        this.fechaCaducidad = fechaCaducidad2;
    }

    public Producto(String nombre, String unidad,double precio){
        this.nombre = nombre;
        this.unidad = unidad;
        this.precio = precio;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getUnidad(){
        return this.unidad;
    }

    public double getPrecio(){
        return this.precio;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setUnidad(String unidad){
        this.unidad = unidad;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad){
        this.fechaCaducidad = fechaCaducidad;
    }

    public LocalDate getFechaCaducidad(){
        return this.fechaCaducidad;
    }

}
