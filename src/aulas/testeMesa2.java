package aulas;
import java.util.Scanner;
public class testeMesa2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] m = new int[3][3];
		int somaL = 0, somaC = 0, maiorC = 0, indice = 0;
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				System.out.println("Digite um valor: ");
				m[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				somaL += m[i][j];
			}
			System.out.println("Soma da linha " + i + ": " + somaL);
			somaL = 0;
		}
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				somaC += m[j][i];
			}
			if(maiorC < somaC) {
				maiorC = somaC;
				indice = i;
			}
			somaC = 0;
		}
		System.out.println("Índice da coluna com maior somatório");
	}
}