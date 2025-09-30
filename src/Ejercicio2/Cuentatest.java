package Ejercicio2;

public class Cuentatest {
    static void main(String[] args) {
        Cuenta c1 = new Cuenta("000745", 5000.0, "Ahorros");
        c1.mostrarDetalles();

        System.out.println("Saldo actual: " + c1.getSaldo());

        c1.setSaldo(-200);
        c1.setSaldo(7000);

        System.out.println("Numero de cuenta (con getter): " + c1.getNumeroCuenta());
    }
}
