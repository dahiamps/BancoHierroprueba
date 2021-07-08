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
public class Cliente {

    private String nombre;
    private String apellido;
    private int nroCedula;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int nroCedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroCedula = nroCedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNroCedula() {
        return nroCedula;
    }

    public void setNroCedula(int nroCedula) {
        this.nroCedula = nroCedula;
    }
    
    
    
}
