import java.util.Scanner;




public ules4 Main {
    
    public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in); //kasutaja sisestus
		System.out.print("Sisesta oma nimi: "); 
		String nimi = scanner.nextLine(); //lisab sisestuse
		System.out.print("Sisesta oma vanus: "); 
		int vanus = scanner.nextInt(); //lisab sisestuse
		 
		System.out.println("Tere "+nimi.toUpperCase()+", "+vanus+"!"); //nimi ja vanus
		System.out.println("S�nas on "+nimi.length()+" tahemarki"); //mitu tahte
		
		//sonad 
        int count = 1;

        for (int i = 0; i < nimi.length(); i++) 
        {
            if (nimi.charAt(i) == ' ') // kui on tyhik sees siis paneb +1 sonale juurde 
            {
                count++; // loetab kokku
            } 
        }

        System.out.println("Sonasi kokku = " + count); // valjastab mitu sona on nimes
		
        String esimene[] = nimi.split(" ", 2);
        System.out.printf("Esimene sona: %s",esimene);
        
        scanner.close();
	}

}
