package dominio;

import java.time.LocalDate;

public  class ProductoSimple extends Producto{
    private double precio;
    private double precioUnidad;
    private LocalDate fechaCaducidad;

    public ProductoSimple(String nombre, int unidad,double precioUnidad){
        super(nombre,unidad);
        this.precioUnidad = precioUnidad;
    }

    public ProductoSimple(String nombre, int unidad,double precioUnidad, LocalDate fechaCaducidad){
        super(nombre,unidad);
        this.precioUnidad = precioUnidad;
        this.fechaCaducidad = fechaCaducidad;
    }

    public double getPrecioUnidad(){
        return precioUnidad;
    }   

    public void setPrecioUnidad(double precioUnidad){
        this.precioUnidad = precioUnidad;
    }

    public double precio(){
        precio = precioUnidad * unidad;	
        return precio;
    }

    public String toString(){
        return nombre + " Unidad: " + unidad + " Precio: " + precio + " Precio por unidad: " + precio();
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad){
        this.fechaCaducidad = fechaCaducidad;
    }

    public LocalDate getFechaCaducidad(){
        return this.fechaCaducidad;
    }   
    

    

}
