
package dominio;
import java.util.ArrayList;


public class SuperMercado {
    

    private String nombre;
    private ArrayList<Secciones> secciones;

    public SuperMercado(String nombre){
        this.nombre = nombre;
        this.secciones = new ArrayList<>();
    }

    public String getNombre(){
        return this.nombre;
    }

    public ArrayList<Secciones> getSecciones(){
        return this.secciones;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setSecciones(Secciones secciones){
        this.secciones = new ArrayList<Secciones>();
    }

    public void addSeccion(Secciones seccion){
        this.secciones.add(seccion);
    }

    public void removeSeccion(Secciones seccion){
        this.secciones.remove(seccion);
    }

    public int size(){
        return this.secciones.size();
    }

    public Secciones getSecciones(int i){
        return this.secciones.get(i);
    }

    public void mostrarSecciones(){
        for(Secciones s: secciones){
            System.out.println(s);
        }
        
        }
    }


    


