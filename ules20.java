import java.util.Scanner;

public class ules20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("sisesta kahendsüsteemi arv: ");
        String kahendsysteemiArv = scanner.nextLine();
        
        int kymnesArv = 0;
        int pikkus = kahendsysteemiArv.length();
        //kui i on 0 ja kui see on vaiksem kui pikkus siis lisab 1 nii kaua kuni see ei ole
        for (int i = 0; i < pikkus; i++) {
            char bit = kahendsysteemiArv.charAt(pikkus - 1 - i);
            if (bit == '1') {
                kymnesArv += Math.pow(2, i);
                // siin astendatakse 2-ga kuni i-ni valja
            }
        }
        
        System.out.println("Kümnendsüsteemi arv: " + kymnesArv);
    }
}

