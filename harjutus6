import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class ules6 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();

		while(1==1) {
		Scanner Scanner =new Scanner (System.in);
		
        
		System.out.print("sisesta arv: ");
		String vastus = Scanner.nextLine();
		if (vastus == "") {
			System.out.println("sinu list: " + list);
			break;
		}
		else {
			list.add(Integer.parseInt(vastus));
		}


		
		}
		System.out.println("masiivis kokku: " +summa(list));
		System.out.println("keskmine: " +keskmine(list));
		File minuFail = new File("hhh.txt");
		try {
		BufferedWriter bw = new BufferedWriter(new FileWriter(minuFail));
		bw.write("arvud: " +list);
		bw.write("keskmine: " +keskmine(list));
		bw.write("kokku: " +summa(list));
		bw.close();
		System.out.println("fail tehtud");
		 } catch (IOException e) {
			 e.printStackTrace();
			 }
			 }


	

	public static int summa(ArrayList <Integer> b) {
		int summa = 0;
		for (int i : b) {
			summa +=i;
		}
		return summa;
				
	}
	public static int keskmine(ArrayList <Integer> a) {
		int kesk = summa(a)/a.size();
		return kesk;
	}
	

}
