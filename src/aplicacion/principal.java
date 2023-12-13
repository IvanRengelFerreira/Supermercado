package aplicacion;

import presentacion.Interfaz;

public class Principal{
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido a la aplicación de gestión de supermercados.\nAca podra añadir secciones, productos y realizar operaciones con ellos.\nSi necesita ayuda con informacion sobre los comandos, introduzca 'help'");
        Interfaz interfaz = new Interfaz();
        String peticion;
        interfaz.procesarPeticion("help");
         interfaz.leer();
        do {
            peticion=interfaz.leerPeticion();
        } while (interfaz.procesarPeticion(peticion));
    }
}

