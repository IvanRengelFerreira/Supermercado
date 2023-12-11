package dominio;
import java.time.LocalDate;

public class ProductoMedible extends Producto {
   
    private double masa;
    private double precio;
    private double precioKilo;
    private LocalDate fechaCaducidad;

    // Constructor para la clase ProductoMedible con fecha de caducidad, para crear productos que son medibles y con fecha de caducidad
    public ProductoMedible(String nombre, int unidad,double precioKilo, double masa, LocalDate fechaCaducidad){
        super(nombre,unidad);
        this.masa = masa;
        this.precioKilo = precioKilo;
        this.fechaCaducidad = fechaCaducidad;
      
    }

    // Constructor para la clase ProductoMedible sin fecha de caducidad, para crear productos que son medibles pero sin fecha de caducidad
    public ProductoMedible(String nombre, int unidad,double precioKilo, double masa){
        super(nombre,unidad);
        this.masa = masa;
        this.precioKilo = precioKilo;
      
    }

    public ProductoMedible(String nombre){
        super(nombre);
    }
    
    
    /** 
     * @return double
     */
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
        if (fechaCaducidad == null) {
            return super.toString()+ " Precio kilo(kg): " + precioKilo + " Peso:(g) "+masa+"g"+" Precio: "+precio()+"$ ";
         }else
            return super.toString()+ " Precio kilo(kg): " + precioKilo + " Peso:(g) "+masa+"g"+" Precio: "+precio()+"$ "+ fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad){
        this.fechaCaducidad = fechaCaducidad;
    }

    public LocalDate getFechaCaducidad(){
        return this.fechaCaducidad;
    }

    







    

   


}
