/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package samueljimenezmazas;

import javax.swing.JOptionPane;

/**
 *
 * @author sjimmaz322 <sjimmaz322@g.educaand.es>
 */
public class ParteB {

    /*
    Modifica el ejercicio anterior para que la lectura de datos y la salida por pantalla usen diálogos JOptionPane.
    Además, en esta parte, se debe preguntar cuánto se va a cobrar por reparación cada día de la semana (double) y luego preguntar cuántas
    reparaciones se han hecho cada día (int). Una vez leídos los datos, calcula lo que se cobra cada día y al final de la semana,
    guardando los datos en tipos float.
    Usa un text block, limitando la salida a 1 decimal, para usarlo en un JOptionPane que muestre la información de salida.
    Guarda el resultado de evaluar si se ha cobrado al final de la semana más de 1000€, mostrando el resultado por consola.
     */
    public static void main(String[] args) {
        //Creamos las variables y constantes necesarias
        final float EVALUACIONDEBENEFICIO = 1000f;

        double precioReparacionLunes, precioReparacionMartes, precioReparacionMiercoles, precioReparacionJueves, precioReparacionViernes;

        int reparacionesLunes, reparacionesMartes, reparacionesMiercoles, reparacionesJueves, reparacionesViernes, reparacionesTotales;

        float beneficioLunes, beneficioMartes, beneficioMiercoles, beneficioJueves, beneficioViernes, totalSemanal;

        //Preguntamos el precio de cada día guardándo el resultado en un String
        //que declaramos e inicializamos en la misma linea
        String precioLunesTxt = JOptionPane.showInputDialog("¿Cuánto cuesta hacer una reparación el lunes?");

        //Convertimos el precio a double mediante Double.parseDouble(String s);
        precioReparacionLunes = Double.parseDouble(precioLunesTxt);

        //Preguntamos por la cantidad de reparaciones que se hicieron el lunes, igual que hicimos con el precio
        //de las reparaciones en lunes
        String reparacionesLunesTxt = JOptionPane.showInputDialog("¿Cuántas reparaciones se hicieron el lunes?");

        //Convertimos el número de reparaciones a int mediante el Integer.parseInteger(String s);
        reparacionesLunes = Integer.parseInt(reparacionesLunesTxt);

        //Seguimos el mismo patrón con el resto de días de la semana
        String precioMartesTxt = JOptionPane.showInputDialog("¿Cuánto cuesta hacer una reparación el martes?");
        precioReparacionMartes = Double.parseDouble(precioMartesTxt);
        String reparacionesMartesTxt = JOptionPane.showInputDialog("¿Cuántas reparaciones se hicieron el martes?");
        reparacionesMartes = Integer.parseInt(reparacionesMartesTxt);

        //Miércoles
        String precioMiercolesTxt = JOptionPane.showInputDialog("¿Cuánto cuesta hacer una reparación el miércoles?");
        precioReparacionMiercoles = Double.parseDouble(precioMiercolesTxt);
        String reparacionesMiercolesTxt = JOptionPane.showInputDialog("¿Cuántas reparaciones se hicieron el miércoles?");
        reparacionesMiercoles = Integer.parseInt(reparacionesMiercolesTxt);

        //Jueves
        String precioJuevesTxt = JOptionPane.showInputDialog("¿Cuánto cuesta hacer una reparación el jueves?");
        precioReparacionJueves = Double.parseDouble(precioJuevesTxt);
        String reparacionesJuevesTxt = JOptionPane.showInputDialog("¿Cuántas reparaciones se hicieron el jueves?");
        reparacionesJueves = Integer.parseInt(reparacionesJuevesTxt);

        //Para el viernes hacemos el proceso haciendo la conversión sin necesidad de utilizar una variable extra
        //Dentro del Double.parse colocamos el JOption que nos devuelve el String con la información introducida
        precioReparacionViernes = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto cuesta hacer una reparación el viernes?"));
        //Hacemos el mismo método con el número de reparaciones realizadas el viernes
        reparacionesViernes = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas reparaciones se hicieron el viernes?"));

        //Guardamos el total de reparaciones en su variable
        reparacionesTotales = reparacionesLunes + reparacionesMartes + reparacionesMiercoles + reparacionesJueves + reparacionesViernes;

        //Calculamos el beneficio de cada día mediante la cuenta de ( número de reparaciones * precio reparación de ese día )
        //Sin olvidarnos de hacer el casting a float el precio de la reparación ya que lo guardamos en double
        beneficioLunes = reparacionesLunes * (float) precioReparacionLunes;
        beneficioMartes = reparacionesMartes * (float) precioReparacionMartes;
        beneficioMiercoles = reparacionesMiercoles * (float) precioReparacionMiercoles;
        beneficioJueves = reparacionesJueves * (float) precioReparacionJueves;
        beneficioViernes = reparacionesViernes * (float) precioReparacionViernes;

        //Guardamos el beneficio total en su variable
        totalSemanal = beneficioLunes + beneficioMartes + beneficioMiercoles + beneficioJueves + beneficioViernes;

        //Comprobamos si hemos alcanzado o no el objetivo semanal que esperábamos
        //Declarando una variable boolean e inicializándola según se haya o no cumplido el objetivo
        boolean consecucionDeObjetivo = (totalSemanal >= EVALUACIONDEBENEFICIO);
        //Usamos un operador terciario para decir con un mensaje personalizado si el objetivo ha sido conseguido o no
        String objetivoConseguido = consecucionDeObjetivo ? "El objetivo ha sido conseguido" : "No se ha conseguido el objetivo semanal";

        //Creamos el String que guardará un textblock con los datos de cada día y el total semanal
        String resultado = """
                           El resumen semanal de nuestra tienda PCRoto es:
                           Se han realizado un total de %d reparaciones, dando un beneficio de %.1f €.
                           
                           El desglose semanal de nuestra tienda sería el siguiente:
                           
                           Habiendo tenido el lunes %d reparaciones que a %.1f € por reparación dan un total de %.1f €.
                           Habiendo tenido el martes %d reparaciones que a %.1f € por reparación dan un total de %.1f €.
                           Habiendo tenido el miércoles %d reparaciones que a %.1f € por reparación dan un total de %.1f €.
                           Habiendo tenido el jueves %d reparaciones que a %.1f € por reparación dan un total de %.1f €.
                           Habiendo tenido el viernes %d reparaciones que a %.1f € por reparación dan un total de %.1f €.
                           """.formatted(reparacionesTotales, totalSemanal,
                reparacionesLunes, precioReparacionLunes, beneficioLunes,
                reparacionesMartes, precioReparacionMartes, beneficioMartes,
                reparacionesMiercoles, precioReparacionMiercoles, beneficioMiercoles,
                reparacionesJueves, precioReparacionJueves, beneficioJueves,
                reparacionesViernes, precioReparacionViernes, beneficioViernes
        );

        //Imprimimos por una ventana el resultado
        JOptionPane.showMessageDialog(null, resultado);

        //Imprimimos si hemos conseguido alcanzar el objetivo semanal de 1000€ o no por consola, tanto en booleano como en String
        System.out.println("¿Hemos conseguido alcanzar el objetivo semanal de 1000€? --> " + consecucionDeObjetivo);
        System.out.println("¿Hemos conseguido alcanzar el objetivo semanal de 1000€? --> " + objetivoConseguido);

    }

}
