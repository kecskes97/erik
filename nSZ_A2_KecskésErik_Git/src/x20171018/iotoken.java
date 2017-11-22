package x20171018;
/**
 * @author Kecskés Erik
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class iotoken {
    public static void main(String[] args) {

        int sum = 0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek több egész számot vesszővel elválasztva!");
        String sor = sc.nextLine(); // sor beolvasása

        // darabolás
        StringTokenizer st = new StringTokenizer(sor,","); // elválasztójel a vessző!
        int db = st.countTokens(); //adatok (tokenek) száma
        while (st.hasMoreTokens()) {
            sum += Integer.parseInt(st.nextToken());
        }
        System.out.println("A beolvasott számok (" + db + " db) összege: " + sum);
    }
}