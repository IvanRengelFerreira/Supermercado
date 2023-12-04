package presentacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Scanner;
import dominio.*;

public class Interfaz {

    private SuperMercado superMercado = new SuperMercado("SuperMercado");
    
    private Scanner sc = new Scanner(System.in);

    public Secciones seleccionarSecciones() {
        for (int i = 0; i < superMercado.size(); i++) {
            System.out.println((i + 1) + ". " + superMercado.getSecciones(i));
        }
        System.out.println("Seleccione una seccion (número): ");
        int eleccion = sc.nextInt() - 1;
        sc.nextLine(); 
        
           
        
        if (eleccion >= 0 && eleccion < superMercado.size()) {
            return superMercado.getSecciones(eleccion);
        } else {
            System.out.println("Selección inválida");
            return null;
        }
    }

    public void anadirProductoS() {
        Secciones seccion = seleccionarSecciones();

        System.out.println("Nombre del articulo");
        String nombre = sc.nextLine();
        System.out.println("Precio del articulo");
        double precio = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.println("Cantidad del articulo");
        String unidad = sc.nextLine();
      
        Producto a = new ProductoSimple(nombre, unidad, precio);
        seccion.addProducto(a);
    }

    public void anadirProductoM() {
        Secciones seccion = seleccionarSecciones();
    
        System.out.println("Nombre del Producto");
        String nombre = sc.nextLine();

        System.out.println("Precio por kilo del Producto");
        double precio = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.println("Cantidad del Producto");
        String unidad = sc.nextLine();

        System.out.println("Masa del Producto (use un punto para decimales)");
        double masa = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.println("Fecha de caducidad");
        System.out.println("Año:");
        int ano = sc.nextInt();
        System.out.println("Mes:");
        int mes = sc.nextInt();
        System.out.println("Dia:");
        int dia = sc.nextInt();
        sc.nextLine(); // consume newline

        LocalDate fechaCaducidad = LocalDate.of(ano, mes, dia);
            
        Producto a = new ProductoMedible(nombre, unidad, precio, masa, fechaCaducidad,0);
        seccion.addProducto(a);
    }
    
    public void anadirProductoP() {
        Secciones seccion = seleccionarSecciones();
        System.out.println("Nombre del articulo");
        String nombre = sc.nextLine();

        System.out.println("Precio del articulo");
        double precio = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.println("Cantidad del articulo");
        String unidad = sc.nextLine();
    
        System.out.println("Fecha de caducidad");

        System.out.println("Año:");
        String ano = sc.nextLine();
        System.out.println("Mes:");
        String mes = sc.nextLine();
        System.out.println("Dia:");
        String dia = sc.nextLine();
    
        LocalDate fechaCaducidad = LocalDate.of(Integer.parseInt(ano), Integer.parseInt(mes), Integer.parseInt(dia));
        Producto a = new ProductoPerecedero(nombre, unidad, precio, fechaCaducidad);
        seccion.addProducto(a);
    }

    public void anadirSecciones() {
        System.out.println("Nombre de la Seccion");
        String nombre = sc.nextLine();
        Secciones s = new Secciones(nombre);
        superMercado.addSeccion(s);
    }

