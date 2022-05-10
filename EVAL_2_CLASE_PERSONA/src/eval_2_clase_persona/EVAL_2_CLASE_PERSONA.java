/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval_2_clase_persona;

/**
 *
 * @author Diana
 */
public class EVAL_2_CLASE_PERSONA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Holaaa mundoo");
        persona estudiante = new persona();
        estudiante.id = "00112233";
        estudiante.nombre ="Diana Arzaga";
        estudiante.edad = 10;   
        estudiante.imprimirDatos();
        //concatenacion --> pegar cadenas de texto
        //"   " + entero/bolleano/string/double/etc --> cadena de texto
        System.out.println("Año de nacimiento:" + estudiante.calcularañonacimiento());
        
        persona estudiante2 =new persona();
        estudiante2.id = "21550004";
        estudiante2.nombre = "Ivan Perez";
        estudiante2.edad = 25;
        estudiante2.imprimirDatos();
        System.out.println("Año de nacimiento:" + estudiante2.calcularañonacimiento());

        
        persona estudiante3 = new persona();
        estudiante3.id = "242651";
        estudiante3.nombre= "Sofia Saenz";
        estudiante3.edad = 18;
        estudiante3.imprimirDatos();
       System.out.println("Año de nacimiento:" + estudiante3.calcularañonacimiento());

              
        /*
        *System.out.println(estudiante.nombre);
        * System.out.println(estudiante2.nombre);
        */
       
       
    }
    
}
 class persona{ //implementacion
     //atributos de la clase
     String id;
     String nombre;
     int edad;
     
    //comportamiento
    //metodo imprimir datos --> metodo/funcion --> f(x) = x + 1
    // valor de retorno + nombre de la funcion (argumentos);
     
    void imprimirDatos(){  //no regresa valor, el nombre es impirmirDatos (no recibe nada)
        System.out.println("El nombre es:" + nombre);
        System.out.println("Su ID es:" + id);
        System.out.println("Su edad es:" + edad);  
    }        
     
     // calcular el año de nacimiento
    int calcularañonacimiento() {  //declaracion
        int añonac = 2022 -edad;
        return añonac;
                
    }
 }