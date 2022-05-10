/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_5_clase_computadora;

/**
 *
 * @author Diana
 */
public class EVA_5_CLASE_COMPUTADORA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        computadora compu1 = new computadora();
        compu1.setMarca("Asus VivoBook");
        compu1.setprocesador("i7");
        compu1.setDiscoduro(256);
        compu1.setMemoram(32);
        compu1.setPrecioneto(20999.00);
        compu1.imprimirDatos();
          System.out.println("Precio total:" + compu1.calcularpreciototal() );  

    }

}

class computadora { //tipos de datos
    
    //atributos - privados
    private String marca;
    private int discoduro;
    private String procesador;
    private int memoram;
    private double precioneto;
    
    //metodos set/get
    public void setMarca(String valor){
        marca = valor;
    }
    public String getMarca (){
        return marca;
    }
    public void setDiscoduro(int valor){
        discoduro = valor;
    }
    public int getDiscoduro (){
        return discoduro;
    }
    public void setprocesador(String valor){
        procesador = valor;
    }
    public String getProcesador (){
        return procesador;
    }
    public void setMemoram(int valor){
        memoram = valor;
    }
    public int getMemoram (){
        return memoram;
    }
    public void setPrecioneto(double valor){
        precioneto = valor;
    }
    public double getPrecioneto (){
        return precioneto;
    }
    
    void imprimirDatos(){
        System.out.println("Marca:" + marca);
        System.out.println("Disco duro:" + discoduro);
        System.out.println("Procesador:" + procesador);
        System.out.println("Memori RAM:" + memoram);
        System.out.println("Precio neto:" + precioneto);
      
    }
    
    //calcular el precio total
    double calcularpreciototal (){
        double PT = precioneto * 0.16;
        return PT;
        
    }
}

