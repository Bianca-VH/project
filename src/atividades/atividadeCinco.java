package atividades;
import java.util.Scanner;
public class atividadeCinco {

	public static void main(String[] args) {
		// Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. 
		// No final, mostre uma listagem com todos os nomes informados, na ordem inversa daquela em que eles foram informados.
		Scanner tec = new Scanner(System.in);
		
		String nome;
		String[] vet = new String[7];
		
		for(int i=0; i<=6; i++) {
			System.out.println("Digite um nome " +(i+1)+":");
			vet[i] = tec.nextLine();
		}
		System.out.println("\nNomes:");
		for(int i = vet.length - 1; i >=0; i--) {
			System.out.println(vet[i]);
		}
	}

}