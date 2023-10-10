public class ules3 {
    public static void main(String[] args) {
		int[] arvud = {12,5,10,10,28,17,5,19,0,13,0,22,7,0,17,2,24,1,13,29,0,7,16,8,7,4,27,8,8,23,26,25,15,2,26,1};
		//essa numbri otsimine
		System.out.println("Esimene number: " +arvud[0]);
		//viimase numbri otsimine
		System.out.println("Viimane number: " +arvud[arvud.length-1]);
		//masiiv leidmine
		System.out.println("Arve kokku on: " + arvud.length);
		//arvutad kokku
		int arv = 0;
		for (int i : arvud) {
			arv +=i;
		}
		System.out.println("Masiivis kokku: " +arv);
		//keskmine
		var summa = 0;
		double kokku = arvud.length;
		for(var i = 0; i < arvud.length; i++) {
			summa+= arvud[i];
		}
		//var avg = summa / arvud.length;
		
		System.out.println("Keskmine on: " +summa/kokku);

	int numbrid[][] = {{1,23},{2,15},{3,29},{4,15},{5,26},{6,17},{7,26},{8,15},{9,28},{10,12},{11,24},{12,16},{13,21},{14,10},{15,10},{16,26},{17,27},{18,19},{19,14},{20,14},{21,14},{22,26},{23,20},{24,28},{25,29},{26,11},{27,28},{28,19},{29,25},{30,12}} ;
	for(int c = 0; c < numbrid.length; c++) {
		System.out.println(numbrid[c][1]);
	}
}
}

