/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio1;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.net.URL;
import java.util.EmptyStackException;
import org.jsoup.safety.Whitelist;


/**
 *
 * @author abollaita
 */
public class Ejercicio_Jsoup {
     public static void main(String[] args) throws IOException {
      String url;
      Scanner leer = new Scanner(System.in);
      Document doc = doc = Jsoup.connect("https://www.google.com").get(); ;
     
    // while(true) {
        //try {

       //  System.out.println("\nIntroduzca una Url valida,\nFormato aceptado-http://ejemplo.com : ");
        // url = leer.nextLine();
        // doc = Jsoup.connect(url).get(); 

           // ...
       //} catch (IllegalArgumentException e) {
          // System.err.println("Url Invalido, formato no aceptado");
       //}
     //}
     
      
     
          System.out.println(doc.html());
           
           
            
           Elements parrafos = doc.select("p");
           Elements imagenes = doc.select("img");
           Elements formularios = doc.select("form");
           Elements inputFormularios = doc.select("form input");
            
           
          // System.out.println(inputFormularios.size());
            
    }
}

