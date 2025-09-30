package Ejercicio3;

public class Utilidadestest {
    static void main(String[] args) {

        double a = 10;
        double b = 5;

        System.out.println("Suma: " + Utilidades.sumar(a, b));
        System.out.println("Resta: " + Utilidades.restar(a, b));
        System.out.println("Multiplicación: " + Utilidades.multiplicar(a, b));
        System.out.println("División: " + Utilidades.dividir(a, b));


        System.out.println("División entre 0: " + Utilidades.dividir(a, 0));
    }
}