package atividades;
import java.util.Scanner;
public class atividadeOito {
	public static void main(String[] args) {
		//Crie um programa que leia as notas de uma turma de 10 alunos
		//Guarde-as em um vetor, calcule a média da turma e conte quantos alunos obtiveram nota acima desta média calculada
		//Escrever a média da turma e o resultado da contagem.
		Scanner tec = new Scanner(System.in);
		
		double[] notas = new double[10];
		double soma = 0;
		
		//entrada das informações
		System.out.println("Digite as notas dos alunos:");
		for(int i=0; i<=9; i++) {
			System.out.print("Aluno "+(i+1)+": ");
			notas[i] = tec.nextInt();
			soma += notas[i];
		}
		
		//calcular a média
		double media = soma/10;
		int acimaMedia = 0;
		for(int i=0; i<=9; i++) {
			if(notas[i] > media) {
				acimaMedia++;
			}
		}
		
	       System.out.printf("Média: %.2f%n", media);
	       System.out.println("Quantidade de valores acima da média: " + acimaMedia);
	}
}