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
public class EVA_9_CLASES_ABSTRACTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //persona per = new persona(); no se puede crear el objeto porque es abstracta
        cliente clie = new cliente("164623", "Sofia", 18);
        clie.mostrarDatos();
    }
    
}

