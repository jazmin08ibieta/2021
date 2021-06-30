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
public class Profesor extends Persona{
    private String carrera;
    private int antiguedad;

    public Profesor() {
    }

    public Profesor(String carrera, int antiguedad) {
        this.carrera = carrera;
        this.antiguedad = antiguedad;
    }

    public Profesor(String carrera, int antiguedad, String nomre, int nombre) {
        super(nomre, nombre);
        this.carrera = carrera;
        this.antiguedad = antiguedad;
    }
    

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "carrera=" + carrera + ", antiguedad=" + antiguedad + '}';
    }
    
    public void asistir (){
        System.out.println("checando entrada en sala de firmas");
    }
    
    public void dictarClase(){
        System.out.println("Enseñando programacion en la sala de computo");
    }
}
