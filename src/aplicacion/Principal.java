package aplicacion;

import presentacion.Interfaz;

/**
 * La clase Principal es la clase principal de la aplicación de gestión de supermercados.
 * Aquí se encuentra el método main que inicia la ejecución del programa.
 */
public class Principal{
    
    /** 
     * El método main es el punto de entrada del programa.
     * Imprime un mensaje de bienvenida y crea una instancia de la clase Interfaz.
     * Luego, lee una petición de ayuda y continúa leyendo y procesando peticiones hasta que se ingrese una petición de salida.
     * 
     * @param args los argumentos de la línea de comandos (no se utilizan en este programa)
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

