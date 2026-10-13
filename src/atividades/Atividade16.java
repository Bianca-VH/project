package atividades;
import java.util.Scanner;
public class Atividade16 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String[] nome = new String[5];
		String[] time = new String[5];
		int[] idade = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Digite o nome "+(i+1)+": ");
			nome[i] = tec.nextLine();
			System.out.print("Digite a idade "+(i+1)+": ");
			idade[i] = tec.nextInt();
			tec.nextLine();
			System.out.print("O time favorito "+(i+1)+": ");
			time[i] = tec.nextLine();
		}
		
		int mVel = idade[0];
		String nomeVel = nome[0];
		String timeVel = time[0];
		
		int mNovo = idade[0];
		String nomeNovo = nome[0];
		String timeNovo = time[0];
		
		for(int i = 1; i < 5; i++) {
			if(idade[i] > mVel) {
				mVel = idade[i];
				nomeVel = nome[i];
				timeVel = time[i];
			}
			if(idade[i] < mNovo) {
				mNovo = idade[i];
				nomeNovo = nome[i];
				timeNovo = time[i];
			}
			
		}
		
		System.out.println("\n----- ALUNO MAIS VELHO -----");
		System.out.print("Nome: " + nomeVel + "| Idade: " + mVel + " | Time: " + timeVel);
		System.out.println("\n----- ALUNO MAIS NOVO -----");
		System.out.print("Nome: " + nomeNovo + "| Idade: " + mNovo + " | Time: " + timeNovo);
	}

}