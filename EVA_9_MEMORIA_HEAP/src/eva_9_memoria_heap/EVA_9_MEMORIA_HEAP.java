/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_9_memoria_heap;

/**
 *
 * @author Diana
 */
public class EVA_9_MEMORIA_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i =5; 
        prueba obj1 = new prueba();
        System.out.println(obj1);
        System.out.println(obj1.valor);
        prueba obj2 = new prueba();
        System.out.println(obj2);
        System.out.println(obj2.valor);
        obj2 = null; //elimino la referencia, el garbage colector lo elimina
        //cuando no eliminan objetos y no se usan en el programa --> fuga de memoria (memory leak)
        System.out.println(obj2.valor);
    }
    
    
}

class prueba {
    int valor =100;
    
}