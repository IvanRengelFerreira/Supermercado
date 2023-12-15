package dominio;
import java.util.ArrayList; 
import java.io.Serializable; 
/**
 * La clase Secciones representa una sección en un sistema de gestión de productos.
 * Cada sección tiene un nombre y una lista de productos asociados.
 */
public class Secciones implements Serializable {
    // Atributos de la clase Secciones
    private String nombre;
    private ArrayList<Producto> productos;

    /**
     * Crea una nueva instancia de la clase Secciones con el nombre especificado.
     * @param nombre El nombre de la sección.
     */
    public Secciones(String nombre){
        this.nombre = nombre;
        this.productos = new ArrayList<Producto>();
    }

    /**
     * Obtiene el nombre de la sección.
     * @return El nombre de la sección.
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Obtiene la lista de productos de la sección.
     * @return La lista de productos de la sección.
     */
    public ArrayList<Producto> getProductos(){
        return this.productos;
    }

    /**
     * Establece el nombre de la sección.
     * @param nombre El nuevo nombre de la sección.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Establece la lista de productos de la sección.
     * @param productos La nueva lista de productos de la sección.
     */
    public void setproductos(ArrayList<Producto> productos){
        this.productos = productos;
    }

    /**
     * Agrega un producto a la sección.
     * @param producto El producto a agregar.
     */
    public void addProducto(Producto producto){
        this.productos.add(producto);
    }

    /**
     * Elimina un producto de la sección.
     * @param p El producto a eliminar.
     */
    public void removeProducto(Producto p){
        this.productos.remove(p);
    }

    /**
     * Obtiene el tamaño de la lista de productos de la sección.
     * @return El tamaño de la lista de productos.
     */
    public int size(){
        return this.productos.size();
    }

    /**
     * Obtiene el producto en la posición especificada de la lista de productos.
     * @param i La posición del producto.
     * @return El producto en la posición especificada.
     */
    public Producto getproductos(int i){
        return this.productos.get(i);
    }

    /**
     * Muestra los productos de la sección en la consola.
     */
    public void mostrarproductos(){
        for(Producto p: productos){
            System.out.println(p);
        }
    }
    
    /**
     * Devuelve una representación en cadena de la sección.
     * @return Una representación en cadena de la sección.
     */
    @Override
    public String toString() {
        String result = nombre + "\n";
        for (Producto p : productos) {
            result += p.toString() + "\n";
        }
        return result;
    }

    /**
     * Compara si la sección es igual a otro objeto.
     * @param o El objeto a comparar.
     * @return true si la sección es igual al objeto, false en caso contrario.
     */
    @Override
    public boolean equals(Object o){
        Secciones s = (Secciones)o;
        return nombre.equals(s.nombre);
    }

    /**
     * Busca un producto en la sección por su nombre.
     * @param nombre El nombre del producto a buscar.
     * @return El producto encontrado, o null si no se encuentra.
     */
    public Producto buscarProducto(String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null; 
    }

    /**
     * Obtiene el índice de un producto en la lista de productos de la sección.
     * @param p El producto a buscar.
     * @return El índice del producto, o -1 si no se encuentra.
     */
    public int IndexOf(Producto p) {
        return productos.indexOf(p);
    }
}

      
 
      
        
    

    


