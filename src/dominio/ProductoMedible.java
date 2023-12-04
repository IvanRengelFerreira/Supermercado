package dominio;
import java.time.LocalDate;

public  class ProductoMedible extends Producto {
   
    private double masa;
    private double precio;
    private double precioKilo;

    public ProductoMedible(String nombre, String unidad,double precioKilo, double masa, LocalDate fechaCaducidad, double precio){
        super(nombre,unidad,precio,fechaCaducidad);
        this.masa = masa;
        this.precioKilo = precioKilo;
      
    }

    public ProductoMedible(String nombre, String unidad,double precioKilo, double masa, double precio){
        super(nombre,unidad,precio);
        this.masa = masa;
        this.precioKilo = precioKilo;
      
    }

    public double getMasa(){
        return this.masa;
    }   

    public double getPrecioKilo(){
        return precioKilo;
    }


    public void setMasa(double masa){
        this.masa = masa;
    }   

    
    public double precio(){
        precio = precioKilo * masa;	
        return precio;
    }

    public String toString(){
        return unidad +"" + nombre + " Precio kilo(kg): " + precioKilo + "Peso:(g) "+masa+ " Precio(euros): "+precio()+" "+ fechaCaducidad;
    }






    

   


}
