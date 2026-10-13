package atividadesMatriz;
public class Atv2 {

	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		
		for(int lin = 0; lin < matriz.length; lin++) {
			for(int col = 0; col < matriz[lin].length; col++) {
				if(lin == col) {
					matriz[lin][col] = 1;
				}else {
					matriz[lin][col] = 0;
				}
			}
		}
		for(int lin = 0; lin < matriz.length; lin++) {
			for(int col = 0; col < matriz[lin].length; col++) {
				System.out.print(matriz[lin][col] + " ");
			}
			System.out.println();
		}
	}
}