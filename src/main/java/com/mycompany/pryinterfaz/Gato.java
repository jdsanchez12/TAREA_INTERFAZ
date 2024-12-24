/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pryinterfaz;

/**
 *
 * @author HP
 */
public class Gato implements Mamifero{

    @Override
    public void Amamantar() {
        System.out.println("El gato amamanta a sus gatitos.");       
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau, Miau");       
    }
    
}
