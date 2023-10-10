import java.util.Scanner;

public class ules20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("sisesta kahendsüsteemi arv: ");
        String kahendsysteemiArv = scanner.nextLine();
        
        int kymnesArv = 0;
        int pikkus = kahendsysteemiArv.length();
        
        for (int i = 0; i < pikkus; i++) {
            char bit = kahendsysteemiArv.charAt(pikkus - 1 - i);
            if (bit == '1') {
                kymnesArv += Math.pow(2, i);
            }
        }
        
        System.out.println("Kümnendsüsteemi arv: " + kymnesArv);
    }
}

