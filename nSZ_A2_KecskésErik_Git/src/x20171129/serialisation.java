package x20171129;

import x20171108.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author kecskés_erik
 */

class Tanulo implements Serializable{
    String nev;
    Integer kor;
}

public class serialisation {
    
    private static void make() throws IOException{
        
        Tanulo sanyi = new Tanulo();
        sanyi.nev = "Rúzsa Sándor";
        sanyi.kor = 160;

        Tanulo mari = new Tanulo();
        mari.nev = "Kiss Mária";
        mari.kor = 40;
        
        Tanulo tibi = new Tanulo();
        tibi.nev = "Nagy Tibor";
        tibi.kor = 30;
    
    
        FileOutputStream fos = new FileOutputStream("adat.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(sanyi);
        oos.writeObject(mari);
        oos.writeObject(tibi);
        
        oos.close();
    }
    
    private static void load() throws IOException, ClassNotFoundException{
        Tanulo egy = new Tanulo();
        Tanulo kettő = new Tanulo();
        Tanulo három = new Tanulo();
        
        FileInputStream fis = new FileInputStream("adat.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        egy = (Tanulo) ois.readObject();
        kettő = (Tanulo) ois.readObject();
        három = (Tanulo) ois.readObject();
        
        ois.close();
        
        System.out.println("adat1: " + egy.nev);
        System.out.println("adat2: " + egy.kor);
        
        System.out.println("adat1: " + kettő.nev);
        System.out.println("adat2: " + kettő.kor);
        
         System.out.println("adat1: " + három.nev);
        System.out.println("adat2: " + három.kor);
    }
    
    
    
        public static void main(String[] args) throws IOException, ClassNotFoundException{
        make();
        load();
    }
    
}
