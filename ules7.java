import java.util.Scanner;


public class ules7 {
    public static void main(String[] args) {
        while (1==1) {
            try {
            Scanner Scanner = new Scanner(System.in);
            System.out.print("essa arv: ");
            double arv = Scanner.nextInt();


            System.out.print("teine arv: ");
            double arv2 = Scanner.nextInt();

            double arvutamine = arv*arv2-arv;
            System.out.print(arvutamine);
            break;
        }
            catch (Exception e) {
                System.out.println("pane number");
            }

    }
    }
    } 
