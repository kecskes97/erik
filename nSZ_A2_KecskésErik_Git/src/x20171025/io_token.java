/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x20171025;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Tanulo
 */
public class io_token {
    
     public static void main(String[] args) {

        int sum = 0; 
        int db2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek több egész számot vesszővel elválasztva!");
        String sor = sc.nextLine(); // sor beolvasása

        // darabolás
        StringTokenizer st = new StringTokenizer(sor,","); // elválasztójel a vessző!
        int db = st.countTokens(); //adatok (tokenek) száma
        
         System.out.println("A bevitt adatok: " + sor);
         
        while (st.hasMoreTokens()) {
         try{
            
            sum += Integer.parseInt(st.nextToken());
            db2++;
         
        
        }catch(NumberFormatException ne){
             System.out.println("HIBA" + ne.getMessage().split(":")[1].trim().replace("\"", ""));
        }
         }
        System.out.println("A beolvasott számok (" + db + " db) összege: " + sum);
         System.out.println("Az új db: " + db2);
    }
}
