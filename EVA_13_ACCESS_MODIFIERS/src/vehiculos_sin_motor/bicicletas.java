/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos_sin_motor;

import eva_13_access_modifiers.automovil;

/**
 *
 * @author Diana
 */
public class bicicletas {
    private int rodada;
    private String marca;
    private double precio;

    public int getRodada() {
        automovil micarro = new automovil();
        //micarro. no puedo usar metodo default imprimirmensaje()
        //carreta mi carreta = new carreta();
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
