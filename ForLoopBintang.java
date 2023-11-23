public class ForLoopBintang {
    public static void main(String[] args) {
        String nama;
        int a = 5;
        int k = 1;

        nama = "Ini Bintang Altaf Muhammad Hermansyah";

        System.out.println(nama + "\n");

        for (int b = 1 ; b <= a ; b++){
            for (int c = 1 ; c <= a ; c++){
                System.out.print("*");;
            }
            System.out.println();
        }
        System.out.println();

        for (int s = 1 ; s <= a ; s++){
            for (int j = 1 ; j <= s ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int s = 5 ; s >= k ; s--){
            for (int j = 1 ; j <= s ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}