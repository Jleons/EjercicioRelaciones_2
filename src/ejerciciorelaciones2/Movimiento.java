
package ejerciciorelaciones2;

public class Movimiento {
    
    private double saldo_anterior;
    private double cantidad;
    private Tipo tipo;

    public Movimiento(double saldo_anterior, double cantidad, Tipo tipo) {
        
        this.saldo_anterior = saldo_anterior;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }
    
  

    public double getSaldo() {
        return saldo_anterior;
    }

    public double getCantidad() {
        return cantidad;
    }

 

    public void setSaldo(double saldo_anterior) {
        this.saldo_anterior = saldo_anterior;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Tipo getTipo() {
        return tipo;
    }
    
}