    public boolean procesarPeticion(String peticion) {
        String[] p = peticion.trim().split("\\s+");

        if (p.length > 0) {

            if (p[0].equalsIgnoreCase("1")) {
                anadirSecciones();
            } else if (p[0].equalsIgnoreCase("2")) {
                anadirProductoM();
            } else if (p[0].equalsIgnoreCase("3")) {
                anadirProductoS();
            } else if (p[0].equalsIgnoreCase("4")) {
                anadirProductoP();
            } else if (p[0].equalsIgnoreCase("5")) {
                mostrarSecciones();
            } else if (p[0].equalsIgnoreCase("help")) {
                System.out.println("Menu\n1. Añadir Secciones\n2. Añadir Producto Medible\n3. Añadir Producto Simple\n4. Añadir Producto Perecedero\n5. Mostrar Secciones\nPara salir de la interfaz escriba 'exit'\nSi necesita ayuda en cualquier momento escriba 'help'\nSi necesita ayuda al añadir un producto escriba 'help' + 'numero de la opcion'");
            } else if (p[0].equalsIgnoreCase("help+1")) {
                System.out.println("Las secciones son los distintos pasillos de un supermercado, por ejemplo, fruteria, carniceria, etc.\nEstas solo tendran un nombre que tendras que introducir.\nPara añadir una seccion escriba '1' y siga las instrucciones");
            } else if (p[0].equalsIgnoreCase("help+2")) {
                System.out.println("Los productos medibles son aquellos que se venden por peso, por ejemplo, carne, fruta, etc.\nEstos tendran un nombre, un precio por kilo, una masa y una fecha de caducidad.\nCabe recalcar que en esta opcion no se deberia introducir el precio.\nPara añadir un producto medible escriba '2' y siga las instrucciones");
            } else if (p[0].equalsIgnoreCase("help+3")) {
                System.out.println("Los productos simples son aquellos que se venden por unidad, por ejemplo, un paquete de galletas, un bote de champu, etc.\nEstos tendran un nombre, un precio y una cantidad.\nPara añadir un producto simple escriba '3' y siga las instrucciones");
            } else if (p[0].equalsIgnoreCase("help+4")) {
                System.out.println("Los productos perecederos son aquellos que tienen una fecha de caducidad, por ejemplo, un yogur, leche, etc.\nEstos tendran un nombre, un precio, una cantidad y una fecha de caducidad.\nPara añadir un producto perecedero escriba '4' y siga las instrucciones");
            } else if (p[0].equalsIgnoreCase("exit")) {
                grabar();
                return false;
            } else {
                System.out.println("Peticion erronea");
            }
        } else {
            System.out.println("Peticion erronea");
        }
        // Mostrar ayuda si hubo un error en la petición.
        System.out.println("Introduzca 'help' para obtener una lista de comandos validos.");
        return true;
    }

    public void mostrarSecciones() {
        superMercado.mostrarSecciones();
    }

    public Interfaz() {
        File f = new File("Supermercado.txt");
        try {
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream(f));
            superMercado = (SuperMercado) obj.readObject();
            obj.close();
        } catch (Exception e) {
            superMercado = new SuperMercado("Mi supermercado");
        }
    }
        
    public String leerPeticion() {
        System.out.print("?>");
        String cadena = sc.nextLine();
        return cadena;
    }

    public void grabar() {
        File f = new File("SuperMercado.txt");
        try {
            ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(f));
            obj.writeObject(superMercado);
            obj.close();
            System.out.println("Grabado correctamente");
        } catch (Exception e) {
            System.out.println("Error al grabar");
        }
    }
}

//Hacer la estructura de añadir productos usando if. Esto para poder mejorar la interfaz y que sea mas facil de usar. Tambien recordar lentejas y arroz ya que no se vencen. Falta crear otro metodo de productos no perecibles pero medibles
/*añadirProducto(){
    
    While(peticion != "exit"){

        System.out.println("¿Su producto tiene fecha de caducidad?");
         String peticion = sc.nextLine();
        if(peticion.equalsIgnoreCase("si")){
            
            System.out.println("¿Su producto es medible?");
            peticion = sc.nextLine();
            if(peiticion.equalsIgnoreCase("si")){
                anadirProductoM();
                return true;
            }else{
                anadirProductoP()
                return true;
            }
   
        }else{
            System.out.println("¿Su producto es medible?");
            peticion = sc.nextLine();
            if(peticion.equalsIgnoreCase("si")){
                anadirProductoS();
                return true;
            }else{
                anadirPrrodutoNP();
                return true;

   
    */



   

    

