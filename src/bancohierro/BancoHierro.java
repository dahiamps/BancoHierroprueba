/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancohierro;

import java.util.Scanner;

/**
 *
 * @author dahia
 */
public class BancoHierro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        int i = 0;
        String nombre, apellido;
        int cedula, saldo;
        boolean bandera;
        Cliente datos = new Cliente();

        System.out.println("Bienvend@");

        System.out.println("Digita tu nombre");
        datos.setNombre(nombre = leer.next());
        System.out.println("Digita tu apellido");
        datos.setApellido(apellido = leer.next());
        System.out.println("Digita tu cedula");
        datos.setNroCedula(cedula = leer.nextInt());

        Cuenta[] datosCuenta = new Cuenta[5];

        System.out.println("Hola Sr(a) " + datos.getNombre() + " " + datos.getApellido() + "\n");
        System.out.println("Que operacion quieres realizar\n");

        int opcion;
        do {
            System.out.println("\n1. Crear cuenta");
            System.out.println("2. Consultar todas mis cuentas");
            System.out.println("3. Consignar dinero a una cuenta");
            System.out.println("4. Retirar dinero de una cuenta");
            System.out.println("5. Consultar saldo de una cuenta");
            System.out.println("6. Salir\n");

            System.out.println("Digite una opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    if (i < datosCuenta.length) {
                        datosCuenta[i] = new Cuenta();
                        int numero = (int) (Math.random() * 1000 + 100);
                        datosCuenta[i].setNroCuenta(numero);
                        System.out.println("Sr(a). "+datos.getNombre()+" "+datos.getApellido()+" Digite el saldo inicial para la cuenta: " + datosCuenta[i].getNroCuenta());
                        datosCuenta[i].setSaldo(saldo = leer.nextInt());
                        i++;
                    } else {
                        System.out.println("\"Sr(a). "+datos.getNombre()+" "+datos.getApellido()+" ya no se pueden agregar mas cuentas"+"\n");
                    }
                    break;
                case 2:
                     for (int j = 0; j < datosCuenta.length; j++) {
                        if (datosCuenta[j] == null) {
                            System.out.print("");
                        } else {
                            System.out.print("["+datosCuenta[j].getNroCuenta() + "] - ");
                        }

                    }
                    break;
                case 3:
                    System.out.println("Sr(a). "+datos.getNombre()+" "+datos.getApellido()+" digita el numero de cuenta");
                    int cuentaBuscada = leer.nextInt();
                    bandera = false;
                    int posicion = 0;
                    for (int j = 0; j < datosCuenta.length; j++) {
                        //int data = datosCuenta[j].getNroCuenta();
                        //if (cuentaBuscada == data) {
                            
                            if(datosCuenta[j].getNroCuenta()==cuentaBuscada){
                            
                            bandera = true;
                            posicion = j;
                            //System.out.println("" + datosCuenta[j].getNroCuenta());
                            break;
                        } 

                    }
                    if (bandera == true) {
                        System.out.println("Sr(a). "+datos.getNombre()+" "+datos.getApellido()+" ingresa el valor a consignar");
                        int valor = leer.nextInt();
                        datosCuenta[posicion].agregarSaldo(valor);
                        System.out.println("Sr(a). "+datos.getNombre()+" "+datos.getApellido()+" la consignacion se ha realizado con exito\n");
                    }
                    break;
                case 4:
                    System.out.println("Sr(a). "+datos.getNombre()+" "+datos.getApellido()+" digita el numero de cuenta");
                    int cuentaBuscada2 = leer.nextInt();
                    bandera = false;
                    int posicion2 = 0;
                    for (int j = 0; j < datosCuenta.length; j++) {
                        int data = datosCuenta[j].getNroCuenta();
                        if (cuentaBuscada2 == data) {
                            bandera = true;
                            posicion2 = j;
                            //System.out.println("" + datosCuenta[j].getNroCuenta());
                            break;
                        } 

                    }
                    if (bandera == true) {
                        System.out.println("Sr(a). "+datos.getNombre()+" "+datos.getApellido()+" ingresa el valor a retirar");
                        int valor = leer.nextInt();
                        if (valor > datosCuenta[posicion2].getSaldo()) {
                            System.err.println("Saldo insuficiente");
                        } else {
                            datosCuenta[posicion2].retirarSaldo(valor);
                            System.out.println("El retiro se ha realizado con exito\n");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Sr(a). "+datos.getNombre()+" "+datos.getApellido()+" digita el numero de cuenta");
                    int cuentaBuscada3 = leer.nextInt();
                    bandera = false;
                    int posicion3 = 0;
                    for (int j = 0; j < datosCuenta.length; j++) {
                        int data = datosCuenta[j].getNroCuenta();
                        if (cuentaBuscada3 == data) {
                            bandera = true;
                            posicion3 = j;
                            //System.out.println("" + datosCuenta[j].getNroCuenta());
                            break;
                        }else{
                            System.out.print("");
                        } 

                    }
                    if (bandera == true) {
                        System.out.println("Sr(a). "+datos.getNombre()+" "+datos.getApellido()+" el saldo registrado en la cuenta nro " + datosCuenta[posicion3].getNroCuenta() + " es: $" + datosCuenta[posicion3].getSaldo()+"\n");
                    }
                    break;
                case 6:
                    System.out.println("Hasta luego Sr(a). "+datos.getNombre()+" "+datos.getApellido());
                    System.exit(0);
                    break;
            }

        } while (opcion != 6);

    }

}
