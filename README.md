# Supermercado
## Este es mi proyecto de programacion 1. En este programa se puede manejar el inventario de un supermecado. Este almacena productos segun sus caracteristicas y los guarda en secciones. Su uso mejora mucho el manejo de inventarios y ademas ayuda con el calculo de precio de cada producto.

## Tabla de Contenidos

-[Instalacion](#instalacion)
-[Uso](#uso)
-[Ejemplos](#ejemplos)
-[Contribuciones](#contribuciones)
-[Estructura](#estructura)
-[Licencias](#licencias)

## Instalacion
1. **Clonar repositorio**: 
Este codigo se compila y se ejecuta a traves de una interfaz o de una aplicacion de lector de codigo como VSC.

## Uso
1. **Compilar y ejecutar**:
Para poder usarlo se necesita que se compile el codigo. Tambien se ejecuta. Esto dependera de su forma preferida.

2. **Comandos**:
Cuando se inice el programa se mostrara un menu donde tendra varias opciones.Tendra que elegir el numero correspondiente a cada comando
    -**Añadir Seccion**: Es lo primero que se hace, ya que todos los productos tienen que estar almacenados en una seccion obligatoriamente. Cada seccion solo llevara nombre.
    -**Añadir Producto**: Sirve para poder añadir un producto a una seccion.Cuando se inicie le preguntara en que seccion quiere guardar el producto.De ahi se haran preguntas y se responde con un si/no, hasta que terminen las preguntas y rellenen los datos que pide. Las preguntas serviran para saber que datos se tienen que añadir.Por ultimo, si no ha creado una secccion anteriormente, el programa le preguntara si quiere crear una.
    -**Mostrar secciones**: Este comando le dejara mostrar todos las secciones y productos que haya creado. Los listara en orden de creacion
    -**Borrar Seccion**: Borrar una secccion. Solo se pedira el numero de la seccion.
    -**Borrar Producto**: Este comando borrara segun el nombre del producto. Hay que tener cuidado con la colicion de nombres.
    -**Actualizar Producto**: Este comando permite actualizar el producto segun la caracteristica que se desea cambiar. Se le abrira un menu y si quiere salir, le dara a exit.
    -**Salir**: Para poder salir del programa, pondra exit y se guaradara todos lo que se haya hecho en el programa.
    -**Help**: Se ejecuta para listar los comandos.

## Ejemplos

1.**Añadir Producto**: 
Se mostraran estas preguntas a partir de lo que vayas respondiendo:

Desea añadir un producto? (si/no)
>\si
¿Su producto tiene fecha de caducidad?
>\no
Â¿Su producto es medible?
no

Te mandara a elegir la seccion que se mostrara como a continuacion:

    1.Carniceria
    Nombre: Carne de res Cantidad: 2 Precio kilo(kg): 20.0 Peso:(g) 0.9g Precio: 18.0$ 2023-02-12
    Nombre: Pollo Cantidad: 2 Precio kilo(kg): 20.0 Peso:(g) 0.9g Precio: 15.0$ 2023-02-12

    2.Lavanderia

Seleccione una seccion (numero):
>\1

Te pedira las caracteristicas:

Nombre del Producto
pan
Precio por unidad del Producto
20
Cantidad del Producto
2
Introduzca 'help' para obtener una lista de comandos validos.
?>

Asi se añade un producto.

## Contribuciones

Se puede ayudar a este codigo solucionando errores cuando se lee entradas por pantalla. Hay veces que si pones un tipo diferente al que te pide se ejecutara un error.

## Estructura

La estructura de este programa se puede vizualizar en la imagen png que esta dentro de este proyecto. Se muestra el diseño a traves de un diagrama UML. [UML](UML.png)

## Licencias

Este proyecto está licenciado bajo la licencia Apache 2.0 - vea el archivo [LICENSE](LICENSE) para más detalles.

