/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancohierro;

/**
 *
 * @author dahia
 */
public class Cuenta {
    
    private int nroCuenta;
    private int saldo;

    public Cuenta() {
    }

    public Cuenta(int nroCuenta, int saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public void agregarSaldo(int valor){
        this.saldo += valor;
    }
    public void retirarSaldo(int valor){
        this.saldo -= valor;
    }
    
    
    
}
