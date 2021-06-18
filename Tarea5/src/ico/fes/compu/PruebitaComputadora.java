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
public class PruebitaComputadora {
    public static void main(String[] args) {
      Computadora comp= new Computadora(65, 03, new Monitor("Samsung", "UHD", 28), new CPU("hewlett-packard", "Desktop HP 280", 3), new Mouse("HP", "HP Mouse 200", "Inalambrico"), new Teclado("HP", "Inalambrico", 102, 9));
        System.out.println(comp);
    }
    
}
