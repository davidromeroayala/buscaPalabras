/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscapalabras;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Resultado {
    private  ArrayList<Palabra>vPalabras;

    public Resultado() {
    vPalabras=new ArrayList();
    }
    
    public void añadir(String x) {
        Palabra palabra=new Palabra(x);
        vPalabras.add(palabra);
    }
    
}
