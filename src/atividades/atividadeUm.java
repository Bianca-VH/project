package atividades;

public class atividadeUm {

	public static void main(String[] args) {
		//  Faça um programa que preencha automaticamente (use uma estrutura de repetição) um vetor numérico com 8 posições, conforme abaixo:
		//0 a 7 (999)
		
		int[] numero = new int[8];
		
		for(int i = 0; i < numero.length; i++) {
			numero[i] = 999;
			
			System.out.println(numero[0]);
		}


	}

}