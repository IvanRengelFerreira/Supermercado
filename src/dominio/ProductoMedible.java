package dominio;
import java.time.LocalDate;

/**
 * Representa un producto medible que puede tener un peso y un precio por kilogramo.
 * Extiende la clase base Producto.
 */
public class ProductoMedible extends Producto {
   // Atributos de la clase ProductoMedible
    private double masa;
    private double precio;
    private double precioKilo;
    private LocalDate fechaCaducidad;

    // Constructor para ProductoMedible con fecha de caducidad, se utiliza para crear productos medibles con fecha de caducidad
    public ProductoMedible(String nombre, int unidad, double precioKilo, double masa, LocalDate fechaCaducidad){
        super(nombre, unidad);
        this.masa = masa;
        this.precioKilo = precioKilo;
        this.fechaCaducidad = fechaCaducidad;
    }

    // Constructor para ProductoMedible sin fecha de caducidad, se utiliza para crear productos medibles sin fecha de caducidad
    public ProductoMedible(String nombre, int unidad, double precioKilo, double masa){
        super(nombre, unidad);
        this.masa = masa;
        this.precioKilo = precioKilo;
    }

    /**
     * Constructor para ProductoMedible con solo el parámetro de nombre.
     * Se utiliza para crear un objeto ProductoMedible con solo el nombre especificado.
     * @param nombre El nombre del ProductoMedible.
     */
    public ProductoMedible(String nombre){
        super(nombre);
    }
    
    /**
     * Devuelve el peso del ProductoMedible.
     * @return El peso del ProductoMedible.
     */
    public double getMasa(){
        return this.masa;
    }   

    /**
     * Devuelve el precio por kilogramo del ProductoMedible.
     * @return El precio por kilogramo del ProductoMedible.
     */
    public double getPrecioKilo(){
        return precioKilo;
    }

    /**
     * Establece el precio por kilogramo del ProductoMedible.
     * @param precioKilo El precio por kilogramo a establecer.
     */
    public void setPrecioKilo(double precioKilo){
        this.precioKilo = precioKilo;
    }

    /**
     * Establece el peso del ProductoMedible.
     * @param masa El peso a establecer.
     */
    public void setMasa(double masa){
        this.masa = masa;
    }   

    /**
     * Calcula y devuelve el precio del ProductoMedible basado en su peso y precio por kilogramo.
     * @return El precio del ProductoMedible.
     */
    public double precio(){
        precio = precioKilo * masa;	
        return precio;
    }

    /**
     * Devuelve una representación en forma de cadena del objeto ProductoMedible.
     * Si la fecha de caducidad es nula, solo incluye el nombre, el precio por kilogramo, el peso y el precio.
     * Si la fecha de caducidad no es nula, también incluye la fecha de caducidad.
     * @return Una representación en forma de cadena del objeto ProductoMedible.
     */
    @Override
    public String toString(){
        if (fechaCaducidad == null) {
            return super.toString()+ " Precio kilo(kg): " + precioKilo + " Peso:(g) "+masa+"g"+" Precio: "+precio()+"$ ";
         }else
            return super.toString()+ " Precio kilo(kg): " + precioKilo + " Peso:(g) "+masa+"g"+" Precio: "+precio()+"$ "+ fechaCaducidad;
    }

    /**
     * Establece la fecha de caducidad del ProductoMedible.
     * @param fechaCaducidad La fecha de caducidad a establecer.
     */
    public void setFechaCaducidad(LocalDate fechaCaducidad){
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * Devuelve la fecha de caducidad del ProductoMedible.
     * @return La fecha de caducidad del ProductoMedible.
     */
    public LocalDate getFechaCaducidad(){
        return this.fechaCaducidad;
    }
}
