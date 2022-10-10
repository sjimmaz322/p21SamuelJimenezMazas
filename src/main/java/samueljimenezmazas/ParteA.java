/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package samueljimenezmazas;

import java.util.Scanner;

/**
 *
 * @author sjimmaz322 <sjimmaz322@g.educaand.es>
 */
public class ParteA {

    /*
    La tienda PCRoto se dedica a reparar dispositivos portátiles.
    De lunes a viernes reparan un montón de ordenadores y como son una tienda low cost, cobran lo mismo por todas las reparaciones.
    La idea es que tu programa ayude a los dueños de la tienda a saber cuánto han cobrado cada día y al final de la semana,
    suponiendo que todas las reparaciones cuestan 32.6€ (double) y todas las semanas trabajan de lunes a viernes (5 días). 
    Una vez leídos los datos del número de reparaciones que hay cada día (de lunes a viernes)
    se deben mostrar los datos de lo que se ha cobrado cada día (float) y al final de la semana (float).
    Ten en cuenta que se debe limitar la salida por consola a 3 números decimales.
    En esta parte todos los datos deben leerse por teclado usando Scanner y mostrarse usando la consola.
     */
    public static void main(String[] args) {
        //Creamos el objeto de la clase Scanner para introducir los datos
        Scanner sc = new Scanner(System.in);

        //Creamos las variables y constantes necesarias
        final double PRECIOREPARACION = 32.6;

        int reparacionesLunes, reparacionesMartes, reparacionesMiercoles, reparacionesJueves, reparacionesViernes, reparacionesTotales;

        float beneficioLunes, beneficioMartes, beneficioMiercoles, beneficioJueves, beneficioViernes, totalSemanal;

        //Comenzamos pidiendo el número de ventas por cada día
        System.out.println("Introduza cuantas reparaciones se hicieron el lunes");
        reparacionesLunes = sc.nextInt();
        System.out.println("Introduza cuantas reparaciones se hicieron el martes");
        reparacionesMartes = sc.nextInt();
        System.out.println("Introduza cuantas reparaciones se hicieron el miércoles");
        reparacionesMiercoles = sc.nextInt();
        System.out.println("Introduza cuantas reparaciones se hicieron el jueves");
        reparacionesJueves = sc.nextInt();
        System.out.println("Introduza cuantas reparaciones se hicieron el viernes");
        reparacionesViernes = sc.nextInt();

        //Guardamos la suma del total de reparaciones
        reparacionesTotales = reparacionesLunes + reparacionesMartes + reparacionesMiercoles + reparacionesJueves + reparacionesViernes;

        //Ahora calculamos cuanto dinero ganamos cada día
        //Tenemos que convertir la constante PRECIOREPARACION de double a float para tener los resultados en float
        //lo podemos hacer mediante el Float.parseFloat(); o mediante el uso de (float) antes de la variable
        beneficioLunes = reparacionesLunes * (float) PRECIOREPARACION;
        beneficioMartes = reparacionesMartes * (float) PRECIOREPARACION;
        beneficioMiercoles = reparacionesMiercoles * (float) PRECIOREPARACION;
        beneficioJueves = reparacionesJueves * (float) PRECIOREPARACION;
        beneficioViernes = reparacionesViernes * (float) PRECIOREPARACION;

        //Guardamos el total de beneficios de la semana en la variable que creamos para ello
        totalSemanal = beneficioLunes + beneficioMartes + beneficioMiercoles + beneficioJueves + beneficioViernes;

        //Hacemos un String que guardaremos el textblock para imprimir los resultados
        String resultado = """
                           El balance semanas de PCRoto es el siguiente:
                           Durante la semana se han realizado un total de %d reparaciones, lo cual teniendo las
                           reparaciones a un coste de %.2f €, da un total de %.3f € de beneficio.
                           
                           Detallamos la semana:
                           
                           El lunes se realizaron %d reparaciones, dando un beneficio de %.3f.
                           El martes se realizaron %d reparaciones, dando un beneficio de %.3f.
                           El miércoles se realizaron %d reparaciones, dando un beneficio de %.3f.
                           El jueves se realizaron %d reparaciones, dando un beneficio de %.3f.
                           El viernes se realizaron %d reparaciones, dando un beneficio de %.3f.
                           """.formatted(reparacionesTotales, PRECIOREPARACION, totalSemanal,
                reparacionesLunes, beneficioLunes, reparacionesMartes, beneficioMartes,
                reparacionesMiercoles, beneficioMiercoles, reparacionesJueves, beneficioJueves,
                reparacionesTotales, beneficioViernes);

        //Imprimimos por consola el resultado
        System.out.println(resultado);

    }

}
