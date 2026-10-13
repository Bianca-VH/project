package atividadesMatriz;
import java.util.Scanner;
public class Atv4 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int[][] matriz = new int[2][2];
		
		for(int lin = 0; lin < matriz.length; lin++) {
			for(int col = 0; col < matriz[lin].length; col++) {
				System.out.print("\nDigite os valores: ");
				matriz[lin][col] = tec.nextInt();
			}
		}
		int maiorValor = matriz[0][0];
		int maiorLin = 0;
		int maiorCol = 0;
		
		for(int lin = 0; lin < matriz.length; lin++) {
			for(int col = 0; col < matriz[lin].length; col++) {
				if(matriz[lin][col] > maiorValor) {
					maiorValor = matriz[lin][col];
					maiorLin = lin;
					maiorCol = col;
				}
			}
	}
		System.out.println("-------Valores digitados:-------");
		for(int lin = 0; lin < matriz.length; lin++) {
			for(int col = 0; col < matriz[lin].length; col++) {
				System.out.print(matriz[lin][col] + " ");
		}
			System.out.println();
	}
		System.out.println("\n-------Localização maior valor:-------");
		System.out.println("Maior valor: " + maiorValor);
		System.out.println("Linha: " + (maiorLin) + " Coluna: " + (maiorCol));
 }
}