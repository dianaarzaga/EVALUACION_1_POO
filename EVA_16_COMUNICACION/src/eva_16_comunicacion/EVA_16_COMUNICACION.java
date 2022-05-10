/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_16_comunicacion;

/**
 *
 * @author Diana
 */
public class EVA_16_COMUNICACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CLASE_A objA = new CLASE_A();
        CLASE_B objB = new CLASE_B();
        objA.setValorA(100);
        objB.setValorB(objA.getValorA());
        System.out.println("Valor A:" + objA.getValorA());
        System.out.println("Valor B:" + objB.getValorB());
    }
    
}

class CLASE_A{
    private int valorA;

    //Interfaz / mensajes
    public int getValorA() {
        return valorA;
    }

    public void setValorA(int valorA) {
        this.valorA = valorA;
    }
    
    
}

class CLASE_B{
    private int valorB;

    public int getValorB() {
        return valorB;
    }

    public void setValorB(int valorB) {
        this.valorB = valorB;
    }
    
    
}