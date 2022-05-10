/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_7_memoria;

/**
 *
 * @author Diana
 */
public class EVA_7_MEMORIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 5;
        String cade= "hola";
        prueba obj = new prueba();
        
        System.out.println("valor=" + valor);
        System.out.println("Cadena=" + cade);
        System.out.println("Objeto=" + obj);
    }
    
}
 
class prueba {
    public int x =100;
    public void saludar (){
        System.out.println("Hola mundo!!!");
    }
}