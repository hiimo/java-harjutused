public class ul17 {
    public static void main(String[] args) {
        //arvud mis pidid olema
        int[] arvud = {3, 5, 4, 12, 5};
        
        System.out.print("\nPaarisarvud: ");
        for (int arv : arvud) {
            if (arv % 2 == 0) {
                System.out.print(arv + " ");
                //jagas integeris olevad arvud kahega
            }
        }
    }
}
