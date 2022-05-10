/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_3_mod_acceso;

/**
 *
 * @author Diana
 */
public class EVA_3_MOD_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona per1 = new persona(); //instanciar (crear objeto)
        per1.setId("001112233");
        per1.setNombre("Diana");
        per1.setEdad(18);
        System.out.println("Nombre:" + per1.getNombre());

        persona per2 = new persona();
        per2.setId("21550301");
        per2.setNombre("Jaqueline");
        per2.setEdad(20);
        System.out.println(per2.getNombre() + " , " + per2.getId());

    }

}

class persona {

    //atributos (variables)- propiedades
    private String id;
    private String nombre;
    private int edad;
    //comportamiento (metodos)
    //para leer y modificar los atributos, usamos metodos de lectura/escritura

    //Leer -->Get
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    ///Asignar --> set
    public void setId(String valor) {
        id = valor;
    }

    public void setNombre(String valor) {
        nombre = valor;
    }

    public void setEdad(int valor) {
        edad = valor;
    }
}
