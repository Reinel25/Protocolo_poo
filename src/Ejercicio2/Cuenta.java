package Ejercicio2;

public class Cuenta {
    private  String numeroCuenta;
    private double saldo;
    public String tipoDeCuenta;

    public Cuenta(String numeroCuenta, double saldo, String TipoCuenta){
        this.numeroCuenta = numeroCuenta;
        setSaldo(saldo);
        this.tipoDeCuenta = TipoCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        if(saldo >= 0){
            this.saldo = saldo;
        }else {
            System.out.println("Error: El saldo no puede ser negativo");
        }
    }

    public void mostrarDetalles(){
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
    }
}
