import java.util.Scanner;


public class ules5 {

        public static void main(String[] args) {
            
            int guess = 0;
            while(guess < 3) {
            
            Scanner scanner = new Scanner (System.in); //kasutaja sisestus
            System.out.print("Sisesta esimene arv: ");
            int arv1 = scanner.nextInt();
            System.out.print("Sisesta teine arv: ");
            int arv2 = scanner.nextInt();
            double jaga = (float)arv1/(float)arv2; //jagab ara numbrid omavahel
            guess +=1;
            jagamine(arv1,arv2);
            }
        }
        
        static void jagamine(float a, float b) {
            if(a >= 0 && b > 0) {
                float jaga = a/b;
                System.out.println(jaga);
                
            }
            else {
                System.out.println("Error");
            }
        }
    }
