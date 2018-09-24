
package ejerciciorelaciones2;

import java.util.ArrayList;
import java.util.Scanner;



public class EjercicioRelaciones2 {
    public static void main(String[] args) {
        ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
        Banco banco = new Banco("banco1", cuentas);
        Scanner lectura = new Scanner(System.in);
        
        
        Cuenta cuenta2 = new Cuenta(1, 10000, "Cliente_1");
        Cuenta cuenta1 = new Cuenta(2, 0, "Cliente_2");
        
        
        cuenta1.getMovimientos().add(new Movimiento(cuenta1.getSaldo(),200,new Tipo("Retiro")));
        cuenta1.getMovimientos().add(new Movimiento(cuenta1.getSaldo(),250,new Tipo("Consignacion")));
        cuenta2.getMovimientos().add(new Movimiento(cuenta2.getSaldo(),300,new Tipo("Retiro")));
        cuenta2.getMovimientos().add(new Movimiento(cuenta2.getSaldo(),500,new Tipo("Consignacion")));
        banco.getCuentas().add(cuenta2);
        banco.getCuentas().add(cuenta1);
        
        System.out.println("Bienvenido");
        System.out.println("Para transaccion, presione 1");
        System.out.println("Para ver cuentas actuales y sus movimientos, presione 2");
        
        int opcion = lectura.nextInt();
        
        if(opcion==2){
          banco.mostrarCuentas();
          System.out.println("Gracias por usar nuestro servicio ");
           System.exit(0);
        }
        if(opcion==1){
            System.out.print("Digite el numero de cuenta: ");
            double numero = lectura.nextDouble();
            
            
            for(int i=0; i<banco.getCuentas().size(); i++){
                
                if(banco.getCuentas().get(i).getNum_cuenta()==numero){
                    System.out.println("Bienvenido, "+banco.getCuentas().get(i).getNombre_cliente());
                    while(true){
                        System.out.println("Para realizar una consignacion, presione 1. ");
                        System.out.println("Para realizar un retiro, presione 2. ");
                        int tipo = lectura.nextInt();
                        if(tipo==1){
                            System.out.print("Digite la cantidad a consignar: ");
                            double cantidad = lectura.nextDouble();
                            if(cantidad>0){
                                banco.getCuentas().get(i).getMovimientos().add(new Movimiento(banco.getCuentas().get(i).getSaldo(), cantidad, new Tipo("Consignacion")));
                                banco.getCuentas().get(i).crearConsignacion(banco.getCuentas().get(i).getSaldo(), cantidad);
                            }
                            else{
                                System.out.print("Cantidad no valida");
                            }

                        }
                        if(tipo==2){
                            System.out.print("Digite la cantidad a retirar: ");
                            double cantidad = lectura.nextDouble();
                            if(cantidad>0){
                                if(cantidad>banco.getCuentas().get(i).getSaldo()){
                                System.out.println("Saldo insuficiente.");
                                }
                            else{
                                banco.getCuentas().get(i).getMovimientos().add(new Movimiento( banco.getCuentas().get(i).getSaldo(), cantidad, new Tipo("Retiro")));
                                banco.getCuentas().get(i).crearRetiro(banco.getCuentas().get(i).getSaldo(), cantidad);
                                }
                            }   
                        }
                        if(tipo!=1 && tipo!=2){
                        System.out.println("Transaccion invalida");
                        System.out.println("Gracias por usar nuestro servicio "+banco.getCuentas().get(i).getNombre_cliente());
                        break;
                        }
                        System.out.println("Transaccion completada. Su saldo actual es "+banco.getCuentas().get(i).getSaldo());
                        System.out.println("Presione 1 para realizar otra transaccion. ");
                        System.out.println("Presione cualquier otro numero para salir. ");
                        int eleccion = lectura.nextInt();
                        if(eleccion==1){
                            continue;
                        }
                        if(eleccion!=1){
                            System.out.println("Gracias por usar nuestro servicio "+banco.getCuentas().get(i).getNombre_cliente());
                            System.exit(0);
                        }
                    }
                    
                    
                }if(banco.getCuentas().get(i).getNum_cuenta()!=numero-1){
                System.out.println("La cuenta ingresada no existe dentro de este banco");
                System.out.println("Gracias por usar nuestro servicio");
                System.exit(0);
                }
            }
        }else{
        System.out.println("Operacion invalida");
        System.out.println("Saque la tarjeta e intente nuevamente.");
        }
        
        
    }
}

