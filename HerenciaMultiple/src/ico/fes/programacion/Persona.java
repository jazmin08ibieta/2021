/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.programacion;

/**
 *
 * @author ibiet
 */
public class Persona {
    private String nomre;
    private int nombre;

    public Persona() {
    }

    public Persona(String nomre, int nombre) {
        this.nomre = nomre;
        this.nombre = nombre;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public String getNomre() {
        return nomre;
    }

    public void setNomre(String nomre) {
        this.nomre = nomre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nomre=" + nomre + ", nombre=" + nombre + '}';
    }
    
    public void dormir(){
        System.out.println(this.nombre + "Esta durmiendo");
    }
    
    public void comer(){
        System.out.println(this.nombre + "Esta comiendo");
    }
}
