import java.util.Scanner;

public class percobaan3  {

    public static void main(String []args) {
	Scanner x = new Scanner(System.in);

	int angka, b, i, count;
	double avg, total;

	System.out.println("=====PROGRAM LOOP DENGAN CONTINUE=====");
	b=0;
	count=0;

	for (i=0; i<5; i++){
		System.out.print("Masukkan Bilangan : ");
		angka = x.nextInt();

		if (b>=50) continue;
		b+=angka;
		count++;
	}
	total=(double)b;
	System.out.printf("Jumlah Angka Kurang Dari 50 : %.2f \n ", total);
	avg=(double)b/count;
	System.out.printf("Rata-rata Angka Kurang Dari 50 : %.2f \n ", avg);
	
    }
}