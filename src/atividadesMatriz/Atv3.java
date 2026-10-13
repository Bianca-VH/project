package atividadesMatriz;
import java.util.Scanner;
public class Atv3 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int[][] matriz = new int[4][4];
		for(int lin = 0; lin < matriz.length; lin++) {
			for(int col = 0; col < matriz[lin].length; col++) {
				matriz[lin][col] = lin * col;
			}
		}
		System.out.println("Resultado obtido:");
		for(int lin = 0; lin < matriz.length; lin++) {
			for(int col = 0; col < matriz[lin].length; col++) {
				System.out.print(matriz[lin][col] + " ");
			}
			System.out.println();
		}
	}
}