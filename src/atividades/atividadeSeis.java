package atividades;
import java.util.Scanner;
public class atividadeSeis {

	public static void main(String[] args) {
		// Desenvolva um programa que leia 10 números inteiros e guarde-os em um vetor.
		//Mostre quais são os números pares que foram digitados e em que posições eles estão armazenados.
		Scanner tec = new Scanner(System.in);
		
		int[] vet = new int[10];
		
		for(int i=0;i<=9; i++) {
			System.out.print("Digite o "+(i+1)+"º número: ");
			vet[i] = tec.nextInt();
			}
		for(int i=0;i<=9; i++) {
			if(vet[i]%2==0) {
				System.out.println("Posição " + i + " - número: " +vet[i]);
			}
		}
	}

}