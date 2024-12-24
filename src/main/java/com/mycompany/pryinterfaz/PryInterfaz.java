/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pryinterfaz;

/**
 *
 * @author HP
 */
public class PryInterfaz {

    public static void main(String[] args) {
       Perro perro=new Perro();
       Gato gato=new Gato();
       
        System.out.println("_____PERRO__________");
        perro.hacerSonido();
        perro.Amamantar();
        
        System.out.println("______GATO___________");
        gato.hacerSonido();
        gato.Amamantar();
    }
}
