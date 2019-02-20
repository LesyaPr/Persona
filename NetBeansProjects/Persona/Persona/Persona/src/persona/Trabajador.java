/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author Lesya
 */
public class Trabajador extends Persona{
    private String segSocial;
    
    public Trabajador(){
        super();
    }
    
    public Trabajador(String nombre, String apellidos, String dni, int edad, String segSocial){
        super(nombre,apellidos,dni,edad);
        this.segSocial=segSocial;
    }

    /**
     * @return the segSocial
     */
    public String getSegSocial() {
        return segSocial;
    }

    /**
     * @param segSocial the segSocial to set
     */
    public void setSegSocial(String segSocial) {
        this.segSocial = segSocial;
    }
    
    
}
