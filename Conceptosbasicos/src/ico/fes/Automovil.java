/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes;

import java.awt.Color;

/**
 *
 * @author ibiet
 */
public class Automovil {
    private String marca;
    private String subMarca;
    private int modelo;
    private Color color;

    public Automovil() {
    }

    public Automovil(String marca, String subMarca, int modelo, Color color) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public int getModelo() {
        return modelo;
    }

    public Color getColor() {
        return color;
    }


    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", subMarca=" + subMarca + ", modelo=" + modelo + ", color=" + color + '}';
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setColor(Color color) {
        this.color = color;
    }
        
    
}
