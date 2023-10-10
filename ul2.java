public class ul2 {
    public static void main(String[] args) {
		//tolli number
		System.out.println(tollidmeeter(15));
		//eelips pindala
		System.out.println(pindala(7,10));
		//aja number
		System.out.println(aeg(125));
		//sportlase kiiruse number
		double sportlane1 = kiirus(11, 1);
		double sportlane2 = kiirus(20, 1);
		//sportalse vahe number
		System.out.println(kiirusteVahe(sportlane1, sportlane2));
	}

	//teisendab tolli meetriks
	static double tollidmeeter(int t) {
		double m = t * 0.0254;
		return m;
		
	}
	
	//eelipsi pindala
	static double pindala(int a,int b) {
		double n = Math.PI * a * b;
		double x = Math.round(n*100.0)/100.0;
		System.out.println("Ellipsi pindala on "  + x);
		return x;
		
	}
	
	//teisendab minutid tundiks ja tunnid minutiks
	static double aeg(int t) {
		int tteisendamine = t / 60;
		int mteisendamine = t % 60;
		System.out.println("Tundi " + tteisendamine + " " + "Minutid " + mteisendamine);
		return tteisendamine;
	}
	
	//sportlase kiirus kiirus= dist/aeg
	static double kiirus(int d, int a) {
		double k = d/a;
		return k;
	}
	
	//kiiruse vahe
	static double kiirusteVahe(double a1, double a2) {
		double vahe = Math.abs(a1-a2);
		return vahe;
	}
}

