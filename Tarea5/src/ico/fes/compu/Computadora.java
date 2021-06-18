/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.compu;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author ibiet
 */
public class Computadora {
    
    private int marca;
    private int modelo;
    private Monitor Monitor;
    private CPU CPU;
    private Mouse Mouse;
    private Teclado Teclado;

    public Computadora() {
    }

    public Computadora(int marca, int modelo, Monitor Monitor, CPU CPU, Mouse Mouse, Teclado Teclado) {
        this.marca = marca;
        this.modelo = modelo;
        this.Monitor = Monitor;
        this.CPU = CPU;
        this.Mouse = Mouse;
        this.Teclado = Teclado;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Monitor getMonitor() {
        return Monitor;
    }

    public void setMonitor(Monitor Monitor) {
        this.Monitor = Monitor;
    }

    public CPU getCPU() {
        return CPU;
    }

    public void setCPU(CPU CPU) {
        this.CPU = CPU;
    }

    public Mouse getMouse() {
        return Mouse;
    }

    public void setMouse(Mouse Mouse) {
        this.Mouse = Mouse;
    }

    public Teclado getTeclado() {
        return Teclado;
    }

    public void setTeclado(Teclado Teclado) {
        this.Teclado = Teclado;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", Monitor=" + Monitor + ", CPU=" + CPU + ", Mouse=" + Mouse + ", Teclado=" + Teclado + '}';
    }

    
    
    
    
    
}
