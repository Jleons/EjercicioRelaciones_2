
package ejerciciorelaciones2;

import java.util.ArrayList;

public class Banco {
    private String codigo;
    private ArrayList<Cuenta> cuentas;

    public Banco(String codigo, ArrayList<Cuenta> cuentas) {
        this.codigo = codigo;
        this.cuentas = cuentas;
    }

    public String getCodigo() {
        return codigo;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    public void mostrarCuentas(){
        System.out.println("Cuentas: ");
        for(int i=0; i<cuentas.size(); i++){
            System.out.println("Cuenta N°"+(i+1));
            System.out.println("-------------------");
            System.out.println("Propietario:"+cuentas.get(i).getNombre_cliente());
            System.out.println("Numero Cuenta:"+cuentas.get(i).getNum_cuenta());
            System.out.println("Saldo:"+cuentas.get(i).getSaldo());
            System.out.println("-------------------");
            System.out.println("Movimientos: ");
            for (int j=0; j<cuentas.get(i).getMovimientos().size(); j++){
                
                System.out.println("Cantidad" + cuentas.get(i).getMovimientos().get(j).getCantidad());
                
                if(cuentas.get(i).getMovimientos().get(j).getTipo().getNum_transaccion().equals("Consignacion")){
                    System.out.println("El saldo era " + (cuentas.get(i).getMovimientos().get(j).getSaldo()-cuentas.get(i).getMovimientos().get(j).getCantidad()));
                }
                if(cuentas.get(i).getMovimientos().get(j).getTipo().getNum_transaccion().equals("Retiro")){
                    System.out.println("El saldo era " + (cuentas.get(i).getMovimientos().get(j).getSaldo()+cuentas.get(i).getMovimientos().get(j).getCantidad()));
                }
                
                System.out.println("La transaccion fue un(a) " + cuentas.get(i).getMovimientos().get(j).getTipo().getNum_transaccion());
                System.out.println(" ");
               
                
            }
            
            
        }
    }
    
}
