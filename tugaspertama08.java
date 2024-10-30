import java.util.Scanner;

public class tugaspertama08 {
    public static void main (String []args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.print( n + " " );
        }

        System.out.println();

        for (int i=1; i<=n-2; i++){
            for (int j=1; j<=n; j++) {
                if (j==1 || j==n) {
                    System.out.print( n + " " );
                }
                else {
                    System.out.print( "  " );
                }
            } System.out.println();
        }

        for (int i=1; i<=n; i++) {
            System.out.print( n + " " );
        }

    }
}