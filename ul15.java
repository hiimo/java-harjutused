import java.util.Scanner;

public class ul15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("sisesta isikukood: ");
        String isikukood = scanner.next();
        //kui isikukood on 11 tahte siis vota 1 number
        if (isikukood.length() == 11) {
            int esimeneNumber = Integer.parseInt(isikukood.substring(0, 1));

            //sugu, jagab 2 kui on paaris siis on naine, paaritu mees
            String sugu;
            if (esimeneNumber % 2 == 0) {
                sugu = "naine";
            } else {
                sugu = "mees";
            }

            //synnikuupaev, aasta on 2,3 nr, kuu 4,5nr , paev 6,7nr
            int aasta = Integer.parseInt(isikukood.substring(1, 3));
            int kuu = Integer.parseInt(isikukood.substring(3, 5));
            int päev = Integer.parseInt(isikukood.substring(5, 7));

            //kontrolli aastat
            if (esimeneNumber == 3 || esimeneNumber == 4) {
                aasta += 1900;
            } else {
                aasta += 2000;
            }

            System.out.println("sugu: " + sugu);
            System.out.println("synnikuupäev: " + päev + "." + kuu + "." + aasta);
        } else {
            System.out.println("vale isikukood pane uus");
        }
    }
    
}
