package dominio;

/**
 * Esta es la clase abstracta Producto que contiene los detalles de un producto.
 */
public abstract class Producto {
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

    public boolean equals(Object o){
        Producto p = (Producto)o;
        return nombre.equals(p.nombre);
    }

    public String toString(){
        return "Nombre: "+nombre+" Cantidad: "+unidad;
    }

    public abstract double precio();
}
