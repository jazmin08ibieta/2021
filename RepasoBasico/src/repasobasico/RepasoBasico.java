/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasobasico;

import ico.Fes.dispositivos.SmartPhone;

/**
 *
 * @author ibiet
 */
public class RepasoBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        SmartPhone cel1 = new SmartPhone("Samsung");
        SmartPhone cel2 = new SmartPhone("Huawei", "P40", "Gris", 5.5f);
        SmartPhone cel3= new SmartPhone("Apple", "iPhone 8 plus");
        SmartPhone cel4 =  new SmartPhone();
        System.out.println(cel1);
        System.out.println(cel2);
        
        
        //Uso de metodo de acceso.
        
        cel1.setModelo("galaxy Note 10");
        System.out.println(cel1);
        
        System.out.println("Marca del cel:" +cel1.getMarca());
        
        //uso de un atributo no portegido
        //cel1.tamanio=626.5f; //rompe con la logica del negocio (la vida real)
    }
    
}
