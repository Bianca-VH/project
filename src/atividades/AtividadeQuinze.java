package atividades;
import java.util.Random;
import java.util.Scanner;
public class AtividadeQuinze {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		Random rand = new Random();
		int[] num = new int[30];
		int contador = 0;
		
		for(int i = 0; i< num.length; i++) {
			num[i] = rand.nextInt(15)+1;
		}
		System.out.print("Digite um número (entre 1 e 15): ");
		int chave = tec.nextInt();
		System.out.print("O número foi encontrado nas posições: ");
		for(int i = 0; i < num.length; i++) {
			if(num[i] == chave) {
				System.out.print(i+" ");
				contador++;
			}
		}
		System.out.println();
		System.out.println("Quantidade de vezes que o número foi sorteado: " + contador);
	}
}