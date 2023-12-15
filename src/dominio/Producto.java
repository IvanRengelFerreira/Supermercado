package dominio;

import java.io.Serializable;

/**
 * Esta es la clase abstracta Producto que contiene los detalles de un producto.
 */
/**
 * Clase abstracta que representa un producto.
 * Esta clase proporciona métodos y atributos comunes a todos los productos.
 */
/**
 * The abstract class Producto represents a product.
 * It provides common attributes and methods for all types of products.
 */
public abstract class Producto implements Serializable {
    protected String nombre;
    protected int unidad;
    
    /**
     * Constructor para la clase Producto.
     * @param nombre El nombre del producto.
     * @param unidad La unidad del producto.
     */
    public Producto(String nombre, int unidad){
        this.nombre = nombre;
        this.unidad = unidad;
    }

   
        /**
         * Constructs a new Producto object with the given nombre.
         * 
         * @param nombre the name of the product
         */
    public Producto(String nombre){
            this.nombre = nombre;
    }
    

    /**
     * Obtiene el nombre del producto.
     * @return El nombre del producto.
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Obtiene la unidad del producto.
     * @return La unidad del producto.
     */
    public int getUnidad(){
        return this.unidad;
    }

    /**
     * Sets the unit of the product.
     * 
     * @param unidad the unit of the product
     */
    public void setUnidad(int unidad){
        this.unidad = unidad;
    }

    /**
     * Establece el nombre del producto.
     * @param nombre El nuevo nombre del producto.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Compara este objeto Producto con el objeto especificado para determinar si son iguales.
     * Devuelve true si el objeto especificado también es un objeto Producto y tiene el mismo nombre.
     *
     * @param o el objeto que se va a comparar para determinar si son iguales
     * @return true si este objeto Producto es igual al objeto especificado, false en caso contrario
     */
    @Override
    public boolean equals(Object o){
        Producto p = (Producto)o;
        return nombre.equals(p.nombre);
    }

    /**
     * Devuelve una representación en forma de cadena del objeto.
     * 
     * @return una representación en forma de cadena del objeto.
     */
    @Override
    public String toString(){
        return "Nombre: "+nombre+" Cantidad: "+unidad;
    }

    /**
     * Devuelve el precio del producto.
     *
     * @return el precio del producto.
     */
    public abstract double precio();
}
