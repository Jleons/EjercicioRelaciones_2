
package ejerciciorelaciones2;

import java.util.ArrayList;

public class Cuenta {
    private int num_cuenta;
    private double saldo;
    private String nombre_cliente;
    private ArrayList<Movimiento> movimientos;

    public Cuenta(int num_cuenta, double saldo, String nombre_cliente) {
        this.num_cuenta= num_cuenta;
        this.saldo = saldo;
        this.nombre_cliente = nombre_cliente;
        this.movimientos = new ArrayList<Movimiento>();
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    

    public double getSaldo() {
        return saldo;
    }


    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
    
    public void crearConsignacion(double saldo, double cantidad){
        this.saldo= saldo+cantidad;
    }
    
    public void crearRetiro(double saldo, double cantidad){
        this.saldo= saldo-cantidad;
    }
}

