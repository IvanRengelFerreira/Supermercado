package dominio;

public abstract class Producto {
    protected String nombre;
    protected int unidad;
    
    public Producto(String nombre, int unidad){
        this.nombre = nombre;
        this.unidad = unidad;
       
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getUnidad(){
        return this.unidad;
    }

  
   
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setUnidad(int unidad){
        this.unidad = unidad;
    }

    public abstract double precio();
   
}
