import java.util.Scanner;

public class KelilingPersegiPanjang {
    public static void main(String[] args) {
        Scanner Rakhma = new Scanner(System.in);

        int panjang;
        System.out.println("Masukkan Panjang");
        panjang = Rakhma.nextInt();

        int lebar;
        System.out.println("Masukkan Lebar");
        lebar = Rakhma.nextInt();

        int keliling;
        keliling = 2 * panjang+lebar;
        System.out.println("Keliling Persegi Panjang Adalah = " + keliling);


        int loopingNumber = Rakhma.nextInt();
        System.out.println("\n Looping Menggunakan While....");
        int x;
        x=0;
        while (x <= loopingNumber){
            System.out.println(" Angka x = " + x);
            x++;
        }
        




    }

}
