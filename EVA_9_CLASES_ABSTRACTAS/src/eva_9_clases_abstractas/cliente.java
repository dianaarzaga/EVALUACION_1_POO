/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_9_clases_abstractas;

/**
 *
 * @author Diana
 */
public class cliente extends persona{
  private String RFC;

    public cliente() {
    }

    public cliente(String RFC, String nombre, int edad) {
        super(nombre, edad);
        this.RFC = RFC;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
  
    
    @Override
    public void mostrarDatos() {
        System.out.println("Nombre:" + getNombre());
        System.out.println("Edad:" + getEdad());
        System.out.println("RFC:" + RFC);
    }
    
}
