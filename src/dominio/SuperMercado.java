package dominio;
import java.util.ArrayList;

/**
 * Esta es la clase SuperMercado que contiene detalles de un supermercado.
 * Un supermercado tiene un nombre y una lista de secciones.
 */
public class SuperMercado {
    private String nombre;
    private ArrayList<Secciones> secciones;

    /**
     * Constructor para la clase SuperMercado.
     * @param nombre El nombre del supermercado.
     */
    public SuperMercado(String nombre){
        this.nombre = nombre;
        this.secciones = new ArrayList<>();
    }

    /**
     * Obtiene el nombre del supermercado.
     * @return El nombre del supermercado.
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Obtiene las secciones del supermercado.
     * @return Las secciones del supermercado.
     */
    public ArrayList<Secciones> getSecciones(){
        return this.secciones;
    }

    /**
     * Establece el nombre del supermercado.
     * @param nombre El nuevo nombre del supermercado.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Establece las secciones del supermercado.
     * @param secciones Las nuevas secciones del supermercado.
     */
    public void setSecciones(Secciones secciones){
        this.secciones = new ArrayList<Secciones>();
    }

    /**
     * Añade una sección al supermercado.
     * @param seccion La sección a añadir.
     */
    public void addSeccion(Secciones seccion){
        this.secciones.add(seccion);
    }

    /**
     * Elimina una sección del supermercado.
     * @param seccion La sección a eliminar.
     */
    public void removeSeccion(Secciones seccion){
        this.secciones.remove(seccion);
    }

    /**
     * Obtiene el tamaño de la lista de secciones del supermercado.
     * @return El tamaño de la lista de secciones.
     */
    public int size(){
        return this.secciones.size();
    }

    /**
     * Obtiene una sección específica del supermercado.
     * @param i El índice de la sección a obtener.
     * @return La sección en el índice especificado.
     */
    public Secciones getSecciones(int i){
        return this.secciones.get(i);
    }

    /**
     * Muestra todas las secciones del supermercado.
     */
    public void mostrarSecciones(){
        for(Secciones s: secciones){
            System.out.println(s);
        }
    }

    public Secciones buscarSecciones(String nombre) {
        for (Secciones s : secciones) {
            if (s.getNombre().equalsIgnoreCase(nombre)) {
                return s;
            }
        }
        return null; 
    }
}