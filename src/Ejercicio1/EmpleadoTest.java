package Ejercicio1;

public class EmpleadoTest {
    static void main(String[] args) {

        Empleado e = new Empleado("Reinel", 1500);

        System.out.println("Salario inicial: " + e.getSalario());

        e.setSalario(2000);
        System.out.println("Salario final: " + e.getSalario());

        e.setSalario(-500);
        System.out.println("Despues del intento invalido: " + e.getSalario());
    }
}
