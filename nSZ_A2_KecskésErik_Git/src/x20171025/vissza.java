/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x20171025;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author kecskes_erik
 */
public class vissza {
    
    public static void main(String[] args) {
        File theFile = new File("vissza.txt");
                
        try{
            try(Scanner eyes = new Scanner(theFile)){
                while (eyes.hasNextLine()){
                    String sor = eyes.nextLine();
                    System.out.println(sor);
                    StringBuilder sb = new StringBuilder(sor);
                    System.out.println("visszafelé: " + sb.reverse());
                }
            }
        }catch(FileNotFoundException fnfe) {
            System.out.println("Error: " + fnfe.getMessage());
        }       
    }
}
