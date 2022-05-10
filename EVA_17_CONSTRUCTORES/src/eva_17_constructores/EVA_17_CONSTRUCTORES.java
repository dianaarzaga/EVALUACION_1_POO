/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_17_constructores;

/**
 *
 * @author Diana
 */
public class EVA_17_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona per = new persona();
        System.out.println("Nombre:" + per.getNombre());
        System.out.println("Edad:" + per.getEdad());

        persona per2 = new persona();
        System.out.println("Nombre 2:" + per2.getNombre());
        System.out.println("Edad 2:" + per2.getEdad());
        
        persona per3 = new persona ("Diana", 18);
         System.out.println("Nombre 3:" + per3.getNombre());
        System.out.println("Edad 3:" + per3.getEdad());
        
        persona per4 = new persona (5.0);
         System.out.println("Nombre 4:" + per4.getNombre());
        System.out.println("Edad 4:" + per4.getEdad());
    }
    

}

class persona {

    private String nombre;
    private int edad;

    //Constructor default
    // Inicializar valores
    public persona() {
        System.out.println("Creando el objeto");
        nombre = "Jaqueline";
        edad = 100;
    }

    //sobrecarga de metodos
    public persona (String nombre, int edad){
        System.out.println("creando el objeto con constructor que acepta valores");
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public persona (double valor){
        System.out.println("creando el objeto con constructor que acepta valores");
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
