package atividades;
import java.util.Scanner;
public class atividadeDez {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int[] num = new int[10];
       	int qtdPares = 0, qtdImpares = 0;


       System.out.println("Digite 10 números inteiros:");
       for (int i = 0; i < num.length; i++) {
           System.out.print("Número " + (i + 1) + ": ");
           num[i] = tec.nextInt();
          


           if (num[i] % 2 == 0) {
               qtdPares++;
           } else {
        	   qtdImpares++;
           }
       }


       double perPares = (qtdPares / 10.0) * 100;
       double perImpares = 100.0 - perPares;


       System.out.printf("Percentual de números pares: %.2f%%\n", perPares);
       System.out.printf("Percentual de números ímpares: %.2f%%\n", perImpares);
	}
}