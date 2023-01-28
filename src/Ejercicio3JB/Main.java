package Ejercicio3JB;

public class Main {
    public static void main(String[] args) {
       /*En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola. Tened en cuenta que los textos pueden venir de un array de tipo String.
       Por ejemplo:String[] nombres = {"", "", "", ""}

        //Solucion 1
        String[] nombres = {"roberto","pedro","marcos"};
        StringBuilder listadoDeNombres = new StringBuilder();
        for(String nombre:nombres){
        listadoDeNombres.append(nombre).append(" ");
        }
        System.out.println(listadoDeNombres);*/

        //solucion 2
        String[] nombres2 = {"pepe","jose","carlos"};
        String cadenaNombres = "";
        for(String nombre:nombres2){
            cadenaNombres = cadenaNombres.concat(nombre + " ");
        }
        System.out.println(cadenaNombres);
    }
}