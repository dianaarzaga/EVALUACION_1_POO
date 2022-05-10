/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_14_static;

/**
 *
 * @author Diana
 */
public class EVA_14_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        formulasmatematicas misfor = new formulasmatematicas();
        double area = misfor.calcularareacirculo(100);
        System.out.println("Area del circulo:" + area);
        double areat = formulasmatematicas.calcularareatriangulo(100, 50);
        System.out.println("Area del triangulo:" + areat);
        formulasmatematicas miobj = new formulasmatematicas();
        miobj.impirmirmensaje();
        
    }
    
}

class formulasmatematicas{
    static int valor=100;
    //area circulo:
    public static double calcularareacirculo(double radio){
        double area;
        area = 3.1406 * radio * radio;
        return area;
    }
    //area triangulo
    public static double calcularareatriangulo(double base, double altura){
        double area;
        area = (base * altura) / 2.0;
        return area;
    }
    public void impirmirmensaje(){
        System.out.println("Hola mudno!!");
        
        
    }
}