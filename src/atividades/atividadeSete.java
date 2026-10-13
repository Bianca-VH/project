package atividades;
import java.util.Scanner;
public class atividadeSete {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int[] vet = new int[10];
		int soma = 0; //vairável para soma


		for(int i=0; i<=9; i++) {
			System.out.print("Digite um número inteiro "+(i+1)+":");
			vet[i] = tec.nextInt();
		}
		for(int i=0; i<=9; i++) {
			soma += vet[i];
		}
		System.out.println("O resultado da soma dos valores é: " + soma);
	}
}