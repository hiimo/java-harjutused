import java.util.Scanner;

public class ules8 {
    public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);

		System.out.print("kuup ruumala (1) \nristtahukas ruumala (2) \nsilindri ruumala (3)\nvali asi: "); 
		String valik = scanner.next();
		String korgus;
		String alus;
		String pikkus;
		String laius;

		
		double s ;
		switch (Integer.parseInt(valik)) {
		case 1:
			System.out.print("sisesta pikkus: ");
			pikkus = scanner.next();
			s = pindala.kuup(pikkus);

			System.out.printf("kuubi ruumala on %.2f ",s);
			break;
		case 2:
			System.out.print("sisesta pikkus: ");
			pikkus = scanner.next();
			System.out.print("sisesta laius: ");
			laius = scanner.next();
			System.out.print("sisesta korgus: ");
			korgus = scanner.next();
			s = pindala.risttahukas(pikkus, laius, korgus);
			System.out.printf("risttahuka ruumala on %.2f ",s);
			break;
		case 3:
			System.out.print("sisesta korgus: ");
			korgus = scanner.next();
			System.out.print("sisesta raadius: ");
			alus = scanner.next();
			s = pindala.silinder(alus, korgus);
			System.out.printf("silindri ruumala on %.2f ",s);
			break;

		default:
			System.out.print("ei saanud aru mis valisid");
			break;
		}

	}

}
