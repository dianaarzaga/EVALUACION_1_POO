/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_15_formulas_temp;

import java.util.Scanner;

/**
 *
 * @author Diana
 */
public class EVA_15_FORMULAS_TEMP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner variable = new Scanner(System.in);
        //CENTIGRADOS
        System.out.println("Introduce los grados ºC:");
        double C = variable.nextDouble();
        double Fa = formulas.CAF(C);
        System.out.println(C + "ºC --> ºF:" + Fa);
        double Ke = formulas.CAK(C);
        System.out.println(C + "ºC --> ºK:" + Ke);
        // FAHRENHEIT
        System.out.println("Introduce los grados ºF:");
        double F = variable.nextDouble();
        double Ce = formulas.FAC(F);
        System.out.println( F + "ºF --> ºC:" + Ce);
        double Kel = formulas.FAK(F);
        System.out.println(F + "ºF --> ºK:" + Kel);
        //KELVIN
        System.out.println("Introduce los grados ºK:");
        double K = variable.nextDouble();
        double Cen = formulas.KAC(K);
        System.out.println(K + "ºK --> ºC:" + Cen);
        double Far = formulas.KAF(K);
        System.out.println(K + "ºK --> ºF:" + Far);

    }

}

class formulas {
    //Grados C--> F

    public static double CAF(double C) {
        return C * 1.8 + 32;
    }
    public static double CAK (double C){
        return C + 273.5;
    }
    public static double FAC (double F){
        return (F - 32) * 5 / 9;
    }
    public static double FAK (double F){
        return ((F - 32)*5)/9 + 273.15;
    }
    public static double KAC (double K){
        return K - 273.15;
    }
    public static double KAF (double K){
        return (K - 273.15) * 9 / 5 + 32;
    }
}
