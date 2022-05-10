/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_10_copia_objetos;

/**
 *
 * @author Diana
 */
public class EVA_10_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        prueba obj1 = new prueba();
        System.out.println("Direccion:" + obj1);
        obj1.x = 100;
        System.out.println("valor de x en obj1=" + obj1.x);
        //prueba respaldo = obj1;
        prueba respaldo = new prueba ();
        respaldo.x = obj1.x;
        System.out.println("valor de x en respaldo=" + respaldo.x);
        //modificp el respaldo
        respaldo.x = 0;
        System.out.println("valor de x en obj1 =" + obj1.x);
        System.out.println("valor de x en respaldo=" + respaldo.x);
        //imprimir direcciones de memoria
        System.out.println("obj1 =" + obj1);
        System.out.println("respaldo=" + respaldo);
        if (obj1 == respaldo)
            System.out.println("son el mismo objeto");
        else
            System.out.println("son objetos diferentes");
    }
    
}

class prueba {
    public int x;
    
}