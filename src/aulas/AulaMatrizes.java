package aulas;
import java.util.Scanner;
public class AulaMatrizes {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int[][] matriz = new int[2][2];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; i < matriz[i].length; j++) {
			System.out.print("Informe o valor: ");
					matriz[i][j] = tec.nextInt();
			}
			System.out.println();
		}

	}

}