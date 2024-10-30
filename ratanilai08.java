import java.util.Scanner;

public class ratanilai08 {
    public static void main (String []args) {

        Scanner sc = new Scanner (System.in);

        float nilai, total, rata;
        int i, j;

        i=1;
        while (i<=5) {
            total=0;
            System.out.println("Input nilai mahasiswa ke-" + i);
            for (j=1; j<=5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilai=sc.nextFloat();
                total+=nilai;
            }
            rata = total/5;
            System.out.println("Rata-rata nilai mahasiswa ke-" + i + " adalah " + rata);
            i++;
        }
    }
}