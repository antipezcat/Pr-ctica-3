/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Dariana
 */
public class Ejercicio_Jsoup {
    public static void main(String[] args) throws IOException {
    String url;
    Scanner leer = new Scanner(System.in);
    Document  doc = null;
     
    try {
        System.out.println("\nIntroduzca una Url valida,\nFormato aceptado-http://ejemplo.com : ");
        url = leer.nextLine();
        doc = Jsoup.connect(url).get(); 
    } 
    catch (Exception e) {
          
       }  
    Elements lineas = doc.getAllElements();
    Elements parrafos = doc.select("p");
    Elements imagenes = doc.select("img");
    Elements formularios = doc.select("form");
    Elements inputFormularios = doc.select("form input");
          
    System.out.println("Número de lineas: " + lineas.size());
    System.out.println("\nNúmero de parrafos: " +parrafos.size());
    System.out.println("\nNúmero de imagenes: " +imagenes.size());
    System.out.println("\nNúmero de formularios: " +formularios.size());
    System.out.println("\nNúmero de inputs: " +inputFormularios.size());
            
    }
}

