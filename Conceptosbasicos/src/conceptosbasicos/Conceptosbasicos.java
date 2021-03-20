/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptosbasicos;

import ico.fes.Automovil;
import java.awt.Color;

/**
 *
 * @author ibiet
 */
public class Conceptosbasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil miBocho= new Automovil();
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.blue);
        System.out.print(miBocho);
        
        Automovil miAcura= new Automovil();
        miAcura.setMarca("Acura");
        miAcura.setSubMarca("NSX");
        miAcura.setModelo(2013);
        miAcura.setColor(Color.gray);
        System.out.println(miAcura);
        
        Automovil miMustang= new Automovil();
        miMustang.setMarca("Ford");
        miMustang.setSubMarca("Mustan");
        miMustang.setModelo(2010);
        miMustang.setColor(Color.yellow);
        System.out.println(miMustang);
        
        Automovil miTsuru= new Automovil();
        miTsuru.setMarca("Nissan");
        miTsuru.setSubMarca("Tsuru");
        miTsuru.setModelo(1992);
        miTsuru.setColor(Color.white);
        System.out.println(miTsuru);
        
        Automovil miAltima= new Automovil();
        miAltima.setMarca("Nissan");
        miAltima.setSubMarca("Sedan");
        miAltima.setModelo(2005);
        miAltima.setColor(Color.red);
        System.out.println(miAltima);
        
    }
    
}
