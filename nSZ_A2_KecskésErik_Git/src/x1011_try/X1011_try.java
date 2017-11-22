
package x1011_try;

import java.util.Scanner;

public class X1011_try {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem az ösztandót: ");
        int osztandó = sc.nextInt();
        System.out.println("Kérem az osztót: ");
        int osztó = sc.nextInt();
        
        boolean sikeres = false;
        double hányados = 0.0;
        
        try {
            hányados = (double)osztandó / (double)osztó;
            System.out.println(osztandó + " / " + osztó + " = " + hányados);
            sikeres = true;
        } catch (ArithmeticException ae) {
            System.out.println("Hiba: " + ae.getMessage());
        }
        finally{
            if (sikeres) {
                System.out.println("Sikeres osztás!");
            }else{
                System.out.println("Sikertelen osztás!");
            }
        }
    }
    
}
