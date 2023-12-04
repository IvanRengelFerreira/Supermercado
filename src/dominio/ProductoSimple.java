package dominio;

public  class ProductoSimple extends Producto{
    
    public ProductoSimple(String nombre, String unidad,double precio){
        super(nombre,unidad,precio);
    }

    public String toString(){
        return nombre + " Unidad: " + unidad + " Precio: " + precio;
    }

    

}
