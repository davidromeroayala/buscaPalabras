/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iodatos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class Archivo {
 private File f=null;
 private FileWriter fw=null;
 private PrintWriter escribir=null;

    public Archivo() {
        //apunta archivo
    f=new File("resultado.txt");
//comprobamos si existe
    if(!f.exists()){
        try {
            f.createNewFile();
        } catch (IOException ex) {
            System.out.println("No se encuentra el archivo de texto donde se guarda el resultado");
        }
    }
         
    }
 
 
 

    
}
