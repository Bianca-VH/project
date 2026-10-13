package atividades;
import java.util.Arrays;
import java.util.Scanner;
public class atividadeTreze {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int[] gabarito = {2, 4, 6, 8, 10, 12};
		int[] aposta = new int[10];
		int acertos = 0;
		
		System.out.println("Digite os 10 números para sua aposta: ");
		for(int i=0; i < 10; i++) {
			System.out.print((i+1)+"º número: ");
			aposta[i] = tec.nextInt();
		}
		
		for(int i=0; i<10; i++) {
			for(int j = 0; j<6; j++) {
				if(aposta[i] == gabarito[j]) {
					acertos++;
					break;
				}
				}
			}
		
		System.out.println("\n---- GABARITO ----");
		System.out.println("Os números sorteados são: "+Arrays.toString(gabarito));//serve pra pegar os números dentro do vetor e mostrar eles em texto legível
		System.out.println("\nVocê acertou " + acertos + " número(s)!");
	}
}