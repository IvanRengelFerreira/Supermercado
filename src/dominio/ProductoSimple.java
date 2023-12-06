package dominio;

import java.time.LocalDate;

/**
 * Esta es la clase ProductoSimple que extiende la clase Producto.
 * Contiene detalles de un producto simple, incluyendo su precio por unidad y fecha de caducidad.
 */
public class ProductoSimple extends Producto {
    private double precio;
    private double precioUnidad;
    private LocalDate fechaCaducidad;

    /**
     * Constructor para la clase ProductoSimple.
     * @param nombre El nombre del producto.
     * @param unidad La unidad del producto.
     * @param precioUnidad El precio por unidad del producto.
     */
    public ProductoSimple(String nombre, int unidad, double precioUnidad) {
        super(nombre, unidad);
        this.precioUnidad = precioUnidad;
    }

    /**
     * Constructor sobrecargado para la clase ProductoSimple que incluye la fecha de caducidad.
     * @param nombre El nombre del producto.
     * @param unidad La unidad del producto.
     * @param precioUnidad El precio por unidad del producto.
     * @param fechaCaducidad La fecha de caducidad del producto.
     */
    public ProductoSimple(String nombre, int unidad, double precioUnidad, LocalDate fechaCaducidad) {
        super(nombre, unidad);
        this.precioUnidad = precioUnidad;
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * Obtiene el precio por unidad del producto.
     * @return El precio por unidad del producto.
     */
    public double getPrecioUnidad() {
        return precioUnidad;
    }

    /**
     * Establece el precio por unidad del producto.
     * @param precioUnidad El nuevo precio por unidad del producto.
     */
    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    /**
     * Calcula y devuelve el precio del producto.
     * @return El precio del producto.
     */
    public double precio() {
        precio = precioUnidad * unidad;
        return precio;
    }

    /**
     * Devuelve una representación en cadena del producto.
     * @return Una cadena que representa el producto.
     */
    public String toString() {
        if (fechaCaducidad == null) {
            return super.toString()+ " Precio: " + precio() + " Precio por unidad: " + precioUnidad;
        }
        return super.toString()+ " Precio: " + precio() + " Precio por unidad: " + precioUnidad + " Fecha de caducidad: " + fechaCaducidad;
    }

    /**
     * Establece la fecha de caducidad del producto.
     * @param fechaCaducidad La nueva fecha de caducidad del producto.
     */
    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * Obtiene la fecha de caducidad del producto.
     * @return La fecha de caducidad del producto.
     */
    public LocalDate getFechaCaducidad() {
        return this.fechaCaducidad;
    }
}