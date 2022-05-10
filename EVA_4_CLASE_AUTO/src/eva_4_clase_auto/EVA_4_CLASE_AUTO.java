/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_4_clase_auto;

/**
 *
 * @author Diana
 */
public class EVA_4_CLASE_AUTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil auto1 = new Automovil();
        auto1.setMarca("Ford");
        auto1.setModelo("Mustang");
        auto1.setTipo("Sedan");
        auto1.setAño(1965);
        auto1.setColor("Negro");
        auto1.setprecio(1167000.00);
        System.out.println("Marca:" + auto1.getMarca());
        System.out.println("Modelo" + auto1.getModelo());
        System.out.println("Año:" + auto1.getAño());
    }

}

class Automovil { //tipos de datos abstractos

    //atributos - privados
    private String marca;
    private String modelo;
    private String tipo;
    private int año;
    private String color;
    private double precio;

    //comportamiento
    //metodos set/get
    public void setMarca(String valor) {
        marca = valor;
}
    public String getMarca (){
        return marca;
    }
    public void setModelo (String valor){
        modelo =valor;
    }
    public String getModelo (){
        return modelo;
    }
    public void setTipo (String valor){
        tipo =valor;
    }
    public String getTipo (){
        return tipo;
    }
    public void setAño (int valor){
        año = valor;
    }
    public int getAño (){
        return año;
    }
    public void setColor (String valor){
        color = valor;
    }
    public String getColor (){
        return color;
    }
    public void setprecio (double valor){
        precio = valor;
    }
    public double getprecio (){
        return precio;
    }
           
}
