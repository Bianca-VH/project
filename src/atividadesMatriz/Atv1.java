package atividadesMatriz;
import java.util.Scanner;
public class Atv1 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int[][] matriz = new int[4][4];
		int qtd = 0;
		
		for(int lin = 0; lin < matriz.length; lin++) {
			for(int col = 0; col < matriz[lin].length; col++) {
				System.out.print("Informe o valor: ");
				matriz[lin][col] = tec.nextInt();

				if(matriz[lin][col] > 10) {
					qtd++;
				}
			}
		}
		System.out.print("Há " +qtd+" valores maiores que 10.");
	}
}